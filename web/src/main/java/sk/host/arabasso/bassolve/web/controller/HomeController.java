package sk.host.arabasso.bassolve.web.controller;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.host.arabasso.bassolve.core.parser.ExpBaseVisitor;
import sk.host.arabasso.bassolve.core.parser.ExpLexer;
import sk.host.arabasso.bassolve.core.parser.ExpParser;
import sk.host.arabasso.bassolve.core.parser.ExpVisitor;

/**
 * Created by arabasso on 02/10/2016.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        ANTLRInputStream in = new ANTLRInputStream("0.5*x^(x + 10)");

        ExpLexer lexer = new ExpLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ExpParser.EquationContext equation = new ExpParser(tokens).equation();

        ExpVisitor visitor = new ExpBaseVisitor();

        visitor.visit(equation);

        return "index";
    }
}
