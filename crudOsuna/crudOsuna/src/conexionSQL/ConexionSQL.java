/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionSQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class ConexionSQL {
    Connection conectar=null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/crudOsuna","root","");
            JOptionPane.showMessageDialog(null,"Conexion exitosa");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Conexion"+e.getMessage());
        }
        return conectar;
    }
    
}
