package librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class JavaDbConnect {
    private static Connection connection = null;
    
    public static Connection dbConnect(){
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:LibraryManagement.sqlite");
            return connection;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , e);
            return null;
        }
    }
}