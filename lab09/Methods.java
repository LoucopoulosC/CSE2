//
//Constantine Loucopoulos
//Lab 09
//Methods Java Program
//
//  First compile the program
//      Javac Methods.java
//  Run the program
//      Java Methods//

//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class Methods{
    
    public int getInt(int myScanner);
    public int larger(int a, int b) {
        if (a > b) {
            System.out.println(a);
        }
            else if (b > a) {
                System.out.println(b);
            }
    }
    
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner myScanner;

        //  Call Scanner constructor
        myScanner=new Scanner(System.in);
        
        //  Declare variables
        int a,b,c;
        
        System.out.println("Enter three ints: ");
        a=getInt(myScanner);
        b=getInt(myScanner);
        c=getInt(myScanner);
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
        System.out.println("The larger of "+a+", "+b+", and "+c+
                           " is "+larger(a,larger(b,c)));
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                           ", and "+c+" are in ascending order");


    }   //  End of main method
    
}   // End of class