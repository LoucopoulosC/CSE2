//
//Constantine Loucopoulos
//HW 06
//Root Java Program
//
//  First compile the program
//      Javac Root.java
//  Run the program
//      Java Root//

//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class Root{
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner myScanner;

        //  Call Scanner constructor
        myScanner=new Scanner(System.in);
        
        //  Prompt user for a double greater than 0
        System.out.print("Enter a double greater than 0: ");
        
        //  Accept user input
        int x=myScanner.nextInt();
        
        //  Declare variables
        double low=0;
        double high=(x+1);
        double middle=0;
        
        //  Run algorithm until interval becomes small enough to identify the root
        while((high-low)>=(high*.0000001))  {
            middle=(high+low)/2;
            
            if (middle*middle>x)    {
                high=middle;
            }
                else {
                    low=middle;
                }
            
        }
        
        System.out.println("Square root of "+x+" = "+middle);
        
        
    }   //  End of main method
    
}   //  End of class