package database;

import java.util.Random;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AuthConnection {
    
    public static String authentication(String email, String password, String access){
        try (Connection connection = DatabaseConfig.getconnection()){
            String query = "SELECT Account_id, Email, Password FROM client_account";
            
            if (access.equals("Cashier")) {
               query = "SELECT Account_id, Email, Password FROM admin_account";
            }
            
            Statement statement = connection.createStatement();
            
            ResultSet resultset = statement.executeQuery(query);
            
            while (resultset.next()) {
                if (email.equals(resultset.getString("Email")) && password.equals(resultset.getString("Password"))) {
                    String accountId = resultset.getString("Account_id");
                    JOptionPane.showMessageDialog(null, "Login Success", null, JOptionPane.INFORMATION_MESSAGE);
                    connection.close();
                    return accountId;
                }
            }
            
            JOptionPane.showMessageDialog(null, "Email and Password not match", null, JOptionPane.ERROR_MESSAGE);
            connection.close();
            return null;
            
        } catch (SQLException ex) {
            //temp
            return null;
        }
    }
    
    public static boolean signupClientAccount (String firstname, String lastname, String email, String password){
        try (Connection connection = DatabaseConfig.getconnection()){
            if (emailAlreadyExist(email)){
                JOptionPane.showMessageDialog(null, "Email is already exist.",
                   null, JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
            
            Random random = new Random();
            int account_id = 0;
            
            while(true){
                account_id = 10000000 + random.nextInt(90000000);
                if (!idAlreadyExisted(String.valueOf(account_id))){
                    break;
                }
            }
            
            String query = "INSERT INTO client_account (Account_id, Firstname, Lastname, Email, Password, Balance) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, String.valueOf(account_id));
            statement.setString(2, firstname);
            statement.setString(3, lastname);
            statement.setString(4, email);
            statement.setString(5, password);
            statement.setString(6, "0");

            statement.executeUpdate();
         
            connection.close();
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    public static boolean emailAlreadyExist(String email){
        try (Connection connection = DatabaseConfig.getconnection()){
            String query = "SELECT Email FROM client_account";
            
            Statement statement = connection.createStatement();
            
            ResultSet resultset = statement.executeQuery(query);
            
            while (resultset.next()) {
                if (email.equals(resultset.getString("Email"))) {
                    connection.close();
                    return true;
                }
            }
            connection.close();
            return false;
            
        } catch (SQLException ex) {
            //temp
            return false;
        }
    }
    
    public static boolean idAlreadyExisted(String id){
        try (Connection connection = DatabaseConfig.getconnection()){
            String query = "SELECT Account_id FROM client_account";
            
            Statement statement = connection.createStatement();
            
            ResultSet resultset = statement.executeQuery(query);
            
            while (resultset.next()) {
                if (id.equals(resultset.getString("Account_id"))) {
                    connection.close();
                    return true;
                }
            }
            connection.close();
            return false;
            
        } catch (SQLException ex) {
            //temp
            return false;
        }
    }

}
