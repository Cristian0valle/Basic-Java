
package shopping;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 56978
 */
public class ShoppingCartTest extends TestCase {
    private ShoppingCart cart1;
    private Productos prod1;

   /* @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    */

    
    public static TestSuite suite(){
        TestSuite suite = new TestSuite(ShoppingCartTest.class);
        return suite;
    }
    
    
    
    @Override
    protected void setUp() {
        cart1 = new ShoppingCart();
        
        prod1 = new Productos("P001", "Plasma tv Lg 32", "Plasma nitido", 740.000);
        
        cart1.AddItem(prod1);
        
    }
    
    @Override
    public void tearDown() {
        cart1 = null;
        prod1 = null;
    }
    
    /**
     * Test of getBalance method, of class ShoppingCart.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        //ShoppingCart instance = new ShoppingCart();
        double expResult = 740.000;
        double result = cart1.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of AddItem method, of class ShoppingCart.
     */
    @Test
    public void testAddItem() {
        System.out.println("AddItem");
        Productos prod2 = new Productos("P001", "Plasma tv Lg 32", "Plasma nitido", 740.000);
        cart1.AddItem(prod2);
        assertEquals(2, cart1.getItemCount());
        
        double expectedBalance = prod1.getPrecio() + prod2.getPrecio();
        assertEquals(expectedBalance, cart1.getBalance());
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveItem method, of class ShoppingCart.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("RemoveItem");
        cart1.RemoveItem(prod1);
        assertEquals(0, cart1.getItemCount());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCount method, of class ShoppingCart.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        int expResult = 1;
        int result = cart1.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       /// fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class ShoppingCart.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        cart1.empty();
        assertEquals(0, cart1.getItemCount());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
