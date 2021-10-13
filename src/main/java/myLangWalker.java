import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;

public class myLangWalker {
    public static class XMLEmitter extends myLangBaseListener {
        ParseTreeProperty<String> json = new ParseTreeProperty<String>();
        String getJson(ParseTree ctx) { return json.get(ctx); }
        void setJson(ParseTree ctx, String s) { json.put(ctx, s); }

        public void exitLang(myLangParser.LangContext ctx) {
            setJson(ctx, getJson(ctx.getChild(0)));
        }

        public void exitAnObject(myLangParser.AnObjectContext ctx) {
            StringBuilder buf = new StringBuilder();
            buf.append("{");
            buf.append("\n");
            for (myLangParser.PairContext pctx : ctx.pair()) {
                buf.append(getJson(pctx)+",\n");
            }
            buf.deleteCharAt(buf.length()-1);
            buf.deleteCharAt(buf.length()-1);
            buf.append("\n");
            buf.append("}");
            setJson(ctx, buf.toString());
        }
        public void exitEmptyObject(myLangParser.EmptyObjectContext ctx) {
            setJson(ctx, "");
        }

        public void exitArrayOfValues(myLangParser.ArrayOfValuesContext ctx) {
            StringBuilder buf = new StringBuilder();
            buf.append("[");
            buf.append("\n");
            for (myLangParser.ValueContext vctx : ctx.value()) {
                buf.append(getJson(vctx));
                buf.append(",\n");
            }
            buf.deleteCharAt(buf.length()-1);
            buf.deleteCharAt(buf.length()-1);
            buf.append("\n]");
            setJson(ctx, buf.toString());
        }

        public void exitEmptyArray(myLangParser.EmptyArrayContext ctx) {
            setJson(ctx, "");
        }

        public void exitPair(myLangParser.PairContext ctx) {
            String tag = ctx.STRING().getText();
            myLangParser.ValueContext vctx = ctx.value();
            String x = tag+": "+ getJson(vctx);
            setJson(ctx, x);
        }

        public void exitObjectValue(myLangParser.ObjectValueContext ctx) {
            setJson(ctx, getJson(ctx.object()));
        }

        public void exitArrayValue(myLangParser.ArrayValueContext ctx) {
            setJson(ctx, getJson(ctx.array())); // String value() {return array();}
        }

        public void exitAtom(myLangParser.AtomContext ctx) {
            setJson(ctx, ctx.getText());
        }

        public void exitString(myLangParser.StringContext ctx) {
            setJson(ctx, ctx.getText());
        }

    }

    public static void main(String[] args) throws Exception {
        String inputFile = "C:\\Projects\\candylang.txt";
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        myLangLexer lexer = new myLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        myLangParser parser = new myLangParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.lang();

        ParseTreeWalker walker = new ParseTreeWalker();
        XMLEmitter converter = new XMLEmitter();
        walker.walk(converter, tree);
        System.out.println(converter.getJson(tree));
    }
}