
package conexionSQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexionSQL {
    Connection conectar=null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/crudosuna","root","");
            JOptionPane.showMessageDialog(null,"Conexion exitosa");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Conexion"+e.getMessage());
        }
        return conectar;
    }
    
}
