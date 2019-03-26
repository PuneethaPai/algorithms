package dataStructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NodeTest {
    @Test
    public void shouldReturnPrintWhenHasSingleNode() {
        assertEquals("(3)", new Node(null, 3, null).toString());
    }

    @Test
    public void shouldPrintWhenHasMultipleNodes() {
        assertEquals("((4)3)", new Node(new Node(4), 3, null).toString());
    }

    @Test
    public void expectTreeWithDifferentTopologyToHaveDifferentRepresentation() {
        final Node tree1 = new Node(new Node(3), 4, null);
        final Node tree2 = new Node(null, 3, new Node(4));
        assertNotEquals(tree1.toString(), tree2.toString());
    }
}
