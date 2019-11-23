package idat.edu.pe.sigedu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCUtil {
    
    private final String usuario = "root";
    private final String password = "12345678";
    private final String urlConection = "jdbc:mysql://localhost:3306/Sigedu_db?serverTimezone=UTC";
    private final String driverClass ="com.mysql.jdbc.Driver" ;
    
    private Connection coneccion;
    
    private PreparedStatement sentencia;
    
    private ResultSet resultado;
    
    public JDBCUtil(){
        
        try {
            Class.forName(driverClass);
            coneccion = DriverManager.getConnection(urlConection, usuario, password);
            if (coneccion != null){
                System.out.println("Coneccion Exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public Connection getConeccion() {
        return coneccion;
    }
    
    public PreparedStatement obtenerPreparedStatement (String sql){
        try {
            sentencia = coneccion.prepareCall(sql);
        } catch (SQLException e) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, e);
        }
        return sentencia;
    }
    
    public ResultSet ejecutarConsulta(PreparedStatement statementSQL){
        sentencia = statementSQL;
        try {
            resultado = sentencia.executeQuery();
        } catch (SQLException e) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, e);            
        }
        return resultado;
    }
    
    public void ejecutarActualizacion (PreparedStatement statementSQL){
        sentencia = statementSQL;
        
        try {
            sentencia.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void cerrarObjetos(){
        try {
            if(resultado != null)
                resultado.close();
            if(sentencia != null)
                sentencia.close();
            if(coneccion != null)
                coneccion.close();
        } catch (SQLException e) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, e);            
        }
    }
}
