package test.java.test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.java.mathNode.*;

//Tests for the mathNode package.

class MathNodeTest
{
   public static main.java.mathNode.Factory nodeFactory = new main.java.mathNode.Factory();
   main.java.mathNode.Operator opNode;
   main.java.mathNode.Expression leftNode;
   main.java.mathNode.Expression rightNode;
   
   int[] testInts = {6, 2};
   double[] testDoubles = {4.5, 3};

   @Test
   public void testAdd()
   {
      opNode = new main.java.mathNode.Add();
      
      leftNode = nodeFactory.buildNode(testInts[0]);
      rightNode = nodeFactory.buildNode(testInts[1]);
      
      opNode.setLeftNode(leftNode);
      opNode.setRightNode(rightNode);
      
      assertEquals(8, opNode.calculate());
      
      leftNode = nodeFactory.buildNode(testDoubles[0]);
      rightNode = nodeFactory.buildNode(testDoubles[1]);
      
      opNode.setLeftNode(leftNode);
      opNode.setRightNode(rightNode);
      
      assertEquals(7.5, opNode.calculate());
   }
   
   @Test
   public void testSub()
   {
      opNode = new main.java.mathNode.Sub();
      
      leftNode = nodeFactory.buildNode(testInts[0]);
      rightNode = nodeFactory.buildNode(testInts[1]);
      
      opNode.setLeftNode(leftNode);
      opNode.setRightNode(rightNode);
      
      assertEquals(4, opNode.calculate());
      
      leftNode = nodeFactory.buildNode(testDoubles[0]);
      rightNode = nodeFactory.buildNode(testDoubles[1]);
      
      opNode.setLeftNode(leftNode);
      opNode.setRightNode(rightNode);
      
      assertEquals(1.5, opNode.calculate());
   }
   
   @Test
   public void testMult()
   {
      opNode = new main.java.mathNode.Mult();
      
      leftNode = nodeFactory.buildNode(testInts[0]);
      rightNode = nodeFactory.buildNode(testInts[1]);
      
      opNode.setLeftNode(leftNode);
      opNode.setRightNode(rightNode);
      
      assertEquals(12, opNode.calculate());
      
      leftNode = nodeFactory.buildNode(testDoubles[0]);
      rightNode = nodeFactory.buildNode(testDoubles[1]);
      
      opNode.setLeftNode(leftNode);
      opNode.setRightNode(rightNode);
      
      assertEquals(13.5, opNode.calculate());
   }
   
   @Test
   public void testDiv()
   {
      opNode = new main.java.mathNode.Div();
      
      leftNode = nodeFactory.buildNode(testInts[0]);
      rightNode = nodeFactory.buildNode(testInts[1]);
      
      opNode.setLeftNode(leftNode);
      opNode.setRightNode(rightNode);
      
      assertEquals(3.0, opNode.calculate());
      
      leftNode = nodeFactory.buildNode(testDoubles[0]);
      rightNode = nodeFactory.buildNode(testDoubles[1]);
      
      opNode.setLeftNode(leftNode);
      opNode.setRightNode(rightNode);
      
      assertEquals(1.5, opNode.calculate());
   }
   
   @Test
   public void testPow()
   {
      opNode = new main.java.mathNode.Pow();
      
      leftNode = nodeFactory.buildNode(testInts[0]);
      rightNode = nodeFactory.buildNode(testInts[1]);
      
      opNode.setLeftNode(leftNode);
      opNode.setRightNode(rightNode);
      
      assertEquals(36.0, opNode.calculate());
      
      leftNode = nodeFactory.buildNode(testDoubles[0]);
      rightNode = nodeFactory.buildNode(testDoubles[1]);
      
      opNode.setLeftNode(leftNode);
      opNode.setRightNode(rightNode);
      
      assertEquals(91.125, opNode.calculate());
   }

}