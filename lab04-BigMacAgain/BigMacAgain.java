//
//Constantine Loucopoulos
//Lab 04
//BigMac Java Program
//
//  First compile the program
//      Javac BigMac.java
//  Run the program
//      Java BigMac//



//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class BigMacAgain{
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner myScanner;

        //  Call Scanner constructor
        myScanner=new Scanner(System.in);

        //  Accept input by prompting user for number of Big Macs
        System.out.print("Enter the number of Big Macs: ");

        int nBigMacs=myScanner.nextInt();
        
        //  Constants
        double costBigMac$=2.22;
        double costFries$=2.15;
        double totalCostBigMac$, totalCostFries$;

        totalCostBigMac$=nBigMacs*costBigMac$;
        
        
        if (nBigMacs>0) {
            System.out.print("You ordered "+nBigMacs+" Big Macs for a cost of: "+nBigMacs+" x $2.22 = "+totalCostBigMac$);
        }
            
        else {System.out.print("You did not enter an int.");
        return; //  Terminates program
        }
            
            
    }   //  End of main method
}   //  End of classs