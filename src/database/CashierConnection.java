package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CashierConnection {
    
    public static int[] getHomeData(){
        try (Connection connection = DatabaseConfig.getconnection()){
            int users = 0;
            int waiting = 0;
            int pending = 0;
            int cancel = 0;
            int complete = 0;
            
            String query = "SELECT COUNT(*) AS total_rows FROM client_account";
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery(query);
            
            if (resultset.next()){
                users = resultset.getInt("total_rows");
            }    
            
            query = "SELECT COUNT(*) AS total_rows FROM transactions WHERE Status = 'Waiting'";
            resultset = statement.executeQuery(query);
                
            if (resultset.next()){
                waiting = resultset.getInt("total_rows");
            }
            
            query = "SELECT COUNT(*) AS total_rows FROM transactions WHERE Status = 'Pending'";
            resultset = statement.executeQuery(query);
                
            if (resultset.next()){
                pending = resultset.getInt("total_rows");
            }
            
            query = "SELECT COUNT(*) AS total_rows FROM transactions WHERE Status = 'Cancel'";
            resultset = statement.executeQuery(query);
                
            if (resultset.next()){
                cancel = resultset.getInt("total_rows");
            }
            
            query = "SELECT COUNT(*) AS total_rows FROM transactions WHERE Status = 'Complete'";
            resultset = statement.executeQuery(query);
                
            if (resultset.next()){
                complete = resultset.getInt("total_rows");
            }
            
            int data[] = {users, waiting, pending, cancel, complete};
            connection.close();
            return data;
          
        }catch (SQLException ex) {
            return null;
        }
    }
    
    public static String[] cashierInfo(String account_id){
        try (Connection connection = DatabaseConfig.getconnection()){
            String query = "SELECT * FROM admin_account WHERE Account_id = (?)";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, account_id);

            ResultSet resultset = statement.executeQuery();
            resultset.next();

            String[] data = {
                resultset.getString("Firstname"),
                resultset.getString("Lastname"),
                resultset.getString("Email"),
                resultset.getString("Password"),
            };
            
            connection.close();
            return data;
            }
            
            catch (SQLException ex) {
            //temp
            return null;
        }
    }
    
    public static Boolean updateBasicInfo(String firstname, String lastname, String accountId){
        try (Connection connection = DatabaseConfig.getconnection()){
            String query = "UPDATE admin_account SET Firstname = ?, Lastname = ? WHERE Account_id = ?";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, firstname);
            statement.setString(2, lastname);
            statement.setString(3, accountId);

            statement.executeUpdate();
            
            connection.close();
            return true;
            }
            
            catch (SQLException ex) {
            //temp
            return false;
        }
    }
    
    public static Boolean updateSecurityInfo(String email, String newPassword, String accountId){
        try (Connection connection = DatabaseConfig.getconnection()){
            PreparedStatement statement = null;
            
            if(!newPassword.isEmpty()){
                String query = "UPDATE admin_account SET Email = ?, Password = ? WHERE Account_id = ?";

                statement = connection.prepareStatement(query);
                statement.setString(1, email);
                statement.setString(2, newPassword);
                statement.setString(3, accountId);
            }
            else {
                String query = "UPDATE admin_account SET Email = ? WHERE Account_id = ?";

                statement = connection.prepareStatement(query);
                statement.setString(1, email);
                statement.setString(2, accountId);
            }
            
            statement.executeUpdate();
            
            connection.close();
            return true;
            }
            
            catch (SQLException ex) {
            //temp
            return false;
        }
    }
    
    public static String[][] getHistory(){
        try (Connection connection = DatabaseConfig.getconnection()){
            String[][] data;
            String query = "SELECT * FROM transactions WHERE Status = 'Complete' OR Status = 'Cancel'";
            
            Statement statement = connection.createStatement();

            ResultSet resultset = statement.executeQuery(query);
            
            int resultSize = 0;
            while (resultset.next()){
                resultSize += 1;
            }
            if (resultSize > 0){
                resultset = statement.executeQuery(query);
                String[] column = {"Reference_Number","Date_Time","Transaction","Student_ID","Course", "Amount", "Status"};
                data = new String[resultSize][7];

                for (int row = 0; row < resultSize; row++) {
                    resultset.next();
                    for (int col = 0; col < 7; col++) {
                        data[row][col] = resultset.getString(column[col]);
                    
                    }
                }

                connection.close();
                return data;
            } else {
                return null;
            }
        }
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static String[][] getHistoryStatus(String account_id, String status){
        try (Connection connection = DatabaseConfig.getconnection()){
            String[][] data;
            
            String query = "SELECT * FROM transactions WHERE Account_id LIKE '" + account_id + "%' AND Status = ?";
            
            if (account_id == null || account_id.isEmpty()) {
                query = "SELECT Account_id, Reference_Number, Date_Time, Transaction, Student_ID, Amount FROM transactions WHERE Status = ?";
            }

            PreparedStatement statement = connection.prepareStatement(query);
            
            statement.setString(1, status);
            
            ResultSet resultset = statement.executeQuery();
  
            int resultSize = 0;
            while (resultset.next()){
                resultSize += 1;
            }
            
            if (resultSize > 0){
                resultset = statement.executeQuery();
                String[] column = {"Account_id", "Reference_Number","Date_Time","Transaction", "Student_ID", "Amount"};
                data = new String[resultSize][6];

                for (int row = 0; row < resultSize; row++) {
                    resultset.next();
                    for (int col = 0; col < 6; col++) {
                        data[row][col] = resultset.getString(column[col]);
                    }
                }
                
                connection.close();
                return data;
            } else {
                return null;
            }
        }
        catch (SQLException ex) {
            return null;
        }
    }
    
    public static void updateStatus(String reference, String status){
        try (Connection connection = DatabaseConfig.getconnection()){
            
            String currentTimeDate = database.StudentConnection.getDateTime();
            String expiryTime = "17:00:00";
            String[] arr = currentTimeDate.split(", ");
            
            String query = "UPDATE transactions SET Date_Time = ?, Status = ? WHERE Reference_Number = ?";
            
            PreparedStatement statement = connection.prepareStatement(query);
            
            if (status.equals("Waiting")){
                statement.setString(1, arr[0]+" / "+ expiryTime);
                statement.setString(2, status);
                statement.setString(3, reference); 
            } 
            else {
                statement.setString(1, currentTimeDate);
                statement.setString(2, status);
                statement.setString(3, reference); 
            }
            
            statement.executeUpdate();
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection Error.",
                                null, JOptionPane.WARNING_MESSAGE);
        }
    }
}
