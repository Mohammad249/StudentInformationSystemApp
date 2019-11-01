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
public class TeachePaymentReportView {
    private String  teacheId;
      private String  teachername;
      private String   date;
      private String   payment;
      private String   totaldue;
      
        public TeachePaymentReportView(String TeacherId ,String TeacherName,  String Date,String Payment, String TotalDue)
           {  
                 
          
                  this.teacheId = TeacherId;
                   this.teachername = TeacherName;
                     this.date = Date;
                      this.payment = Payment;
                       this.totaldue = TotalDue;

           }
        
            public String getteacheId()
           {
               return teacheId;
           }
         
           public String getteachername()
           {
               return teachername;
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
}
