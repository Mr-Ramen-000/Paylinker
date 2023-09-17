
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConfig {
    private static final String database = "jdbc:mysql://localhost/paylinker";
    private static final String dbUser = "root";
    private static final String dbPassword = "";

    
    public static Connection getconnection(){
        try {
            return DriverManager.getConnection(database,dbUser,dbPassword);
        } catch (SQLException ex) {
            //temp
            JOptionPane.showMessageDialog(null, ex, null, JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
