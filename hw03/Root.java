//
//Constantine Loucopoulos
//Root Java Program
//
//  First compile the program
//      Javac Root.java
//  Run the program
//      Java Root//

//  Import Scanner
import java.util.Scanner;

//  Defina a Class
public class Root{
    
//  Add main method
    public static void main(String[] args)  {

//  Declare instance of scanner object
Scanner myScanner;

//  Call Scanner constructor
myScanner=new Scanner(System.in);

//  Accept input by prompting user for number that will be cube rooted
System.out.print("Enter a double, and I print its cube root: ");
double originalNumber=myScanner.nextDouble();

//  Variables
double guess, guess2, guess3, guess4, guess5, guess6, guessCubed;

//  Run first calculation for rough estimate of cube root 
//  by dividing input number by 3
guess=originalNumber/3;
//  Keep improving answer by adjusting equation using previous guess
guess2=((guess*guess*guess+originalNumber)/(3*guess*guess));
guess3=((guess2*guess2*guess2+originalNumber)/(3*guess2*guess2));
guess4=((guess3*guess3*guess3+originalNumber)/(3*guess3*guess3));
guess5=((guess4*guess4*guess4+originalNumber)/(3*guess4*guess4));
guess6=((guess5*guess5*guess5+originalNumber)/(3*guess5*guess5));

//  Cube guess4 to give a rough cube estimate of your guess.
//  Answer should be close to originalNumber
guessCubed=guess4*guess4*guess4;

//  Print out the output data
System.out.println("The cube root is "+guess4+": "+guess4+"*"+guess4+"*"+guess4+"="+guessCubed);


    }   //  End of main method
}   //  End of Class