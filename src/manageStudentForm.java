
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class manageStudentForm extends javax.swing.JFrame {

    /**
     * Creates new form manageStudentForm
     */
    
     student s=new student();
     DefaultTableModel model;
    public manageStudentForm() {
        initComponents();
        s.fillStudentJtable(jTable1,"");
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        model=(DefaultTableModel) jTable1.getModel();
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.red);
        jTable1.setSelectionBackground(Color.blue);
        
         
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        secondName = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        phone1 = new javax.swing.JTextField();
        address = new java.awt.TextArea();
        edit = new java.awt.Button();
        remove = new java.awt.Button();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        search_id = new javax.swing.JTextField();
        button2 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        student_id1 = new javax.swing.JTextField();
        student_id2 = new javax.swing.JTextField();
        student_id3 = new javax.swing.JTextField();
        student_id4 = new javax.swing.JTextField();
        student_id5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Last Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Sex");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Birthday");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("phone");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("First Name");

        firstName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        secondName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        female.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        female.setText("Female");

        male.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        male.setText("Male");

        phone1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        phone1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone1KeyTyped(evt);
            }
        });

        address.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        edit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        edit.setLabel("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        remove.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        remove.setLabel("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Manage Student");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Id");

        search_id.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        search_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_idActionPerformed(evt);
            }
        });
        search_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_idKeyTyped(evt);
            }
        });

        button2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button2.setLabel("Add");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "sex", "birthday", "phone", "address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        student_id1.setEditable(false);
        student_id1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        student_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_id1ActionPerformed(evt);
            }
        });

        student_id2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        student_id2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_id2ActionPerformed(evt);
            }
        });

        student_id3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        student_id3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_id3ActionPerformed(evt);
            }
        });

        student_id4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        student_id4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_id4ActionPerformed(evt);
            }
        });

        student_id5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        student_id5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_id5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Enter value to search :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel8)
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(student_id2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(313, 313, 313)
                        .addComponent(jLabel9)
                        .addGap(47, 47, 47)
                        .addComponent(search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(secondName, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(female))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(student_id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9)
                    .addComponent(search_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6)
                        .addGap(117, 117, 117)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(secondName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phone1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone1KeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_phone1KeyTyped
    public boolean verifyText()
    {
        if(firstName.getText().equals("")|| student_id1.getText().equals("") || secondName.getText().equals("") || phone1.getText().equals("") || address.getText().equals("")|| jDateChooser1.getDate()==null)
        {
              JOptionPane.showMessageDialog(null,"one or more emtry field");
            return false;
        }
        /// choose a date higher than the current date
        else if(jDateChooser1.getDate().compareTo(new Date())>0)
        {
            JOptionPane.showMessageDialog(null,"invalid date");
             return false;
        }
      else
        return true;
       
    }
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        String fname=firstName.getText();
        String lname=secondName.getText();
        String phone=phone1.getText();
        String addres=address.getText();
       Integer id=Integer.valueOf(student_id1.getText());  ////yyyyy
        String sex = "Male";
        if(female.isSelected())
        {
            sex="Female";
        }
//        }else if(female.isSelected())
//        {
//            sex="Male";
//        }
        if(verifyText())
        {

            SimpleDateFormat dateForm=new SimpleDateFormat("yyyy-MM-dd");
            String bdate=dateForm.format(jDateChooser1.getDate());

            //student std=new student();
            s.insertUpdateDelete('u', id, fname, lname, sex, bdate,phone,addres);
          //  MainForm.Scount1.setText("student count = "+Integer.toString(MyFunction.countData("student")));
          
            manageStudentForm.jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","First Name","Last Name","Sex","Birthday","phone","address"}));
             s.fillStudentJtable(manageStudentForm.jTable1, "");
       }

    }//GEN-LAST:event_editActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
       
        
        /*  
        ALTER TABLE score add CONSTRAINT fk_score_student
        FOREIGN KEY(`student_id`) REFERENCES student('id')
        on DELETE CASCADE
        */
        
        if(student_id1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"no student selected");
        }
        else
        {
            int id=Integer.valueOf(student_id1.getText());
            student std=new student();
            std.insertUpdateDelete('d', id, null, null, null, null,null,null);
            std.fillStudentJtable(jTable1, "");
            jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","First Name","Last Name","Sex","Birthday","phone","address"}));
            s.fillStudentJtable(jTable1, search_id.getText());
            MainForm.Scount1.setText("student count = "+Integer.toString(MyFunction.countData("student")));
              student_id1.setText("");
              firstName.setText("");
              secondName.setText("");
              phone1.setText("");
              address.setText("");
              male.setSelected(false);
             female.setSelected(false);
             jDateChooser1.setDate(null);
             
        }
    }//GEN-LAST:event_removeActionPerformed

    private void search_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_idActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
       addstudentForm form=new addstudentForm();
       form.setVisible(true);
       form.setLocationRelativeTo(null);
       form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
    }//GEN-LAST:event_button2ActionPerformed
        int rowIndex;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        rowIndex=jTable1.getSelectedRow();
        model=(DefaultTableModel) jTable1.getModel();
        male.setSelected(false);
       female.setSelected(false);
       if(model.getValueAt(rowIndex, 3).toString().equals("Male"))
        {
            male.setSelected(true);
        }
        else
        {
            female.setSelected(true);
        }
         student_id1.setText(model.getValueAt(rowIndex, 0).toString());
         firstName.setText(model.getValueAt(rowIndex, 1).toString());
         secondName.setText(model.getValueAt(rowIndex, 2).toString());
         phone1.setText(model.getValueAt(rowIndex, 5).toString());
           address.setText(model.getValueAt(rowIndex, 6).toString());
           
        Date bdate;
         try {
             bdate=new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
             jDateChooser1.setDate(bdate);
         } catch (ParseException ex) {
             Logger.getLogger(manageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void student_id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_id1ActionPerformed

    private void student_id2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_id2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_id2ActionPerformed

    private void student_id3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_id3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_id3ActionPerformed

    private void student_id4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_id4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_id4ActionPerformed

    private void student_id5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_id5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_id5ActionPerformed

    private void search_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_idKeyTyped
       
//    jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","First Name","Last Name","Sex","Birthday","phone","address"}));
//      s.fillStudentJtable(jTable1, search_id.getText());
        
    }//GEN-LAST:event_search_idKeyTyped

    private void search_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_idKeyPressed
      jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","First Name","Last Name","Sex","Birthday","phone","address"}));
      s.fillStudentJtable(jTable1, search_id.getText());
    }//GEN-LAST:event_search_idKeyPressed

    private void search_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_idKeyReleased
         
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","First Name","Last Name","Sex","Birthday","phone","address"}));
         s.fillStudentJtable(jTable1, search_id.getText());
    }//GEN-LAST:event_search_idKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
       
        if(evt.getKeyCode()==KeyEvent.VK_UP||evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
                     rowIndex=jTable1.getSelectedRow();
                    student_id1.setText(model.getValueAt(rowIndex, 0).toString());
                    firstName.setText(model.getValueAt(rowIndex, 1).toString());
                    secondName.setText(model.getValueAt(rowIndex, 2).toString());
                    phone1.setText(model.getValueAt(rowIndex, 5).toString());
                    address.setText(model.getValueAt(rowIndex, 6).toString());
        if(model.getValueAt(rowIndex, 3).toString().equals("Male"))
        {
             female.setSelected(false);
            male.setSelected(true);
        }
        else
        {
             male.setSelected(false);
            female.setSelected(true);
        }
        
                    
        }
             
        Date bdate;
         try {
             bdate=new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
             jDateChooser1.setDate(bdate);
         } catch (ParseException ex) {
             Logger.getLogger(manageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_jTable1KeyReleased

    
    public static void main(String args[]) {
      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea address;
    private java.awt.Button button2;
    private java.awt.Button edit;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstName;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField phone1;
    private java.awt.Button remove;
    private javax.swing.JTextField search_id;
    private javax.swing.JTextField secondName;
    private javax.swing.JTextField student_id1;
    private javax.swing.JTextField student_id2;
    private javax.swing.JTextField student_id3;
    private javax.swing.JTextField student_id4;
    private javax.swing.JTextField student_id5;
    // End of variables declaration//GEN-END:variables

   
}
