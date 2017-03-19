package sk.host.arabasso.bassolve.core;

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

    @Test
    public void numberNodeEquals(){
        assertThat(new NumberNode(0), is(equalTo(new NumberNode(0))));
    }

    @Test
    public void numberNodeNotEquals(){
        assertThat(new NumberNode(0), is(not(equalTo(new NumberNode(1)))));
    }

    @Test
    public void infixNodeEquals(){
        assertThat(add(0, 0), is(equalTo(add(0, 0))));
    }

    @Test
    public void infixNodeNotEquals(){
        assertThat(add(0, 0), is(not(equalTo(sub(0, 0)))));
    }

    @Test
    public void negateNodeEquals(){
        assertThat(new NegateNode(new NumberNode(0)), is(equalTo(new NegateNode(new NumberNode(0)))));
    }

    @Test
    public void negateNodeNotEquals(){
        assertThat(new NegateNode(new NumberNode(0)), is(not(equalTo(sub(0, 0)))));
    }

    @Test
    public void parenthesisNodeEquals(){
        assertThat(new ParenthesisNode(new NumberNode(0)), is(equalTo(new ParenthesisNode(new NumberNode(0)))));
    }

    @Test
    public void parenthesisNodeNotEquals(){
        assertThat(new ParenthesisNode(new NumberNode(0)), is(not(equalTo(sub(0, 0)))));
    }
}
