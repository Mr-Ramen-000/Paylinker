package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class StudentConnection {
    
    public static String[] studentInfo(String account_id){
        try (Connection connection = DatabaseConfig.getconnection()){
            String query = "SELECT * FROM client_account WHERE Account_id = (?)";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, account_id);

            ResultSet resultset = statement.executeQuery();
            resultset.next();

            String[] data = {
                resultset.getString("Firstname"),
                resultset.getString("Lastname"),
                resultset.getString("Email"),
                resultset.getString("Password"),
                resultset.getString("Balance")};
                
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
            String query = "UPDATE client_account SET Firstname = ?, Lastname = ? WHERE Account_id = ?";
            
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
                String query = "UPDATE client_account SET Email = ?, Password = ? WHERE Account_id = ?";

                statement = connection.prepareStatement(query);
                statement.setString(1, email);
                statement.setString(2, newPassword);
                statement.setString(3, accountId);
            }
            else {
                String query = "UPDATE client_account SET Email = ? WHERE Account_id = ?";

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
    
    public static String getBalance(String account_id){
        try (Connection connection = DatabaseConfig.getconnection()){
            String query = "SELECT Balance FROM client_account WHERE Account_id = (?)";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, account_id);

            ResultSet resultset = statement.executeQuery();
            resultset.next();

            String data = resultset.getString("Balance");
                
            connection.close();
            return data;
            }
            
            catch (SQLException ex) {
            //temp
            return null;
        }
    }
    
    public static Boolean updateBalance(String newbalance, String accountId){
        try (Connection connection = DatabaseConfig.getconnection()){
            String query = "UPDATE client_account SET Balance = ? WHERE Account_id = ?";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, newbalance);
            statement.setString(2, accountId);

            statement.executeUpdate();
            
            connection.close();
            return true;
            }
            
            catch (SQLException ex) {
            //temp
            return false;
        }
    }
    
    public static Boolean makeHistory(String accountId, String referece, String transaction, String sender, String recipient, String amount, String status){
        String ref = referece != null? referece : referenceCreator();
         
        String time_date = getDateTime();
        
        try (Connection connection = DatabaseConfig.getconnection()){
            String query = "INSERT INTO client_history (Account_id, Reference_Number, Date_Time, Transaction, Sender, Recipient, Amount, Status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, accountId);
            statement.setString(2, ref);
            statement.setString(3, time_date);
            statement.setString(4, transaction);
            statement.setString(5, sender);
            statement.setString(6, recipient);
            statement.setString(7, amount);
            statement.setString(8, status);

            statement.executeUpdate();
            
            connection.close();
            return true;
            }
            
            catch (SQLException ex) {
            //temp
            return false;
        }
    }
    
    public static String[][] getHistory(String account_id){
        try (Connection connection = DatabaseConfig.getconnection()){
            String[][] data;
            String query = "SELECT * FROM client_history WHERE Account_id = (?)";
            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, account_id);

            ResultSet resultset = statement.executeQuery();
            
            int resultSize = 0;
            while (resultset.next()){
                resultSize += 1;
            }
            if (resultSize > 0){
                resultset = statement.executeQuery();
                String[] column = {"Reference_Number","Date_Time","Transaction","Sender","Recipient", "Amount", "Status"};
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
    
        public static String[][] getPending(String account_id, String status){
        try (Connection connection = DatabaseConfig.getconnection()){
            String[][] data;
            
            String query = "SELECT Account_id, Reference_Number, Date_Time, Transaction, Amount, Status FROM transactions WHERE Status = ? AND Account_id = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, status);
            statement.setString(2, account_id);
            ResultSet resultset = statement.executeQuery();
            

            
            int resultSize = 0;
            while (resultset.next()){
                resultSize += 1;
            }
            

            if (resultSize > 0){
                resultset = statement.executeQuery();
                String[] column = {"Reference_Number","Date_Time","Transaction","Amount","Status", "Account_id"};
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
    
    public static String getDateTime(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");
        
        return currentDateTime.format(format);
    }
    
    public static String referenceCreator(){
        long randomNumber;
        
        while(true){
                Random random = new Random();
                randomNumber = 1000000000L + random.nextLong(9000000000L);
                
                if (!referenceCheaker(randomNumber)){
                    break;
                }
        }
        
        return String.valueOf(randomNumber);

    }
    
    private static boolean referenceCheaker(long ref){
        try (Connection connection = DatabaseConfig.getconnection()){
            String query = "SELECT Reference_Number FROM history";
            
            Statement statement = connection.createStatement();
            
            ResultSet resultset = statement.executeQuery(query);
            
            while (resultset.next()) {
                if (ref == (resultset.getInt("Reference_Number"))) {
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
    
    public static boolean transferBalance(String receiver, String sender, String amount){
        try {
            float receiverBal = Float.parseFloat(getBalance(receiver));
            float newReceiverBal = receiverBal + Float.parseFloat(amount);
        
            updateBalance(String.format("%.2f", newReceiverBal), receiver);
        
            float senderBal = Float.parseFloat(getBalance(sender));
            float newSenderBal = senderBal - Float.parseFloat(amount);
        
            updateBalance(String.format("%.2f", newSenderBal), sender); 
            
            String ref = referenceCreator();
            makeHistory(sender, ref,"Transfer Balance", sender, receiver, amount, "Complete");
            makeHistory(receiver, ref,"Transfer Balance", sender, receiver, amount, "Complete");
            
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean sendLoad(String accountID, String receiver, String sender, String amount){
        try {
            float senderBal = Float.parseFloat(getBalance(accountID));
            float newSenderBal = senderBal - Float.parseFloat(amount);
        
            updateBalance(String.format("%.2f", newSenderBal), accountID); 
            makeHistory(accountID, null,"Send Load", sender, receiver, amount, "Complete");
            return true;
        } catch (Exception e) {
            return false;
        }
            
    }
}
