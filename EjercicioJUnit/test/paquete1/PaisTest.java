package paquete1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PaisTest {

    public PaisTest() {
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
     * Test of obtenerNombre method, of class Pais.
     */
    @Test
    public void testObtenerNombre() {
        System.out.println("obtenerNombre");
        Pais instance = new Pais();
        String expResult = "";
        String result = instance.obtenerNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of establecerNombre method, of class Pais.
     */
    @Test
    public void testEstablecerNombre() {
        System.out.println("establecerNombre");
        String n = "";
        Pais instance = new Pais();
        instance.establecerNombre(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
