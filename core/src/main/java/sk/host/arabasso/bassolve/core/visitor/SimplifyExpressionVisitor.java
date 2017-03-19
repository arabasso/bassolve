//package sk.host.arabasso.bassolve.core.visitor;
//
//import sk.host.arabasso.bassolve.core.ast.node.*;
//
//import java.lang.reflect.InvocationTargetException;
//
///**
// * Created by arabasso on 04/10/2016.
// *
// */
//public class SimplifyExpressionVisitor extends AstVisitor<ExpressionNode> {
//    private boolean simplified;
//
//    public ExpressionNode simplify(ExpressionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        simplified = false;
//
//        return visit(node);
//    }
//
//    @Override
//    public ExpressionNode visit(ExpressionNode node) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        if (simplified) {
//            return node;
//        }
//
//        return super.visit(node);
//    }
//
//    private ExpressionNode simplify(InfixExpressionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        if (!simplified && node.canSimplify()) {
//            simplified = true;
//
//            return node.simplify();
//        }
//
//        return node.newInstance(visit(node.getLeft()), visit(node.getRight()));
//    }
//
//    @Override
//    public ExpressionNode visit(AdditionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        return simplify(node);
//    }
//
//    @Override
//    public ExpressionNode visit(SubtractionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        return simplify(node);
//    }
//
//    @Override
//    public ExpressionNode visit(MultiplicationNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        return simplify(node);
//    }
//
//    @Override
//    public ExpressionNode visit(PowNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        return simplify(node);
//    }
//
//    @Override
//    public ExpressionNode visit(DivisionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        return simplify(node);
//    }
//
//    @Override
//    public ExpressionNode visit(NegateNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        ExpressionNode innerNode = node.getInnerNode();
//
//        if (innerNode instanceof NumberNode){
//            return new NumberNode(- ((NumberNode)innerNode).getValue());
//        }
//
//        return new NegateNode(visit(innerNode));
//    }
//
//    @Override
//    public ExpressionNode visit(FunctionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        ExpressionNode argumentNode = node.getArgument();
//
//        if (argumentNode instanceof NumberNode){
//            double v = (double)node.getFunction().invoke(null, ((NumberNode)argumentNode).getValue());
//
//            return new NumberNode(v);
//        }
//
//        return new FunctionNode(node.getFunction(), visit(argumentNode));
//    }
//
//    @Override
//    public ExpressionNode visit(ParenthesisNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        ExpressionNode innerNode = node.getInnerNode();
//
//        ExpressionNode expNode = visit(innerNode);
//
//        if (expNode instanceof NumberNode){
//            return expNode;
//        }
//
//        return new ParenthesisNode(expNode);
//    }
//
//    @Override
//    public ExpressionNode visit(NumberNode node) {
//        return new NumberNode(node.getValue());
//    }
//}
