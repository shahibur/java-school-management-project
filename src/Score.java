
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Score {
     
    public static void insertUpdateDelete(char operation,Integer sid,Integer cid,Double scr,String description)
    {
        Connection con=myConnection.getConnection();
        PreparedStatement ps;
        if(operation=='i')
        {
            try {
                
                ps=con.prepareStatement("INSERT INTO `score`(`student_id`, `course_id`, `student_score`, `description`) VALUES (?,?,?,?)");
                  
                 ps.setInt(1,sid);
                 ps.setInt(2, cid);
                 ps.setDouble(3,scr);
                 ps.setString(4, description);
               
                 if(ps.executeUpdate()>0)
                 {
                     JOptionPane.showMessageDialog(null,"Score added");
                 }
                 else
                     JOptionPane.showMessageDialog(null,"Score not added");
            }
                 catch (SQLException ex) {    
               //  JOptionPane.showMessageDialog(null,"add failed");
                 JOptionPane.showMessageDialog(null,ex);
            }
        }
        
         if(operation=='u')
        {
            try {
                
                ps=con.prepareStatement("UPDATE `score` SET `student_score`=?,`description`=? WHERE `student_id`=? AND `course_id`= ?");
                  
               ps.setDouble(1, scr);
               ps.setString(2, description);
               ps.setInt(3, sid);
               ps.setInt(4, cid);
                 if(ps.executeUpdate()>0)
                 {
                     JOptionPane.showMessageDialog(null," Score updated");
                 }
                 else
                     JOptionPane.showMessageDialog(null," Score not updated");
            }
                 catch (SQLException ex) {    
               ///  JOptionPane.showMessageDialog(null,"add failed");
                 JOptionPane.showMessageDialog(null,ex);
            }
        }
         if(operation=='d')
        {
            try {
                
                ps=con.prepareStatement("DELETE FROM score WHERE student_id = ? and course_id = ?");
                 
                  ps.setInt(1, sid);
                  ps.setInt(2, cid);
               
                 if(ps.executeUpdate()>0)
                 {
                     JOptionPane.showMessageDialog(null,"Score deleted");
                 }
                 else
                     JOptionPane.showMessageDialog(null," Score not deleted");
            }
                 catch (SQLException ex) {    
               JOptionPane.showMessageDialog(null,"add failed");
                 JOptionPane.showMessageDialog(null,ex);
            }
        }
        
    }
     public void fillScoreJtable(JTable table)
    {
       Connection con=myConnection.getConnection();
       
       PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM `score`");
            ///  ps=con.prepareStatement("SELECT * FROM `student` ");
            
            
          ///   ps.setString(1,"%"+valueToSearch+"%");
            
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            
            Object[] row;
            while(rs.next())
            {
                row=new Object[4];
                row[0]=rs.getInt(1);
                 row[1]=rs.getInt(2);
                 row[2]=rs.getDouble(3);
                 row[3]=rs.getString(4);
                 
                model.addRow(row);
         
            }
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "connection failed");
        }
      }
      public void showAllScore(JTable table)
    {
       Connection con=myConnection.getConnection();
       
       PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT `student_id`,firstName, lastName , label ,student_score FROM `score` INNER JOIN student as stab on stab.id=`student_id` INNER JOIN course as ctab on ctab.id=`course_id`");
            ///  ps=con.prepareStatement("SELECT * FROM `student` ");
            
            
          ///   ps.setString(1,"%"+valueToSearch+"%");
            
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            
            Object[] row;
            while(rs.next())
            {
                row=new Object[5];
                row[0]=rs.getInt(1);
                 row[1]=rs.getString(2);
                 row[2]=rs.getString(3);
                 row[3]=rs.getString(4);
                  row[4]=rs.getDouble(5);
                 
                model.addRow(row);
         
            }
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "connection failed");
        }
      }
}
