import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UnionFindTest {
    @Test
    public void expect2UnionFindToBeEqual() {
        assertEquals(new UnionFind(5), new UnionFind(5));
    }

    @Test
    public void expectUnionToBeSymmetric() {
        UnionFind unionFind1 = new UnionFind(3).union(1, 2);
        UnionFind unionFind2 = new UnionFind(3).union(2, 1);
        assertEquals(unionFind1, unionFind2);
    }
}
