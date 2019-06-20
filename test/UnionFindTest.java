import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UnionFindTest {
    @Test
    public void expect2UnionFindToBeEqual() {
        assertEquals(new UnionFind(5), new UnionFind(5));
    }
}
