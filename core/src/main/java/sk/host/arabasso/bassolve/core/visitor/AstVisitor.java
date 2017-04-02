package sk.host.arabasso.bassolve.core.visitor;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import sk.host.arabasso.bassolve.core.ast.node.*;
import sk.host.arabasso.bassolve.core.parser.ExpLexer;
import sk.host.arabasso.bassolve.core.parser.ExpParser;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public abstract class AstVisitor<T>
{
    public abstract T visit(EqualityNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    public abstract T visit(BooleanNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    public abstract T visit(AdditionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    public abstract T visit(SubtractionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    public abstract T visit(MultiplicationNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    public abstract T visit(PowNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    public abstract T visit(DivisionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    public abstract T visit(NegateNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    public abstract T visit(ParenthesisNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    public abstract T visit(FunctionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
    public abstract T visit(NumberNode node);

    public static ExpressionNode visit(String input){
        ANTLRInputStream in = new ANTLRInputStream(input);

        ExpLexer lexer = new ExpLexer(in);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ExpParser parser = new ExpParser(tokenStream);

        ExpParser.CompileUnitContext cst = parser.compileUnit();

        return new BuildAstVisitor().visitCompileUnit(cst);
    }

    @SuppressWarnings("unchecked")
    public T visit(ExpressionNode node) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (T)this.getClass().getMethod("visit", node.getClass()).invoke(this, node);
    }
}
