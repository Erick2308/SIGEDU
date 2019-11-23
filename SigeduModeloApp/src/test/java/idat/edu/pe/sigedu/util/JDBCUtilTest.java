package idat.edu.pe.sigedu.util;

import idat.edu.pe.sigedu.util.JDBCUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class JDBCUtilTest {
    
    JDBCUtil jdbc;
    
    public JDBCUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        jdbc = new JDBCUtil();
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testConecctionNoNula(){
        assertNotNull(jdbc.getConeccion());
    }
    
}
