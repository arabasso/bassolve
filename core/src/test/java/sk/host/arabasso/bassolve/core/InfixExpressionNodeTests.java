//package sk.host.arabasso.bassolve.core;
//
//import org.junit.Test;
//import sk.host.arabasso.bassolve.core.ast.node.DivisionNode;
//import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;
//import sk.host.arabasso.bassolve.core.ast.node.InfixExpressionNode;
//import sk.host.arabasso.bassolve.core.ast.node.NumberNode;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;
//
///**
// * Created by arabasso on 07/10/2016.
// *
// */
//public class InfixExpressionNodeTests extends ExpressionTests {
//    @Test
//    public void isNumberLeftAndRight(){
//        InfixExpressionNode node = div(1.0, 2.0);
//
//        assertThat(node.isNumberLeftAndRight(), is(true));
//    }
//
//    @Test
//    public void isNumberLeftAndRightWithParenthesis(){
//        InfixExpressionNode node = (InfixExpressionNode)expression("(1) + (2)");
//
//        assertThat(node.isNumberLeftAndRight(), is(true));
//    }
//
//    @Test
//    public void notIsNumberLeftAndRight(){
//        InfixExpressionNode node = div(sub(1.0, 3.0), 2.0);
//
//        assertThat(node.isNumberLeftAndRight(), is(false));
//    }
//
//    @Test
//    public void notIsNumberLeftAndRightWithParenthesis(){
//        InfixExpressionNode node = (InfixExpressionNode)expression("(1 + 1) + (2)");
//
//        assertThat(node.isNumberLeftAndRight(), is(false));
//    }
//
//    @Test
//    public void isNumberAndDivisionNumber(){
//        InfixExpressionNode node = (InfixExpressionNode)expression("1 + 1 / 2");
//
//        assertThat(node.isNumberAndDivisionNumber(node.getLeft(), node.getRight()), is(true));
//    }
//
//    @Test
//    public void isNumberAndDivisionNumberWithParenthesis(){
//        InfixExpressionNode node = (InfixExpressionNode)expression("(1) + (1 / 2)");
//
//        assertThat(node.isNumberAndDivisionNumber(node.getLeft(), node.getRight()), is(true));
//    }
//
//    @Test
//    public void isNumberAndDivisionNumberWithParenthesisDivision(){
//        InfixExpressionNode node = (InfixExpressionNode)expression("1 / (1 / 2)");
//
//        assertThat(node.isNumberAndDivisionNumber(node.getLeft(), node.getRight()), is(true));
//    }
//
//    @Test
//    public void notIsNumberAndDivisionNumber(){
//        InfixExpressionNode node = (InfixExpressionNode)expression("1 / 3 + 1 / 2");
//
//        assertThat(node.isNumberAndDivisionNumber(node.getLeft(), node.getRight()), is(false));
//    }
//
//    @Test
//    public void notIsNumberAndDivisionNumberWithParenthesis(){
//        InfixExpressionNode node = (InfixExpressionNode)expression("(1 + 1) + (1 / 2)");
//
//        assertThat(node.isNumberAndDivisionNumber(node.getLeft(), node.getRight()), is(false));
//    }
//
//    @Test
//    public void canSimplifyLeftAndRightNumbers(){
//        InfixExpressionNode node = div(1.0, 2.0);
//
//        assertThat(node.canSimplify(), is(true));
//    }
//
//    @Test
//    public void canSimplifyNumberAndDivision(){
//        InfixExpressionNode node1 = add(1.0, div(4.0, 2.0));
//        InfixExpressionNode node2 = add(div(4.0, 2.0), 1.0);
//
//        assertThat(node1.canSimplify(), is(true));
//        assertThat(node2.canSimplify(), is(true));
//    }
//
//    @Test
//    public void canSimplifyLeftAndRightDivisions(){
//        InfixExpressionNode node = add(div(4.0, 3.0), div(5.0, 2.0));
//
//        assertThat(node.canSimplify(), is(true));
//    }
//
//    @Test
//    public void cannotSimplifyLeftAndRightDivisionNumbers(){
//        InfixExpressionNode node = sub(div(4.0, div(4.0, 3.0)), div(5.0, div(4.0, 3.0)));
//
//        assertThat(node.canSimplify(), is(false));
//    }
//
//    @Test
//    public void cannotSimplifyAndReturnSameExpression(){
//        InfixExpressionNode node = add(add(1.0, 1.0), 2.0);
//
//        assertThat(node.simplify(), is(equalTo(node)));
//    }
//
//    @Test
//    public void simplifyAdditionLeftAndRightNumberNodes(){
//        InfixExpressionNode node = add(1.0, 2.0);
//
//        assertThat(node.simplify(), is(instanceOf(NumberNode.class)));
//    }
//
//    @Test
//    public void simplifyAdditionNumberAndDivisionNodes(){
//        InfixExpressionNode node1 = add(1.0, div(4.0, 3.0));
//        InfixExpressionNode node2 = add(div(4.0, 3.0), 1.0);
//
//        assertThat(node1.simplify(), is(instanceOf(DivisionNode.class)));
//        assertThat(node2.simplify(), is(instanceOf(DivisionNode.class)));
//    }
//
//    @Test
//    public void simplifySubtractionNumberAndDivisionNodes(){
//        InfixExpressionNode node1 = sub(1.0, div(4.0, 3.0));
//        InfixExpressionNode node2 = sub(div(4.0, 3.0), 1.0);
//
//        assertThat(node1.simplify(), is(instanceOf(DivisionNode.class)));
//        assertThat(node2.simplify(), is(instanceOf(DivisionNode.class)));
//    }
//
//    @Test
//    public void simplifyMultiplicationNumberAndDivisionNodes(){
//        InfixExpressionNode node1 = mul(1.0, div(4.0, 3.0));
//        InfixExpressionNode node2 = mul(div(4.0, 3.0), 1.0);
//
//        assertThat(node1.simplify(), is(instanceOf(DivisionNode.class)));
//        assertThat(node2.simplify(), is(instanceOf(DivisionNode.class)));
//    }
//
//    @Test
//    public void simplifyPowNumberAndDivisionNodes(){
//        InfixExpressionNode node1 = pow(1.0, div(4.0, 3.0));
//        InfixExpressionNode node2 = pow(div(4.0, 3.0), 1.0);
//
//        assertThat(node1.simplify(), is(instanceOf(DivisionNode.class)));
//        assertThat(node2.simplify(), is(instanceOf(DivisionNode.class)));
//    }
//
//    @Test
//    public void simplifyDivisionNumberAndDivisionNodes(){
//        InfixExpressionNode node1 = div(1.0, div(4.0, 3.0));
//        InfixExpressionNode node2 = div(div(4.0, 3.0), 1.0);
//
//        ExpressionNode newNode1 = node1.simplify();
//        ExpressionNode newNode2 = node2.simplify();
//
//        assertThat(newNode1, is(instanceOf(DivisionNode.class)));
//        assertThat(newNode1, is(not(equalTo(node1))));
//        assertThat(newNode2, is(instanceOf(DivisionNode.class)));
//        assertThat(newNode2, is(not(equalTo(node2))));
//    }
//}
