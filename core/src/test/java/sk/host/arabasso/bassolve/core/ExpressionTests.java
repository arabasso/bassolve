package sk.host.arabasso.bassolve.core;

import org.junit.Before;
import sk.host.arabasso.bassolve.core.ast.node.*;
import sk.host.arabasso.bassolve.core.visitor.AstVisitor;
import sk.host.arabasso.bassolve.core.visitor.EvaluateExpressionVisitor;
import sk.host.arabasso.bassolve.core.visitor.PrintExpressionVisitor;
//import sk.host.arabasso.bassolve.core.visitor.SimplifyExpressionVisitor;

/**
 * Created by arabasso on 05/10/2016.
 *
 */
public abstract class ExpressionTests {
    protected PrintExpressionVisitor printVisitor;
    protected EvaluateExpressionVisitor evalVisitor;
    //protected SimplifyExpressionVisitor simplifyVisitor;

    @Before
    public void setUp() throws Exception {
        printVisitor = new PrintExpressionVisitor();
        evalVisitor = new EvaluateExpressionVisitor();
        //simplifyVisitor = new SimplifyExpressionVisitor();
    }

    protected ExpressionNode expression(String input){
        return AstVisitor.visit(input);
    }

    protected AdditionNode add(double left, double right){
        return new AdditionNode(new NumberNode(left), new NumberNode(right));
    }

    protected AdditionNode add(ExpressionNode left, double right){
        return new AdditionNode(left, new NumberNode(right));
    }

    protected AdditionNode add(double left, ExpressionNode right){
        return new AdditionNode(new NumberNode(left), right);
    }

    protected AdditionNode add(ExpressionNode left, ExpressionNode right){
        return new AdditionNode(left, right);
    }

    protected SubtractionNode sub(double left, double right){
        return new SubtractionNode(new NumberNode(left), new NumberNode(right));
    }

    protected SubtractionNode sub(ExpressionNode left, double right){
        return new SubtractionNode(left, new NumberNode(right));
    }

    protected SubtractionNode sub(double left, ExpressionNode right){
        return new SubtractionNode(new NumberNode(left), right);
    }

    protected SubtractionNode sub(ExpressionNode left, ExpressionNode right){
        return new SubtractionNode(left, right);
    }

    protected DivisionNode div(double left, double right){
        return new DivisionNode(new NumberNode(left), new NumberNode(right));
    }

    protected DivisionNode div(ExpressionNode left, double right){
        return new DivisionNode(left, new NumberNode(right));
    }

    protected DivisionNode div(double left, ExpressionNode right){
        return new DivisionNode(new NumberNode(left), right);
    }

    protected DivisionNode div(ExpressionNode left, ExpressionNode right){
        return new DivisionNode(left, right);
    }

    protected MultiplicationNode mul(double left, double right){
        return new MultiplicationNode(new NumberNode(left), new NumberNode(right));
    }

    protected MultiplicationNode mul(ExpressionNode left, double right){
        return new MultiplicationNode(left, new NumberNode(right));
    }

    protected MultiplicationNode mul(double left, ExpressionNode right){
        return new MultiplicationNode(new NumberNode(left), right);
    }

    protected MultiplicationNode mul(ExpressionNode left, ExpressionNode right){
        return new MultiplicationNode(left, right);
    }

    protected PowNode pow(double left, double right){
        return new PowNode(new NumberNode(left), new NumberNode(right));
    }

    protected PowNode pow(ExpressionNode left, double right){
        return new PowNode(left, new NumberNode(right));
    }

    protected PowNode pow(double left, ExpressionNode right){
        return new PowNode(new NumberNode(left), right);
    }

    protected PowNode pow(ExpressionNode left, ExpressionNode right){
        return new PowNode(left, right);
    }
}
