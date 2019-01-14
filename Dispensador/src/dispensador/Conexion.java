
package dispensador;
import java.sql.*;

public class Conexion {
    
    private static Connection cnx = null;
    
    public static Connection obtener() throws SQLException, ClassNotFoundException {
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
           cnx = DriverManager.getConnection("jdbc:mysql://localhost/dispensador", "root", "385402292Mica_02");
           System.out.println("Conexion correcta.");
        } catch (ClassNotFoundException | SQLException ex) {
           //throw new SQLException(ex);
           System.out.println("Error: "+ex.getMessage().toString());
        }
        
        return cnx;
    }
    
    public static boolean Conectar() throws SQLException, ClassNotFoundException{
        if (cnx==null){
            obtener();
            if (cnx==null){
                return false;
            }else{
                return true;
            }            
        }else{
            return true;
        }
    }
    
    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
}
