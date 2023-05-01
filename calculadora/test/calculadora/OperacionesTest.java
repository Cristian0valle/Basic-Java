/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

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
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of Suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        int num1 = 4;
        int num2 = 6;
        Operaciones instance = new Operaciones();
        int expResult = 10;
        int result = instance.Suma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Operaciones.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int num1 = 4;
        int num2 = 3;
        Operaciones instance = new Operaciones();
        int expResult = 1;
        int result = instance.resta(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class Operaciones.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int num1 = 2;
        int num2 = 9;
        Operaciones instance = new Operaciones();
        int expResult = 18;
        int result = instance.multiplicacion(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Operaciones.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int num1 = 30;
        int num2 = 7;
        Operaciones instance = new Operaciones();
        int expResult = 6;
        int result = instance.division(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
