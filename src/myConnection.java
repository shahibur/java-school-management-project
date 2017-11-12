
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class myConnection {
    
    public static Connection getConnection() 
    {
        
        Connection con=null;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement_db?zeroDateTimeBehavior=convertToNull", "root","");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        return con;
        
    }
}
