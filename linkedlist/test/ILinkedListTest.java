/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*




*/
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nick
 */
public class ILinkedListTest {
    
    public ILinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of next method, of class ILinkedList.
     */
    @Test
    public void testNextIsNull() {
        System.out.println("next");
        ILinkedList<Integer> instance = new ILinkedList(5);
        instance.append(new ILinkedList(7));
        ILinkedList expResult = null;
        ILinkedList result = instance.next().next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testNextIsANode(){
        System.out.println("next as a node");
        ILinkedList<Integer> list = new ILinkedList(5);
        list.append(new ILinkedList(7));
        list.append(new ILinkedList(2));
        list.append(new ILinkedList(6));
        int exp = 7;
        ILinkedList result = list.next();
        assertEquals(exp, result.get());
    }

    /**
     * Test of last method, of class ILinkedList.
     */
    @Test
    public void testLast() {
        System.out.println("last");
        ILinkedList list = new ILinkedList(5);
        list.append(new ILinkedList(7));
        list.append(new ILinkedList(2));
        list.append(new ILinkedList(6));
        int exp = 6;
        ILinkedList result = list.last();
        assertEquals(exp, result.get());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of after method, of class ILinkedList.
     */
    @Test
    public void testAfterNoNodes() {
        System.out.println("after");
        int n =0;
        ILinkedList instance = new ILinkedList(null);
        ILinkedList expResult = null;
        ILinkedList result = instance.after(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testAfterInBounds() {
        System.out.println("after");
        int n =2;
        ILinkedList list = new ILinkedList(5);
        list.append(new ILinkedList(7));
        list.append(new ILinkedList(2));
        list.append(new ILinkedList(6));
        int exp = 2;
        ILinkedList result = list.after(n);
        assertEquals(exp, result.get());
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of detach method, of class ILinkedList.
     */
    @Test
    public void testDetach() {
        System.out.println("detach");
        ILinkedList list = new ILinkedList(null);
        
        ILinkedList expResult = null;
        ILinkedList result = list.detach();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of get method, of class ILinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        ILinkedList instance = new ILinkedList(5);
        Object expResult = 5;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of set method, of class ILinkedList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        Object value = null;
        ILinkedList instance = new ILinkedList(null);
        instance.set(value);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNext method, of class ILinkedList.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        ILinkedList instance = new ILinkedList(null);
        instance.setNext(null);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of append method, of class ILinkedList.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        ILinkedList instance = new ILinkedList(5);
        ILinkedList<Integer> list = new ILinkedList(2);
        instance.append(list);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of insert method, of class ILinkedList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        ILinkedList instance = new ILinkedList(null);
        instance.insert(null);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
