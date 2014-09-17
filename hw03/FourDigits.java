//
//Constantine Loucopoulos
//Four Digits Java Program
//
//  First compile the program
//      Javac FourDigits.java
//  Run the program
//      Java FourDigits//

//  Import Scanner
import java.util.Scanner;

//  Defina a Class
public class FourDigits{
    
//  Add main method
    public static void main(String[] args)  {

//  Declare instance of scanner object
Scanner myScanner;

//  Call Scanner constructor
myScanner=new Scanner(System.in);

//  Accept input by prompting user to enter double
System.out.print("Enter a double, and I display the four digits to the right of the decimal point: ");
double originalNumber=myScanner.nextDouble();

//  Variables
double newNumber;

newNumber=(int)((originalNumber*10000)-(((int)originalNumber)*10000));

//  Print out the output data
System.out.println("The four digits are: "+newNumber);


    }   // End of main method
}   //  End of class