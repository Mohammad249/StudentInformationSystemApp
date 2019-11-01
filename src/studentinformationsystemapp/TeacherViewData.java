/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinformationsystemapp;

/**
 *
 * @author Al Azad
 */
public class TeacherViewData {
      private String  teacherId;
      private String  firstName;
      private String    lastName;
      private String  position;
      private String  email;
      private String   mobileNumber;
      private String   birthDate;
      private String   nationalIdNo;
      private String  sexComboBox;
      private String  permanetAddress;
      private String  currentAddress;
           
           public TeacherViewData(String FirstName ,String LastName, String TeacherId, String Position,String Email, String MobileNumber, String BirthDate,String NationalIdNo,String  SexComboBox,String PermanetAddress,String  CurrentAddress)
           {  
                 
          
                  this.firstName = FirstName;
                   this.lastName = LastName;
                   this.teacherId = TeacherId;
                    this.position = Position;
                     this.email = Email;
                      this.mobileNumber = MobileNumber;
                       this.birthDate = BirthDate;
                        this.nationalIdNo = NationalIdNo;
                          this.sexComboBox = SexComboBox;
                         this.permanetAddress = PermanetAddress;
                          this.currentAddress = CurrentAddress;
                   
                
             
               
           }
              
               public String getteacherId()
           {
               return teacherId;
           }
         
           public String getfirstName()
           {
               return firstName;
           }
           public String getlastName()
           {
               return lastName;
           }
         
           public String getposition()
           {
               return position;
           }
           public String getemail()
           {
               return email;
           }
           public String getmobileNumber()
           {
               return mobileNumber;
           }
           public String getbirthDate()
           {
               return birthDate;
           }
           public String getnationalIdNo()
           {
               return nationalIdNo;
           }
            public String getsexComboBox()
           {
               return sexComboBox;
           }
           public String getpermanetAddress()
           {
               return permanetAddress;
           }
           public String getcurrentAddress()
           {
               return currentAddress;
           }
           
           
}
