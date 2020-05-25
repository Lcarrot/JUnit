import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQueue {

    Queue<Integer> queue;

    @Before
    public void initialQueue() {
        queue = new Queue<>();
    }

    @Test
    public void testAddElement() {
        Assert.assertTrue(queue.add(5));
    }

    @Test
    public void testAddElementOnEquals() {
        queue.add(5);
        Assert.assertEquals(5, queue.peck());
    }

    @Test
    public void testGetElement() {
        queue.add(5);
        queue.pop();
        Assert.assertNull(queue.peck());
    }

    @Test
    public void testGetSize4Elements() {
        queue.add(5);
        queue.add(5);
        queue.add(5);
        queue.add(5);
        Assert.assertEquals(4,queue.size());
    }

    @Test
    public void testPopWith1Element() {
        queue.add(5);
        queue.pop();
        Assert.assertNull(queue.pop());
    }

    @Test
    public void testPickWith1Element() {
        queue.add(5);
        queue.peck(5);
        Assert.assertEquals(5, queue.peck());
    }

    @Test
    public void testPopWith2Element() {
        queue.add(5);
        queue.add(6);
        queue.pop();
        Assert.assertEquals(5, queue.pop());
    }

    @Test
    public void testGetSizeWith2Elements() {
        queue.add(2);
        queue.add(3);
        Assert.assertEquals(2, queue.size());
    }

    @Test
    public void testPickWith2Elements() {
        queue.add(2);
        queue.add(3);
        queue.peck();
        Assert.assertEquals(3, queue.peck());
    }

    @After
    public void removeAll() {
        queue = null;
    }
}
