package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class transactionConnections {
    
    public static Boolean transactionCreator(String accountId, String transaction, String studentID, String yearLevel, String sem, String course, String amount, String status){
        
        try (Connection connection = DatabaseConfig.getconnection()){
            String query = "INSERT INTO transactions (Account_id, Reference_Number, Date_Time, Transaction, Student_ID, Year_level, Semester, Course, Amount, Status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(query);

            String reference = database.StudentConnection.referenceCreator();
            String dateTime = database.StudentConnection.getDateTime();
            
            statement.setString(1, accountId);
            statement.setString(2, reference);
            statement.setString(3, dateTime);
            statement.setString(4, transaction);
            statement.setString(5, studentID);
            statement.setString(6, yearLevel);
            statement.setString(7, sem);
            statement.setString(8, course);
            statement.setString(9, amount);
            statement.setString(10, status);

            statement.executeUpdate();
            
            connection.close();
            return true;
            }
            
            catch (SQLException ex) {
            //temp
            return false;
        }
    } 
}
