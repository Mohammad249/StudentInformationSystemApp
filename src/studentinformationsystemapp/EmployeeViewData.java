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
public class EmployeeViewData {
    
       private String  employeeId;
      private String   firstName;
      private String   lastName;
      private String   position;
      private String   birthDate;
      private String   mobileNo;
      private String   email;
      private String   parmanentAddress;
      private String   currentAddress;
      
      
        public EmployeeViewData(String EmployeeId ,String FirstName, String LastName, String Position,String BirthDate, String MobileNo, String Email,String ParmanentAddress,String CurrentAddress)
           {  
                 
          
                  this.employeeId = EmployeeId;
                   this.firstName = FirstName;
                   this.lastName = LastName;
                    this.position = Position;
                     this.birthDate = BirthDate;
                      this.mobileNo = MobileNo;
                       this.email = Email;
                        this.parmanentAddress = ParmanentAddress;
                         this.currentAddress = CurrentAddress;
                      
                   
                
             
               
           }
              
               public String getemployeeId()
           {
               return employeeId;
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
           public String getbirthDate()
           {
               return birthDate;
           }
           public String getmobileNo()
           {
               return mobileNo;
           }
           public String getemail()
           {
               return email;
           }
         
           public String getparmanentAddress()
           {
               return parmanentAddress;
           }
           public String getcurrentAddress()
           {
               return currentAddress;
           }
}
