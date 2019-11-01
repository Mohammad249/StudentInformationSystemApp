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
public class StudentsMarkReportViewUI {
     
    private String rollNo;
        private String name;
            private String slass;
                private String bangla;
                    private String english;
                        private String math;
                            private String science;
                                private String islam;
                                    private String ect;
                                     
             public    StudentsMarkReportViewUI(String RollNo,String Name,String Slass, String Bangla,String English,String Math,String Science,String Islam,String Ect)
             {
                  this.rollNo=RollNo;
                   this.name=Name;
                    this.slass=Slass;
                     this.bangla=Bangla;
                      this.english=English;
                       this.math=Math;
                        this.science=Science;
                         this.islam=Islam;
                          this.ect=Ect;
             }
             
           public String getrollNo()
             {
                 return rollNo;
             }
           public String getname()
             {
                 return name;
             }
         public String getslass()
             {
                 return slass;
             }
           public String getbangla()
             {
                 return bangla;
             }
           public String getenglish()
             {
                 return english;
             }
            public String getmath()
             {
                 return math;
             }
          public String getscience()
             {
                 return science;
             }
        public String getislam()
             {
                 return islam;
             }
           public String getect()
             {
                 return ect;
             }

    
                        
}
