
package Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    private Connection con = null;
    
    public Connection getConexion(){
        try{
            Properties properties = new Properties();
            FileInputStream input = new FileInputStream("src/resources/application.properties");
            properties.load(input);
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(properties.getProperty("url"), properties);
            JOptionPane.showMessageDialog(null, "conectado");
        }catch (SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "error");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return con;
    }
    
}
