package idat.edu.pe.sigedu.dao;

import idat.edu.pe.sigedu.modelo.TipoUsuario;
import idat.edu.pe.sigedu.util.JDBCUtil;
import java.util.List;
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
public class TipoUsuarioDAOTest {
    
    private JDBCUtil jdbc;
    
    public TipoUsuarioDAOTest() {
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

    /**
     * Test of buscarTodo method, of class TipoUsuarioDAO.
     */
    @Test
    public void testBuscarTodo() {
        System.out.println("buscarTodo");
        TipoUsuarioDAO instance = new TipoUsuarioDAO(jdbc);
        //List<TipoUsuario> expResult = null;
        List<TipoUsuario> result = instance.buscarTodo();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(0, result.size());
    }

    /**
     * Test of buscarPorId method, of class TipoUsuarioDAO.
     
    @Test
    public void testBuscarPorId() {
        System.out.println("buscarPorId");
        Integer id = null;
        TipoUsuarioDAO instance = null;
        TipoUsuario expResult = null;
        TipoUsuario result = instance.buscarPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testCrear() {
        System.out.println("crear");
        TipoUsuario object = null;
        TipoUsuarioDAO instance = null;
        instance.crear(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        TipoUsuario object = null;
        TipoUsuarioDAO instance = null;
        instance.actualizar(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        Integer id = null;
        TipoUsuarioDAO instance = null;
        instance.borrar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */
    
}
