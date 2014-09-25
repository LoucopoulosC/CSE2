//
//Constantine Loucopoulos
//HW 04
//Time Padding Java Program
//
//  First compile the program
//      Javac TimePadding.java
//  Run the program
//      Java TimePadding//


//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class TimePadding{
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner myScanner;

        //  Call Scanner constructor
        myScanner=new Scanner(System.in);
        
        //  Prompt user for the time in seconds, and accept input
        System.out.print("Enter the time in seconds: ");
        
        double secondsInput=myScanner.nextInt();
        
        double minutes, hours, seconds;
        int hoursOutput, minutesOutput, secondsOutput;
        
        
        hours=secondsInput/3600;
        hoursOutput=(int)(hours);
        minutes=(hours-hoursOutput)*60;
        minutesOutput=(int)(minutes);
        seconds=(minutes-minutesOutput)*60;
        secondsOutput=((int)(seconds));
        
        System.out.printf("The time is   "+hoursOutput+":%02d:%02d",minutesOutput, secondsOutput);
        
    }   // End of main method
}   //  End of class