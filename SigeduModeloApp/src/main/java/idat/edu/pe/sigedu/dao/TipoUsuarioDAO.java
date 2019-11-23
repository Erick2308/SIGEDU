package idat.edu.pe.sigedu.dao;

import idat.edu.pe.sigedu.modelo.TipoUsuario;
import idat.edu.pe.sigedu.util.JDBCUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoUsuarioDAO implements DAOBaseI<TipoUsuario, Integer>{
    
    private JDBCUtil jdbc;

    public TipoUsuarioDAO(JDBCUtil jdbc) {
        this.jdbc = jdbc;
    }
    
        

    @Override
    public List<TipoUsuario> buscarTodo() {
        String sql ="SELECT * FROM tipousuario";
        PreparedStatement ps = jdbc.obtenerPreparedStatement(sql);
        ResultSet rs = jdbc.ejecutarConsulta(ps);
        List<TipoUsuario> resultado = new ArrayList<TipoUsuario>();
        TipoUsuario objeEncontrado = null;
        try {
            while(rs.next()){
                objeEncontrado = new TipoUsuario();
                objeEncontrado.setId(rs.getInt("id"));
                objeEncontrado.setDescripcion(rs.getString("descripcion"));
                resultado.add(objeEncontrado);
                
            }
        } catch (SQLException e) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, e);            
        }

            
        
        
        return resultado;
        
    }

    @Override
    public TipoUsuario buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(TipoUsuario object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(TipoUsuario object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

