//
//Constantine Loucopoulos
//Lab 07
//Loop The Loop Java Program
//
//  First compile the program
//      Javac LoopTheLoop.java
//  Run the program
//      Java LoopTheLoop//

//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class LoopTheLoop{
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner myScanner;

        //  Call Scanner constructor
        myScanner=new Scanner(System.in);
        
        //  Variables
        int nStars = 10;
        String a = "*";
        int n = 0;
        
        if (nStars>=1 && nStars <=15)   {
                while (n<nStars)    {
                    n++;
                    System.out.print(a);
            }
            System.out.println();
        }
        else
            System.out.println("You did not enter an int between 1 and 15");

        
    }   //  End of main method
    
}   //  End of class
    
        
       