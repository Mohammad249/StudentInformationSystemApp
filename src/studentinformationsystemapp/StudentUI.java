package studentinformationsystemapp;


import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Al Azad
 */
public class StudentUI extends javax.swing.JFrame {

    /**
     * Creates new form StudentUI
     */
    public StudentUI() {
        initComponents();
          getContentPane().setBackground(Color.CYAN);
          date();
          Clock();
    }
            
    
     public void date()
	{ 
		Thread date = new Thread()
				{
			        public void  run()
			        {
			        	try {
			        		for(;;){
			        		Calendar cal =new GregorianCalendar();
			        		int day = cal.get(Calendar.DAY_OF_MONTH);
			        		int month = cal.get(Calendar.MONTH);
			        		int year = cal.get(Calendar.YEAR);
			        		DateLabel.setText(+day+"-"+month+"-"+year);
			        		
							sleep(1000);
			        		}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			        }
				};
	
				date.start();
				
	}
     
             
      public void Clock()
	{ 
		Thread Clock = new Thread()
				{
			        public void  run()
			        {
			        	try {
			        		for(;;){
			        		Calendar cal =new GregorianCalendar();
			        		int second = cal.get(Calendar.DAY_OF_MONTH);
			        		int minute = cal.get(Calendar.MINUTE);
			        		int hour = cal.get(Calendar.HOUR);
			        		TimeLabel.setText(+hour+":"+minute+":"+second);
			        		
							sleep(1000);
			        		}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			        }
				};
	
				Clock.start();
				
	}

     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        ClassRollNumberTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LastNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ClassTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        YearTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BirthDateTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        MobileNumberTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ParmanentAddressTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CurrentAddressTextField = new javax.swing.JTextField();
        SexComboBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        DateLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        TimeLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        SearchTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        SaveButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        CleareButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ViewDataButton = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Class Roll Number");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("First Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Last Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Class");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Year");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("BIrth Date");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Mobile Number");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Sex");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Parmanent Address");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Current Address");

        SexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Femal" }));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Current Date");

        DateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateLabel.setText("29/03/17");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Time");

        TimeLabel.setBackground(new java.awt.Color(255, 255, 255));
        TimeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeLabel.setText("05:23:59");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });
        SearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextFieldKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search\n");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(DateLabel)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TimeLabel)
                .addGap(34, 34, 34)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(DateLabel)
                    .addComponent(jButton2)
                    .addComponent(TimeLabel)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        SaveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(0, 0, 204));
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(0, 153, 153));
        UpdateButton.setText("Update\n");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        CleareButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CleareButton.setForeground(new java.awt.Color(204, 0, 204));
        CleareButton.setText("Clear");
        CleareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleareButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 0, 0));
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ViewDataButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ViewDataButton.setForeground(new java.awt.Color(0, 102, 102));
        ViewDataButton.setText("View Data");
        ViewDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDataButtonActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("Exit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateButton)
                .addGap(18, 18, 18)
                .addComponent(CleareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewDataButton)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(CleareButton)
                    .addComponent(DeleteButton)
                    .addComponent(ViewDataButton)
                    .addComponent(jButton10)
                    .addComponent(UpdateButton))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystemapp/schoolkids1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ParmanentAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CurrentAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BirthDateTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(YearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(30, 30, 30)
                            .addComponent(ClassRollNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(ClassRollNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel7))
                            .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ClassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(YearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(BirthDateTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(MobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(SexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ParmanentAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CurrentAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 865, 764);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            StudentMainUI studentMainUI = new StudentMainUI();
           studentMainUI.show();
          this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        
         if(ClassRollNumberTextField.getText().equals(""))
         {
             JOptionPane.showMessageDialog(this, "Please fill ClassRollNo");   
         }
         else if(FirstNameTextField.getText().equals(""))
         {
              JOptionPane.showMessageDialog(this, "Please fill First name");  
         }
         else if(LastNameTextField.getText().equals(""))
         {
              JOptionPane.showMessageDialog(this, "Please fill Last Name");  
         }
         
          else if(ClassTextField.getText().equals(""))
         {
              JOptionPane.showMessageDialog(this, "Please Class");  
         }
          else if(YearTextField.getText().equals(""))
         {
              JOptionPane.showMessageDialog(this, "Please Year");  
         }
        
         else if(BirthDateTextField7.getText().equals(""))
         {
              JOptionPane.showMessageDialog(this, "Please fill Birth Date");  
         }
          else if(MobileNumberTextField.getText().equals(""))
         {
              JOptionPane.showMessageDialog(this, "Please fill Your Mobile No");  
         }
         else if(ParmanentAddressTextField.getText().equals(""))
         {
              JOptionPane.showMessageDialog(this, "Please fill Your Permanent Address");  
         }
           else if(CurrentAddressTextField.getText().equals(""))
         {
              JOptionPane.showMessageDialog(this, "Please fill Your Current Address");  
         }
         
         else
           {
               
             try {
                 Statement stmt = null;
                  Connection con = DBconnectionStudents.GetConnection();
                   stmt = con.createStatement();
                 String query ="INSERT INTO students VALUES('"+ClassRollNumberTextField.getText()+"','"+FirstNameTextField.getText()+"','"+LastNameTextField.getText()+"','"+ClassTextField.getText()+"','"+YearTextField.getText()+"','"+BirthDateTextField7.getText()+"','"+MobileNumberTextField.getText()+"','"+SexComboBox.getSelectedItem().toString()+"','"+ParmanentAddressTextField.getText()+"','"+CurrentAddressTextField.getText()+"')";
                      
                 int RowsAffected =  stmt.executeUpdate(query);
                 JOptionPane.showMessageDialog(this,RowsAffected+"New regiration" );
             ClassRollNumberTextField.setText("");
           FirstNameTextField.setText("");
           LastNameTextField.setText("");
           ClassTextField.setText("");
           YearTextField.setText("");
             BirthDateTextField7.setText("");
           MobileNumberTextField.setText("");
           ParmanentAddressTextField.setText("");
           CurrentAddressTextField.setText("");
          
             } catch (SQLException ex) {
                 Logger.getLogger(StudentUI.class.getName()).log(Level.SEVERE, null, ex);
             }
               
          
               
           }
        
    }//GEN-LAST:event_SaveButtonActionPerformed
      
    
    //Forserch
    private void SearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextFieldKeyReleased
        // TODO add your handling code here:
        try{
              Connection con = DBconnectionStudents.GetConnection();
              String quary = "SELECT * FROM students WHERE ClassRollNumber LIKE '%"+SearchTextField.getText()+"'"; 
              
              PreparedStatement ps=con.prepareStatement(quary);
              //pst.setString(1,search_TextField.getText());
              ResultSet rs = ps.executeQuery();
              if(rs.next())
              {
                  String add1=rs.getString("ClassRollNumber");
                  ClassRollNumberTextField.setText(add1);
                   String add2=rs.getString("FirstName");
                  FirstNameTextField.setText(add2);
                   String add3=rs.getString("LastName");
                  LastNameTextField.setText(add3);
                   String add4=rs.getString("slass");
                  ClassTextField.setText(add4);
                   String add5=rs.getString("Year");
                  YearTextField.setText(add5);
                    String add6=rs.getString("BirthDate");
                    BirthDateTextField7.setText(add6);
                     String add7=rs.getString("MobileNumber");
                  MobileNumberTextField.setText(add7);
                     String add8=rs.getString("ParmanentAddress");
                  ParmanentAddressTextField.setText(add8);
                     String add9=rs.getString("CurrentAddress");
                   CurrentAddressTextField.setText(add9);
                     
                  
              }
          }catch(Exception e)
          {
                     JOptionPane.showMessageDialog(this, e );
          }
        
    }//GEN-LAST:event_SearchTextFieldKeyReleased
     
    
    //forUpdate
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        
         try{
            Connection con = DBconnectionStudents.GetConnection();
            String valu1= ClassRollNumberTextField.getText();
            String valu2= FirstNameTextField.getText();
            String valu3= LastNameTextField.getText();
            String valu4= ClassTextField.getText();
            String valu5= YearTextField.getText();
            String valu6= BirthDateTextField7.getText();
            String valu7= MobileNumberTextField.getText();
            String valu8= ParmanentAddressTextField.getText();
            String valu9= CurrentAddressTextField.getText();
            
            String quary = "UPDATE  students  set ClassRollNumber='"+valu1+"',FirstName='"+valu2+"',LastName='"+valu3+"',slass='"+valu4+"',Year='"+valu5+"',BirthDate='"+valu6+"',MobileNumber='"+valu7+"',ParmanentAddress='"+valu8+"',CurrentAddress='"+valu9+"'WHERE ClassRollNumber ='"+valu1+"'"; 
            PreparedStatement ps=con.prepareStatement(quary);
            ps.execute();
             JOptionPane.showMessageDialog(this, "Update");
             
            
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, e );
        }
        
    }//GEN-LAST:event_UpdateButtonActionPerformed
     //for delete Data form table
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
         try
        {
             Connection con = DBconnectionStudents.GetConnection();
                String quary ="DELETE FROM students WHERE ClassRollNumber='"+ClassRollNumberTextField.getText()+"'";
                Statement ps=con.createStatement();
                ps.executeUpdate(quary);
                JOptionPane.showMessageDialog(this, "Delete" );
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e );
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ViewDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDataButtonActionPerformed
        // TODO add your handling code here:
        StudentViewAllDataUI studentViewAllDataUI = new StudentViewAllDataUI();
        studentViewAllDataUI.show();;
        this.hide();
    }//GEN-LAST:event_ViewDataButtonActionPerformed

    private void CleareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleareButtonActionPerformed
        // TODO add your handling code here:
        
          ClassRollNumberTextField.setText("");
           FirstNameTextField.setText("");
           LastNameTextField.setText("");
     
           ClassTextField.setText("");
           YearTextField.setText("");
           BirthDateTextField7.setText("");
           MobileNumberTextField.setText("");
           ParmanentAddressTextField.setText("");
           CurrentAddressTextField.setText("");
       
    }//GEN-LAST:event_CleareButtonActionPerformed

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextFieldActionPerformed
       
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BirthDateTextField7;
    private javax.swing.JTextField ClassRollNumberTextField;
    private javax.swing.JTextField ClassTextField;
    private javax.swing.JButton CleareButton;
    private javax.swing.JTextField CurrentAddressTextField;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JTextField MobileNumberTextField;
    private javax.swing.JTextField ParmanentAddressTextField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JComboBox<String> SexComboBox;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton ViewDataButton;
    private javax.swing.JTextField YearTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}