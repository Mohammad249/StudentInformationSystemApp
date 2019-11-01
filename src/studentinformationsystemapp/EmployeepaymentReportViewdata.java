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
public class EmployeepaymentReportViewdata {
      private String  employeeId;
      private String  employeename;
      private String   position;
      private String   date;
      private String   payment;
      private String   totaldue;
      
        public EmployeepaymentReportViewdata(String EmployeeId ,String Employeename, String Position, String Date,String Payment, String TotalDue)
           {  
                 
          
                  this.employeeId = EmployeeId;
                   this.employeename = Employeename;
                    this.position = Position;
                     this.date = Date;
                      this.payment = Payment;
                       this.totaldue = TotalDue;
                       
                      
                   
                
             
               
           }
        
            public String getemployeeId()
           {
               return employeeId;
           }
         
           public String getdate()
           {
               return date;
           }
           public String getemployeename()
           {
               return employeename;
           }
         
           public String getposition()
           {
               return position;
                       
           }
           public String getpayment()
           {
               return payment;
           }
           public String gettotaldue()
           {
               return totaldue;
           }
}
