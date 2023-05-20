
package HomeWork1.java;



public class Student {
    private String FirstName,LastName,Status,Gender;
    private double gpa;
    
   public Student() {
    FirstName=LastName=Status=Gender="";

    gpa=0;
}
   public void show_myself(){
       System.out.println("First Name : "+FirstName);           
       System.out.println("Last Name : "+LastName);
       System.out.println("Gender : "+Gender);
       System.out.println("Status : "+Status);
       System.out.println("gpa : "+gpa);
           }
   public void study_time(double ST) {
       gpa += Math.log(ST);
         if(gpa > 4.0)
            gpa = 4.0;
       System.out.println("gpa : " + gpa);
        }
   public void add_student(String[] info){
       if(info.length==5){
       FirstName = info[0];
       LastName = info[1];
       Gender = info[2];
       Status = info[3];
       gpa = Double.parseDouble(info[4]);    
       }
       else if(info.length==4){
       FirstName = info[0];
       LastName = info[1];
       Status = info[2];
       gpa = Double.parseDouble(info[3]);    
   }
   }

   public String get_name(){
       return FirstName;
   }
   public double get_gpa(){
       return gpa;
       
   }

}
