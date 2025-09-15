package test.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.mathNode.*;

/**
 * Tests for the mathNode package.
 */
class MathNodeTest {

    private static final double EPS = 1e-9;

    public static Factory nodeFactory = new Factory();
    Operator opNode;
    Expression leftNode;
    Expression rightNode;

    int[] testInts = {6, 2};
    double[] testDoubles = {4.5, 3};

    @Test
    void testAdd() {
        opNode = new Add();

        leftNode = nodeFactory.buildNode(testInts[0]);
        rightNode = nodeFactory.buildNode(testInts[1]);
        opNode.setLeftNode(leftNode);
        opNode.setRightNode(rightNode);
        assertEquals(8.0, ((Number) opNode.calculate()).doubleValue(), EPS);

        leftNode = nodeFactory.buildNode(testDoubles[0]);
        rightNode = nodeFactory.buildNode(testDoubles[1]);
        opNode.setLeftNode(leftNode);
        opNode.setRightNode(rightNode);
        assertEquals(7.5, ((Number) opNode.calculate()).doubleValue(), EPS);
    }

    @Test
    void testSub() {
        opNode = new Sub();

        leftNode = nodeFactory.buildNode(testInts[0]);
        rightNode = nodeFactory.buildNode(testInts[1]);
        opNode.setLeftNode(leftNode);
        opNode.setRightNode(rightNode);
        assertEquals(4.0, ((Number) opNode.calculate()).doubleValue(), EPS);

        leftNode = nodeFactory.buildNode(testDoubles[0]);
        rightNode = nodeFactory.buildNode(testDoubles[1]);
        opNode.setLeftNode(leftNode);
        opNode.setRightNode(rightNode);
        assertEquals(1.5, ((Number) opNode.calculate()).doubleValue(), EPS);
    }

    @Test
    void testMult() {
        opNode = new Mult();

        leftNode = nodeFactory.buildNode(testInts[0]);
        rightNode = nodeFactory.buildNode(testInts[1]);
        opNode.setLeftNode(leftNode);
        opNode.setRightNode(rightNode);
        assertEquals(12.0, ((Number) opNode.calculate()).doubleValue(), EPS);

        leftNode = nodeFactory.buildNode(testDoubles[0]);
        rightNode = nodeFactory.buildNode(testDoubles[1]);
        opNode.setLeftNode(leftNode);
        opNode.setRightNode(rightNode);
        assertEquals(13.5, ((Number) opNode.calculate()).doubleValue(), EPS);
    }

    @Test
    void testDiv() {
        opNode = new Div();

        leftNode = nodeFactory.buildNode(testInts[0]);
        rightNode = nodeFactory.buildNode(testInts[1]);
        opNode.setLeftNode(leftNode);
        opNode.setRightNode(rightNode);
        assertEquals(3.0, ((Number) opNode.calculate()).doubleValue(), EPS);

        leftNode = nodeFactory.buildNode(testDoubles[0]);
        rightNode = nodeFactory.buildNode(testDoubles[1]);
        opNode.setLeftNode(leftNode);
        opNode.setRightNode(rightNode);
        assertEquals(1.5, ((Number) opNode.calculate()).doubleValue(), EPS);
    }

    @Test
    void testPow() {
        opNode = new Pow();

        leftNode = nodeFactory.buildNode(testInts[0]);
        rightNode = nodeFactory.buildNode(testInts[1]);
        opNode.setLeftNode(leftNode);
        opNode.setRightNode(rightNode);
        assertEquals(36.0, ((Number) opNode.calculate()).doubleValue(), EPS);

        leftNode = nodeFactory.buildNode(testDoubles[0]);
        rightNode = nodeFactory.buildNode(testDoubles[1]);
        opNode.setLeftNode(leftNode);
        opNode.setRightNode(rightNode);
        assertEquals(91.125, ((Number) opNode.calculate()).doubleValue(), EPS);
    }
}
