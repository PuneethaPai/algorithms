package dataStructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreeTest {
    @Test
    public void shouldPrintInsertedDataIsOne() {
        final BinarySearchTree bst = new BinarySearchTree().add(1);
        assertEquals("(1)", bst.toString());
    }

    @Test
    public void shouldPrintInAscendingOrderWhenMultipleInputGiven() {
        final BinarySearchTree binarySearchTree = new BinarySearchTree().add(2, 1, 5, 3, 6);
        assertEquals("((1)2((3)5(6)))", binarySearchTree.toString());
    }

    @Test
    public void shouldKeepEqualValueToItsLeftSubTree() {
        final BinarySearchTree binarySearchTree = new BinarySearchTree().add(2, 3, 1, 2);
        assertEquals("((1(2))2(3))", binarySearchTree.toString());
    }

    @Test
    public void shouldBeAbleToCreateTreeWithConstructor() {
        final BinarySearchTree binarySearchTree = new BinarySearchTree(2, 5, 1, 4, 1.5);
        assertEquals("", binarySearchTree.toString());
    }
}
