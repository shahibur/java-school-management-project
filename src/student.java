
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class student {
    
    public static void insertUpdateDelete(char operation,Integer id,String fname,String lname,String sex,String bdate,String phone,String address)
    {
        Connection con=myConnection.getConnection();
        PreparedStatement ps;
        if(operation=='i')
        {
            try {
                
                ps=con.prepareStatement("INSERT INTO student(firstName, lastName, sex, birthday, phone, address) VALUES (?,?,?,?,?,?)");
                  
                 ps.setString(1, fname);
                 ps.setString(2, lname);
                 ps.setString(3, sex);
                 ps.setString(4, bdate);
                 ps.setString(5,phone);
                 ps.setString(6, address);
               
                 if(ps.executeUpdate()>0)
                 {
                     JOptionPane.showMessageDialog(null,"new student added");
                 }
                 else
                     JOptionPane.showMessageDialog(null,"new student not added");
            }
                 catch (SQLException ex) {    
                 JOptionPane.showMessageDialog(null,"add failed");
                 JOptionPane.showMessageDialog(null,ex);
            }
        }
        
         if(operation=='u')
        {
            
            try {
                
                ps=con.prepareStatement("UPDATE student SET firstName = ?, lastName = ?, sex = ?, birthday = ?, phone = ?, address = ? WHERE id = ?");
                  
                 ps.setString(1, fname);
                 ps.setString(2, lname);
                 ps.setString(3, sex);
                 ps.setString(4, bdate);
                 ps.setString(5,phone);
                 ps.setString(6, address);
                 ps.setInt(7, id);
               
                 if(ps.executeUpdate()>0)
                 {
                     JOptionPane.showMessageDialog(null," student updated");
                 }
                 else
                     JOptionPane.showMessageDialog(null," student not updated");
            }
                 catch (SQLException ex) {    
                 JOptionPane.showMessageDialog(null,"add failed");
                 JOptionPane.showMessageDialog(null,ex);
            }
        }
         if(operation=='d')
        {
            int YesOrNo=JOptionPane.showConfirmDialog(null,"The scores will be also deleted","Delete Student",JOptionPane.OK_CANCEL_OPTION,0);
            
            //// return 0 for Yes
            if(YesOrNo==JOptionPane.OK_OPTION)
            {
              try {
                
                ps=con.prepareStatement("DELETE FROM `student` WHERE id = ?");
                 
                  ps.setInt(1, id);
               
                 if(ps.executeUpdate()>0)
                 {
                     JOptionPane.showMessageDialog(null," student deleted");
                 }
                 else
                     JOptionPane.showMessageDialog(null," student not deleted");
            }
                 catch (SQLException ex) {    
                 JOptionPane.showMessageDialog(null,"add failed");
                 JOptionPane.showMessageDialog(null,ex);
            }
              
            }
          
        }
        
    }


   public void fillStudentJtable(JTable table,String valueToSearch)
   {
       Connection con=myConnection.getConnection();
       
       PreparedStatement ps;
        try {
          ps=con.prepareStatement("SELECT * FROM `student` WHERE CONCAT(firstName,lastName,phone,address) LIKE ?");
            ///ps=con.prepareStatement("SELECT * FROM `student_info` WHERE `id`=?");
            ///  ps=con.prepareStatement("SELECT * FROM `student` ");
            
            
             ps.setString(1,"%"+valueToSearch+"%");
            
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            
            Object[] row;
            while(rs.next())
            {
                row=new Object[7];
                row[0]=rs.getInt(1);
                 row[1]=rs.getString(2);
                  row[2]=rs.getString(3);
                  row[3]=rs.getString(4);
                   row[4]=rs.getString(5);
                    row[5]=rs.getString(6);
                     row[6]=rs.getString(7);
                     
                     model.addRow(row);
                    
                
            }
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "connection failed");
        }
      }

}
