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
public class StudentAtttendencsReportClass {
     private String roll;
        private String slass;
            private String date;
                private String morning;
                    private String afternone;  
                    
                    public  StudentAtttendencsReportClass(String Roll,String Slass,String Date,String Morning,String Afternone)
                    {
                         this.roll=Roll;
                            this.slass=Slass;
                             this.date=Date;
                              this.morning=Morning;
                               this.afternone=Afternone;
                      
                    }
                    
            public String getroll()
             {
                 return roll;
             }
              public String getslass()
             {
                 return slass;
             }
                public String getdate()
             {
                 return date;
             }
                  public String getmorning()
             {
                 return morning;
             }
             
                      public String getafternone()
             {
                 return afternone;
             }
    
}
