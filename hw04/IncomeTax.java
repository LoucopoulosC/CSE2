//
//Constantine Loucopoulos
//HW 04
//Income Tax Java Program
//
//  First compile the program
//      Javac IncomeTax.java
//  Run the program
//      Java IncomeTax//



//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class IncomeTax{
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner myScanner;

        //  Call Scanner constructor
        myScanner=new Scanner(System.in);
        
        //  Accept input by prompting user for income in thousands of dollars
        System.out.print("Enter an int giving your income in thousands: ");
        
        int income$=myScanner.nextInt();
        
        //  Constants
        double incomeTax1$, incomeTax2$, incomeTax3$, incomeTax4$;
        
        //  Equations
        incomeTax1$=(income$*1000)*.05;
        incomeTax2$=(income$*1000)*.07;
        incomeTax3$=(income$*1000)*.12;
        incomeTax4$=(income$*1000)*.14;
        
        
        
        if (income$>=0 && income$<20)
            System.out.print("The tax rate on $"+income$+",000 is 5%, and the tax is $"+incomeTax1$);
        
            else if (income$>=20 && income$<40)
                    System.out.print("The tax rate on $"+income$+",000 is 7%, and the tax is $"+incomeTax2$);
        
                else if (income$>=40 && income$<78)
                        System.out.print("The tax rate on $"+income$+",000 is 12%, and the tax is $"+incomeTax3$);
            
                    else if (income$>=78)
                            System.out.print("The tax rate on $"+income$+",000 is 14%, and the tax is $"+incomeTax4$);
                        
                        else if (income$<0)
                            System.out.print("You did not enter a positive int");
        
                            else
                                System.out.print("You did not enter an int");
                                

    }   //  End of main method
}   //  End of class