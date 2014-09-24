//
//Constantine Loucopoulos
//HW 04
//Month Java Program
//
//  First compile the program
//      Javac Month.java
//  Run the program
//      Java Month//



//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class Month{
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner myScanner;

        //  Call Scanner constructor
        myScanner=new Scanner(System.in);
        
        //  Accept input by prompting user for a number (1-12) corresponding to a month.
        //  If the month is February (2) then prompt the user for the year as well.
        System.out.print("Enter an int giving the number of the month (1-12): ");
        
        int month=myScanner.nextInt();
        
        
        
        
        if (month==1)
            System.out.print("The month has 31 days");
        
            else if (month==2) {
                    //  Prompt user to enter year
                    System.out.print("Enter an int giving the year: ");
                    
                    //  Accept input from user
                    int year=myScanner.nextInt();
                        
                        if (year%4==0)
                        System.out.print("The month has 29 days");
                        else
                            System.out.print("The month has 28 days");
                        }
        
                else if (month==3)
                        System.out.print("The month has 31 days");
        
                    else if (month==4)
                            System.out.print("The month has 30 days");
                    
                        else if (month==5)
                                System.out.print("The month has 31 days");
                               
                            else if (month==6)
                                    System.out.print("The month has 30 days");
    
                                else if (month==7)
                                        System.out.print("The month has 31 days");
                        
                                    else if (month==8)
                                            System.out.print("The month has 31 days");
                                    
                                        else if (month==9)
                                                System.out.print("The month has 30 days"); 
                                            
                                            else if (month==10)
                                                    System.out.print("The month has 31 days");
                               
                                                else if (month==11)
                                                        System.out.print("The month has 30 days");
                        
                                                    else if (month==12)
                                                            System.out.print("The month has 31 days");
                                            
                                                        else if (month<=0 || month>12)
                                                                System.out.print("You did not enter an int (1-12)");
                                                    
                                                            else
                                                                System.out.print("You did not enter an int");
                                                                
                                                                
    }   // End of main method
}   //  End of class