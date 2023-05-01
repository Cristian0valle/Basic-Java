
package loginp;

import static junit.framework.TestCase.assertEquals;
import junit.framework.TestSuite;
import static loginp.Main.main;
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
public class UsuarioTest {
    
    private Usuario user1;
   
    @Before
    public void setUp() {
        user1 = new Usuario("cristian", "completo");
    }
    
    @After
    public void tearDown() throws Exception {
        user1 = null;
    }
   
    @Test
    public void testGetUsuario() {
         System.out.println("getUsuario");
        String expResult = "cristian";
        String result = user1.getUsuario();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPass() {
         System.out.println("getPassword");
        String expResult = "completo";
        String result = user1.getPass();
        assertEquals(expResult, result);
    }

    
}
