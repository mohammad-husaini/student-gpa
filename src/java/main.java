
package HomeWork1.java;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class main {

 
 
    public static void main(String[] args) {
        
        try {
            ArrayList<Student> students = new ArrayList<Student>();

            Scanner scanner = new Scanner(new File("D:\\Student.txt")).useDelimiter("\\n");
            while(scanner.hasNext()){
                String SI = scanner.next();
                String[] info = SI.split(",");
                Student student = new Student();
                student.add_student(info);
                student.show_myself();
                students.add(student);
            }
            Scanner input = new Scanner(System.in);
                double ST;
                for(int i = 0 ; i < students.size();i++) {
                        System.out.println("Enter Study Time for -> " + students.get(i).get_name() + " : ");
                        ST = input.nextDouble();
                        students.get(i).study_time(ST);                 
                }    
                Collections.sort(students, (Student g1, Student g2) -> Double.valueOf(g1.get_gpa()).compareTo(g2.get_gpa()));
                System.out.println("\n"+"Students new gpa : "+"\n");
                for(int i = 0 ; i < students.size();i++)
                        students.get(i).show_myself();
                
                
        } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
            
      
    }
    
}
