//
//Constantine Loucopoulos
//Bicycle Java Program
//
//  First compile the program
//      Javac Bicycle.java
//  Run the program
//      Java Bicycle//

//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class Bicycle{

//  Add main method
    public static void main(String[] args)  {
        
//  Declare instance of scanner object
Scanner myScanner;

//  Call Scanner constructor
myScanner=new Scanner(System.in);

//  Accept input by prompting user for number of cyclometer
//  counts and number of seconds during which counts occurred
System.out.print("Enter the number of counts: ");
int cyclometerCount=myScanner.nextInt();

System.out.print("Enter the number of seconds: ");
int secsAmount=myScanner.nextInt();

//  Constants
double wheelDiameter=27.0, //
PI=3.14159, //
feetPerMile=5280, //
inchesPerFoot=12, //
secondsPerMinute=60, //
minutesPerHour=60; //
double tripMinutes, distanceTraveled, avgMPH;

//  Run calculations with stored constants and user input data
distanceTraveled=cyclometerCount*wheelDiameter*PI/inchesPerFoot/feetPerMile;
//  Above gives distance in miles
tripMinutes=secsAmount/secondsPerMinute;
// Above gives duration of trip in minutes
avgMPH=distanceTraveled/(tripMinutes/minutesPerHour);
//  Above give average miles per hour for trip

//  Print out the output data
System.out.println("The distance was "+distanceTraveled+" miles, and took "+tripMinutes+" minutes.");
System.out.println("The average MPH was "+avgMPH+".");


    }   //  End of main method
}   // End of class