//
//Constantine Loucopoulos
//HW 04
//Course Number Java Program
//
//  First compile the program
//      Javac CourseNumber.java
//  Run the program
//      Java CourseNumber//



//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class CourseNumber{
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner myScanner;

        //  Call Scanner constructor
        myScanner=new Scanner(System.in);
        
        // Accept input by prompting user for 6 digit course semester number
        System.out.print("Enter a six digit number giving the course semester: ");
        
        int courseNumber=myScanner.nextInt();
        
        //  Constants
        int year, semesterNumber;
        
        //  Equations
        semesterNumber=courseNumber%100;
        year=(courseNumber-semesterNumber)/100;
        
        
        if (courseNumber>=186510 && courseNumber<=201440){
            if (semesterNumber==10)
            System.out.print("The course was offered in the Spring semester of "+year);
                else if (semesterNumber==20)
                System.out.print("The course was offered in the Summer 1 semester of "+year);
                    else if (semesterNumber==30)
                    System.out.print("The course was offered in the Summer 2 semester of "+year);
                        else if (semesterNumber==40)
                        System.out.print("The course was offered in the Fall semester of "+year);
                            else
                                System.out.print(semesterNumber+" is not a legitimate semester");
        }
            else
                System.out.print("You did not enter an int inside the range [186510,201440]");
                
    }   //  End of main method
}   //  End of class