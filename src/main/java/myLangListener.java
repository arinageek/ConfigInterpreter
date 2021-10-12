// Generated from myLang.g4 by ANTLR 4.0

import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface myLangListener extends ParseTreeListener {
	void enterAnObject(myLangParser.AnObjectContext ctx);
	void exitAnObject(myLangParser.AnObjectContext ctx);

	void enterObjectValue(myLangParser.ObjectValueContext ctx);
	void exitObjectValue(myLangParser.ObjectValueContext ctx);

	void enterEmptyObject(myLangParser.EmptyObjectContext ctx);
	void exitEmptyObject(myLangParser.EmptyObjectContext ctx);

	void enterArrayOfValues(myLangParser.ArrayOfValuesContext ctx);
	void exitArrayOfValues(myLangParser.ArrayOfValuesContext ctx);

	void enterEmptyArray(myLangParser.EmptyArrayContext ctx);
	void exitEmptyArray(myLangParser.EmptyArrayContext ctx);

	void enterString(myLangParser.StringContext ctx);
	void exitString(myLangParser.StringContext ctx);

	void enterLang(myLangParser.LangContext ctx);
	void exitLang(myLangParser.LangContext ctx);

	void enterArrayValue(myLangParser.ArrayValueContext ctx);
	void exitArrayValue(myLangParser.ArrayValueContext ctx);

	void enterPair(myLangParser.PairContext ctx);
	void exitPair(myLangParser.PairContext ctx);

	void enterAtom(myLangParser.AtomContext ctx);
	void exitAtom(myLangParser.AtomContext ctx);
}