import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestMyCollection {

    MyCollection<Integer> myCollection;
    ArrayList<Integer> list;

    @Before
    public void setUpCollections() {
        myCollection = new MyCollection<>();
        list = new ArrayList<>();
    }
    @Test
    public void testAddFromArrayList() {
        list.add(5);
        list.add(7);
        Assert.assertTrue(myCollection.addAll(list));
    }

    @Test
    public void testCheckEqualsFirstElement() {
        list.add(5);
        myCollection.addAll(list);
        Assert.assertEquals(list.get(0), myCollection.iterator().next());
    }

    @Test
    public void testAddElement() {
        Assert.assertTrue(myCollection.add(5));
    }

    @Test
    public void testAddElementRight() {
        myCollection.add(5);
        Assert.assertEquals(5, myCollection.iterator().next());
    }

    @Test
    public void testAddContains() {
        myCollection.add(12);
        Assert.assertTrue(myCollection.contains(12));
    }

    @Test
    public void testIteratorHasNextWithElement() {
        myCollection.add(5);
        Iterator iterator = myCollection.iterator();
        Assert.assertTrue(iterator.hasNext());
    }

    @Test
    public void testIteratorHasNextWithoutElement() {
        Iterator iterator = myCollection.iterator();
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testSizeOfCollectionWith3Element() {
        myCollection.add(2);
        myCollection.add(4);
        myCollection.add(5);
        Assert.assertEquals(3,myCollection.size());
    }

    @Test
    public void testIteratorNextElement() {
        myCollection.add(6);
        myCollection.add(3);
        Assert.assertEquals(3,myCollection.iterator().next());
    }

    @Test
    public void testEquals() {
        MyCollection<Integer> newCollection = new MyCollection<>();
        newCollection.add(3);
        Assert.assertFalse(newCollection.equals(myCollection));
    }


    @Test
    public void testHashCode() {
        int a = myCollection.hashCode();
        Assert.assertEquals(a, myCollection.hashCode());
    }

    @Test
    public void testHashCodeWithOtherCollections() {
        MyCollection<Integer> newCollection = new MyCollection<>();
        newCollection.add(5);
        Assert.assertNotEquals(newCollection.hashCode(), myCollection.hashCode());
    }

    @Test
    public void testSizeOfCollectionWith5Element() {
        myCollection.add(5);
        myCollection.add(3);
        myCollection.add(5);
        myCollection.add(3);
        myCollection.add(5);
        myCollection.add(3);
        myCollection.add(5);
        myCollection.add(3);
        myCollection.add(5);
        myCollection.add(3);
        Assert.assertEquals(10, myCollection.size());
    }

    @After
    public void tearDownCollections() {
        myCollection = null;
        list = null;
    }
}
