
import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sun.util.logging.PlatformLogger;


public class course {
    

    
    public static void insertUpdateDelete(char operation,Integer id,String label,Integer hours)
    {
        Connection con=myConnection.getConnection();
        PreparedStatement ps;
        if(operation=='i')
        {
            try {
                
                ps=con.prepareStatement("INSERT INTO course(label,hoursNamber) VALUES (?,?)");
                  
                 ps.setString(1, label);
                 ps.setInt(2, hours);
               
                 if(ps.executeUpdate()>0)
                 {
                     JOptionPane.showMessageDialog(null,"new course added");
                 }
                 else
                     JOptionPane.showMessageDialog(null,"new course not added");
            }
                 catch (SQLException ex) {    
               //  JOptionPane.showMessageDialog(null,"add failed");
                 JOptionPane.showMessageDialog(null,ex);
            }
        }
        
         if(operation=='u')
        {
            try {
                
                ps=con.prepareStatement("UPDATE course SET label = ?, hoursNamber = ? WHERE id = ?");
                  
                 ps.setString(1, label);
                 ps.setInt(2, hours);
                  ps.setInt(3, id);
               
                 if(ps.executeUpdate()>0)
                 {
                     JOptionPane.showMessageDialog(null," course data updated");
                 }
                 else
                     JOptionPane.showMessageDialog(null," course data not updated");
            }
                 catch (SQLException ex) {    
               ///  JOptionPane.showMessageDialog(null,"add failed");
                 JOptionPane.showMessageDialog(null,ex);
            }
        }
         if(operation=='d')
        {
             int YesOrNo=JOptionPane.showConfirmDialog(null,"The scores will be also deleted","Delete Score",JOptionPane.OK_CANCEL_OPTION,0);
            
            //// return 0 for Yes
            if(YesOrNo==JOptionPane.OK_OPTION)
            {
            try {
                
                ps=con.prepareStatement("DELETE FROM `course` WHERE `id`=?");
                 
                  ps.setInt(1, id);
               
                 if(ps.executeUpdate()>0)
                 {
                     JOptionPane.showMessageDialog(null," course deleted");
                 }
                 else
                     JOptionPane.showMessageDialog(null," course not deleted");
            }
                 catch (SQLException ex) {    
                /// JOptionPane.showMessageDialog(null,"add failed");
                 JOptionPane.showMessageDialog(null,ex);
            }
            }
        }
        
    }
     public boolean isCourseExist(String courseName)
    {
        
        boolean isExist=false;
         Connection con=myConnection.getConnection();
       
       PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM course WHERE label = ? ");
            ///  ps=con.prepareStatement("SELECT * FROM `student` ");
            
            
             ps.setString(1,courseName);
            
            ResultSet rs=ps.executeQuery();
 
            if(rs.next())
            { 
              isExist= true;  
            }
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
         
        }
      
        return isExist;
        
    }
     
     
      public void fillCourseJtable(JTable table)
    {
       Connection con=myConnection.getConnection();
       
       PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM `course`");
            ///  ps=con.prepareStatement("SELECT * FROM `student` ");
            
            
          ///   ps.setString(1,"%"+valueToSearch+"%");
            
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            
            Object[] row;
            while(rs.next())
            {
                row=new Object[3];
                row[0]=rs.getInt(1);
                 row[1]=rs.getString(2);
                 row[2]=rs.getInt(3);
                 
                model.addRow(row);
         
            }
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "connection failed");
        }
      }
      
      public int getCourseId(String courseLabel)
      {
          int courseId = 0;
             Connection con=myConnection.getConnection();
       
       PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM course WHERE label = ? ");
            ///  ps=con.prepareStatement("SELECT * FROM `student` ");
            
            
             ps.setString(1,courseLabel);
            
            ResultSet rs=ps.executeQuery();
 
            if(rs.next())
            { 
             courseId=rs.getInt("Id");
            }
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
         
        }
          return courseId;
      }
      
      
   public void fillCourseCombo(JComboBox Combo)
    {
       Connection con=myConnection.getConnection();
       
       PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM `course`");
            ///  ps=con.prepareStatement("SELECT * FROM `student` ");
            
            
          ///   ps.setString(1,"%"+valueToSearch+"%");
            
            ResultSet rs=ps.executeQuery();
          
            while(rs.next())
            {
               Combo.addItem(rs.getString(2));
         
            }
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "connection failed");
        }
      }

   
}

