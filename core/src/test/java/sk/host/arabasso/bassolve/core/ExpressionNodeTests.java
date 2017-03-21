package sk.host.arabasso.bassolve.core;

import org.junit.Before;
import org.junit.Test;
import sk.host.arabasso.bassolve.core.ast.node.*;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

/**
 * Created by arabasso on 19/03/2017.
 *
 */
public class ExpressionNodeTests extends ExpressionTests {

    private NumberNode numberNode0, numberNode1;
    private AdditionNode addNode;
    private SubtractionNode subNode;

    @Before
    public void initialization() {
        numberNode0 = new NumberNode(0);
        numberNode1 = new NumberNode(1);
        addNode = new AdditionNode(numberNode0, numberNode0);
        subNode = new SubtractionNode(numberNode0, numberNode0);
    }

    @Test
    public void numberNodeEquals(){
        assertThat(numberNode0, is(equalTo(numberNode0)));
    }

    @Test
    public void numberNodeNotEquals(){
        assertThat(numberNode0, is(not(equalTo(numberNode1))));
    }

    @Test
    public void typeNumberNodeEquals(){
        assertThat(numberNode0.typeHashCode(), is(equalTo(numberNode1.typeHashCode())));
    }

    @Test
    public void typeNumberNodeNotEquals(){
        assertThat(numberNode0.typeHashCode(), is(not(equalTo(addNode.typeHashCode()))));
    }

    @Test
    public void infixNodeEquals(){
        assertThat(addNode, is(equalTo(addNode)));
    }

    @Test
    public void infixNodeNotEquals(){
        assertThat(addNode, is(not(equalTo(subNode))));
    }

    @Test
    public void typeInfixNodeEquals(){
        assertThat(addNode.typeHashCode(), is(equalTo(addNode.typeHashCode())));
    }

    @Test
    public void typeInfixNodeNotEquals(){
        assertThat(addNode.typeHashCode(), is(not(equalTo(subNode.typeHashCode()))));
    }

    @Test
    public void negateNodeEquals(){
        assertThat(new NegateNode(numberNode0), is(equalTo(new NegateNode(numberNode0))));
    }

    @Test
    public void negateNodeNotEquals(){
        assertThat(new NegateNode(numberNode0), is(not(equalTo(subNode))));
    }

    @Test
    public void typeNegateNodeEquals(){
        assertThat(new NegateNode(numberNode0).typeHashCode(), is(equalTo(new NegateNode(numberNode0).typeHashCode())));
    }

    @Test
    public void typeNegateNodeNotEquals(){
        assertThat(new NegateNode(numberNode0).typeHashCode(), is(not(equalTo(subNode.typeHashCode()))));
    }

    @Test
    public void parenthesisNodeEquals(){
        assertThat(new ParenthesisNode(numberNode0), is(equalTo(new ParenthesisNode(numberNode0))));
    }

    @Test
    public void parenthesisNodeNotEquals(){
        assertThat(new ParenthesisNode(numberNode0), is(not(equalTo(subNode))));
    }

    @Test
    public void typeParenthesisNodeEquals(){
        assertThat(new ParenthesisNode(numberNode0).typeHashCode(), is(equalTo(new ParenthesisNode(numberNode0).typeHashCode())));
    }

    @Test
    public void typeParenthesisNodeNotEquals(){
        assertThat(new ParenthesisNode(numberNode0).typeHashCode(), is(not(equalTo(subNode.typeHashCode()))));
    }

    @Test
    public void isNumber() {
        assertThat(numberNode0.isNumber(), is(equalTo(true)));
    }

    @Test
    public void isNotNumber() {
        assertThat(new ParenthesisNode(numberNode0).isNumber(), is(equalTo(false)));
    }

    @Test
    public void isNumberLeft() {
        assertThat(addNode.isNumberLeft(), is(equalTo(true)));
    }

    @Test
    public void isNotNumberLeft() {
        assertThat(add(add(0, 0), 0).isNumberLeft(), is(equalTo(false)));
    }

    @Test
    public void isNumberRight() {
        assertThat(addNode.isNumberRight(), is(equalTo(true)));
    }

    @Test
    public void isNotNumberRight() {
        assertThat(add(0, sub(1, 2)).isNumberRight(), is(equalTo(false)));
    }

    @Test
    public void isNumberLeftAndRight() {
        assertThat(addNode.isNumberLeftAndRight(), is(equalTo(true)));
    }

    @Test
    public void isNumberParenthesisInnerNode() {
        assertThat(new ParenthesisNode(numberNode0).isNumberInnerNode(), is(equalTo(true)));
    }

    @Test
    public void isNotNumberParenthesisInnerNode() {
        assertThat(new ParenthesisNode(add(0, 1)).isNumberInnerNode(), is(equalTo(false)));
    }

    @Test
    public void isNumberFunctionArgument() {
        assertThat(new FunctionNode("cos", numberNode0).isNumberArgument(), is(equalTo(true)));
    }

    @Test
    public void isNotNumberFunctionArgument() {
        assertThat(new FunctionNode("sin", add(0, 1)).isNumberArgument(), is(equalTo(false)));
    }

    @Test
    public void isNumberNegateInnerNode() {
        assertThat(new NegateNode(numberNode0).isNumberInnerNode(), is(equalTo(true)));
    }

    @Test
    public void isNotNumberNegateInnerNode() {
        assertThat(new NegateNode(add(0, 1)).isNumberInnerNode(), is(equalTo(false)));
    }
}
