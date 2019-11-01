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
public class StudentreportViewPayment {
    private String  sudentroll;
      private String  studentname;
       private String slass;
      private String   date;
      private String   payment;
      private String   totaldue;
           private String   reason;
             
        public StudentreportViewPayment(String StudentRoll ,String StudentName,  String Slass,String Date,String Payment, String TotalDue,String Reason)
           {  
                 
          
                  this.sudentroll = StudentRoll;
                   this.studentname = StudentName;
                       this.slass = Slass;
                     this.date = Date;
                      this.payment = Payment;
                       this.totaldue = TotalDue;
                            this.reason = Reason;

           }
        
        
            public String getsudentroll()
           {
               return sudentroll;
           }
         
           public String getstudentname()
           {
               return studentname;
           }
            public String getslass()
           {
               return slass;
           }
           
           public String getdate()
           {
               return date;
           }
         
           public String getpayment()
           {
               return payment;
           }
           public String gettotaldue()
           {
               return totaldue;
           }
             public String getreason()
           {
               return reason;
           }
}
