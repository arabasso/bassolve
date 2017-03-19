//package sk.host.arabasso.bassolve.core;
//
//import org.junit.Test;
//import sk.host.arabasso.bassolve.core.ast.node.InfixExpressionNode;
//import sk.host.arabasso.bassolve.core.ast.node.NumberNode;
//
//import java.lang.reflect.InvocationTargetException;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.closeTo;
//import static org.hamcrest.Matchers.equalTo;
//
///**
// * Created by arabasso on 05/10/2016.
// *
// */
//public class SimplifyExpressionExpressionTests extends ExpressionTests {
//    private static final double EPSILON = 0.00001;
//
//    @Test
//    public void simplifyAddition() {
//        InfixExpressionNode node = add(1.0, 2.0);
//
//        assertThat(node.resolve(), closeTo(3.0, EPSILON));
//    }
//
//    @Test
//    public void simplifySubtraction() {
//        InfixExpressionNode node = sub(1.0, 2.0);
//
//        assertThat(node.resolve(), closeTo(-1.0, EPSILON));
//    }
//
//    @Test
//    public void simplifyDivisionBetween2And2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = div(2.0, 2.0);
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("1"));
//    }
//
//    @Test
//    public void simplifyAdditionLeftDivisionBetween4And2Plus3() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = add(div(4, 2), 3);
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("2 + 3"));
//    }
//
//    @Test
//    public void simplifyAdditionRightDivisionPlus3AndBetween4And2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = add(3, div(4, 2));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("3 + 2"));
//    }
//
//    @Test
//    public void simplifySubtractionLeftDivisionBetween4And2Plus3() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = sub(div(4, 2), 3);
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("2 - 3"));
//    }
//
//    @Test
//    public void simplifySubtractionRightDivisionPlus3AndBetween4And2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = sub(3, div(4, 2));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("3 - 2"));
//    }
//
//    @Test
//    public void simplifyMultiplicationLeftDivisionBetween4And2Plus3() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = mul(div(4, 2), 3);
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("2 * 3"));
//    }
//
//    @Test
//    public void simplifyMultiplicationRightDivisionPlus3AndBetween4And2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = mul(3, div(4, 2));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("3 * 2"));
//    }
//
//    @Test
//    public void simplifyAdditionLeftDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = add(div(1.0, 3.0), 1.0);
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 + 1 * 3) / 3"));
//    }
//
//    @Test
//    public void simplifyAdditionRightDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = add(1.0, div(2.0, 3.0));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 * 3 + 2) / 3"));
//    }
//
//    @Test
//    public void simplifySubtractionLeftDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = sub(div(1.0, 3.0), 1.0);
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 - 1 * 3) / 3"));
//    }
//
//    @Test
//    public void simplifySubtractionRightDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = sub(1.0, div(1.0, 3.0));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 * 3 - 1) / 3"));
//    }
//
//    @Test
//    public void simplifyMultiplicationLeftDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = mul(div(1.0, 2.0), 3.0);
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 * 3) / 2"));
//    }
//
//    @Test
//    public void simplifyMultiplicationRightDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = mul(1.0, div(1.0, 3.0));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 * 1) / 3"));
//    }
//
//    @Test
//    public void simplifyDivisionLeftDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = div(div(1.0, 2.0), 3.0);
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("1 / (2 * 3)"));
//    }
//
//    @Test
//    public void simplifyDivisionRightDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = div(1.0, div(1.0, 3.0));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("1 / (3 * 1)"));
//    }
//
//    @Test
//    public void simplifyAdditionLeftAndRightDivisionSameDivisor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = add(div(1.0, 2.0), div(1.0, 2.0));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 + 1) / 2"));
//    }
//
//    @Test
//    public void simplifyAdditionLeftAndRightDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = add(div(1.0, 2.0), div(1.0, 3.0));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 * 3 + 1 * 2) / 6"));
//    }
//
//    @Test
//    public void simplifySubtractionLeftAndRightDivisionSameDivisor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = sub(div(1.0, 6.0), div(2.0, 6.0));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 - 2) / 6"));
//    }
//
//    @Test
//    public void simplifySubtractionLeftAndRightDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = sub(div(1.0, 2.0), div(1.0, 3.0));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 * 3 - 1 * 2) / 6"));
//    }
//
//    @Test
//    public void simplifyMultiplicationLeftAndRightDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = mul(div(1.0, 3.0), div(8.0, 5.0));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 * 8) / (3 * 5)"));
//    }
//
//    @Test
//    public void simplifyDivisionLeftAndRightDivision() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = div(div(1.0, 3.0), div(8.0, 5.0));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 * 5) / (3 * 8)"));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And8() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = div(4, 8);
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(4 / 4) / (8 / 4)"));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And8Is1DividedBy8And4() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = div(4, 8);
//
//        node = (InfixExpressionNode) node.simplify();
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("1 / (8 / 4)"));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And8Is1And2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = div(4, 8);
//
//        node = (InfixExpressionNode) node.simplify();
//        node = (InfixExpressionNode) node.simplify();
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("1 / 2"));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And3() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = div(4, 3);
//
//        NumberNode numberNode = (NumberNode)node.simplify();
//
//        assertThat(numberNode.getValue(), closeTo(4.0 / 3.0, EPSILON));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = div(4, 2);
//
//        NumberNode numberNode = (NumberNode)node.simplify();
//
//        assertThat(numberNode.getValue(), closeTo(2.0, EPSILON));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And22() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = div(4, div(6, 3));
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("4 / 2"));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And23() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = (InfixExpressionNode)expression("4 / (6 / 3)");
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("4 / 2"));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And24() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = (InfixExpressionNode)expression("(8 / 2) / (6 / 3)");
//
//        node = (InfixExpressionNode)node.simplify();
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("4 / 2"));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And25() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = (InfixExpressionNode)expression("(8 / 2) + (6 / 3)");
//
//        //node = (InfixExpressionNode)node.simplify();
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("4 + (6 / 3)"));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And26() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = (InfixExpressionNode)expression("(8 / 2) + (6 / 3)");
//
//        node = (InfixExpressionNode)node.simplify();
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("4 + 2"));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And27() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = (InfixExpressionNode)expression("(1 / 2) + (4 / 2)");
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 / 2) + 2"));
//    }
//
//    @Test
//    public void simplifyDivisionBetween4And28() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        InfixExpressionNode node = (InfixExpressionNode)expression("(1 / 2) + (4 / 2)");
//
//        node = (InfixExpressionNode)node.simplify();
//
//        assertThat(printVisitor.visit(node.simplify()), equalTo("(1 + 2 * 2) / 2"));
//    }
//
//    // @Test
//    // public void simplifyDivisionBetween4And29() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        // InfixExpressionNode node = (InfixExpressionNode)expression("sin(90 * 3.14 / 180) * cos(0)");
//
//        // node = (InfixExpressionNode)simplifyVisitor.simplify(node);
//
//        // assertThat(printVisitor.visit(simplifyVisitor.simplify(node)), equalTo("sin(1.57) * cos(0)"));
//    // }
//}
