package sk.host.arabasso.bassolve.app;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import sk.host.arabasso.bassolve.core.parser.ExpBaseVisitor;
import sk.host.arabasso.bassolve.core.parser.ExpLexer;
import sk.host.arabasso.bassolve.core.parser.ExpParser;
import sk.host.arabasso.bassolve.core.parser.ExpVisitor;

public class Application {
    public static void main(String[] args) {
        ANTLRInputStream in = new ANTLRInputStream("0.5*x^(x + 10)");

        ExpLexer lexer = new ExpLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ExpParser.EquationContext equation = new ExpParser(tokens).equation();

        ExpVisitor visitor = new ExpBaseVisitor();

        visitor.visit(equation);
    }
}
