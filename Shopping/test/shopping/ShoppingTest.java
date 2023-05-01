/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

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
public class ShoppingTest {

   
    public static TestSuite suite(){
        TestSuite suite = new TestSuite(ShoppingCartTest.class);
        return suite;
    }    
 
    /**
     * Test of main method, of class Shopping.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Shopping.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
