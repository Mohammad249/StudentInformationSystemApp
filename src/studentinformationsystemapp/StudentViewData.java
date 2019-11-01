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
public class StudentViewData {
     
     private String  classRollNumber;
      private String  firstName;
      private String    lastName;
      private String   slass;
      private String  Year;
      private String   BirthDate;
      private String   MobileNumber;
       private String  sexComboBox;
      private String   ParmanentAddress;
      private String  CurrentAddress;
      
        public StudentViewData(String ClassRollNumber ,String FirstName, String LastName, String slass,String Year, String BirthDate, String MobileNumber,String  SexComboBox,String ParmanentAddress,String CurrentAddress)
           {  
                 
          
                  this.classRollNumber = ClassRollNumber;
                   this.firstName = FirstName;
                   this.lastName = LastName;
                    this.slass = slass;
                     this.Year = Year;
                      this.BirthDate = BirthDate;
                       this.MobileNumber = MobileNumber;
                           this.sexComboBox = SexComboBox;
                        this.ParmanentAddress = ParmanentAddress;
                         this.CurrentAddress = CurrentAddress;
                      
                   
                
             
               
           }
              
               public String getclassRollNumber()
           {
               return classRollNumber;
           }
         
           public String getfirstName()
           {
               return firstName;
           }
           public String getlastName()
           {
               return lastName;
           }
         
           public String getslass()
           {
               return slass;
                       
           }
           public String getYear()
           {
               return Year;
           }
           public String getBirthDate()
           {
               return BirthDate;
           }
           public String getMobileNumber()
           {
               return MobileNumber;
           }
           public String getsexComboBox()
           {
               return sexComboBox;
           }
           public String getParmanentAddress()
           {
               return ParmanentAddress;
           }
           public String getCurrentAddress()
           {
               return CurrentAddress;
           }
           
      
}
