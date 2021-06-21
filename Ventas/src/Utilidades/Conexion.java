
package Utilidades;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author OrdSon
 */
public class Conexion {

    Connection Conexion = null;
    public Conexion(){
        
    }
    public int conectar() {
        try{

            if (Conexion != null) {
                JOptionPane.showMessageDialog(null, "La conexión previa con la base de datos sigue vigente");
            }

            String url = "jdbc:mysql://localhost:3306/punto_venta";
            String user = "root";
            String password = "Shinouyo0.";

            Conexion = DriverManager.getConnection(url, user, password);
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Conexion Fallida");
            return 2;
        }
        System.out.println("conexion exitosa");
        return 0;
    }
    
    public int desconectar(){
        Conexion = null;
        if (Conexion!=null) {
            JOptionPane.showMessageDialog(null, "Error al desconectar de base de datos, sigue conectado");
            return 1;
        }
        return 0;
    }
    
    public Connection getConnection(){
        return Conexion;
    }
}
