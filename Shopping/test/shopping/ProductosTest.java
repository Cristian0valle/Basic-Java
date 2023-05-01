/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import junit.framework.TestCase;
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
public class ProductosTest extends TestCase{

    
    private Productos prod1;
    
    public ProductosTest(String testName) {
        super(testName);
    }
        
    public static TestSuite suite(){
        TestSuite suite = new TestSuite(ShoppingCartTest.class);
        return suite;
    }
    @Before
    protected void setUp() throws Exception {
        prod1 = new Productos("P001", "Plasma tv Lg 32", "Plasma nitido", 740.000);
    }
    
    @After
    public void tearDown() throws Exception {
        prod1 = null;
    }

    /**
     * Test of getCodigo method, of class Productos.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        //Productos instance = null;
        String expResult = "P001";
        String result = prod1.getCodigo();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTitulo method, of class Productos.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        //Productos instance = null;
        String expResult = "Plasma tv Lg 32";
        String result = prod1.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Productos.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        //Productos instance = null;
        String expResult = "Plasma nitido";
        String result = prod1.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Productos.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        //Productos instance = null;
        double expResult = 740.000;
        double result = prod1.getPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
