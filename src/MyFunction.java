
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MyFunction {
    public static int countData(String tableName) 
    {     
        int total=0;
        try {
           
            
            Connection con=myConnection.getConnection();
            Statement st = null;
            try {
                st = con.createStatement();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            ResultSet rs=st.executeQuery("SELECT count(*) from "+tableName);
            
            while(rs.next())
            {
                total=rs.getInt(1);
            }
            
          
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
        return total;
        
    }
}
