//
//Constantine Loucopoulos
//HW 05
//Burger King Java Program
//
//  First compile the program
//      Javac BurgerKing.java
//  Run the program
//      Java BurgerKing//

//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class BurgerKing{
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner myScanner;

        //  Call Scanner constructor
        myScanner=new Scanner(System.in);
        
        //  Prompt user for order.
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.print("Fries (F or f) : ");
        
        //  Accept user input
        String order=myScanner.next();
        
        if (order.length == 1)  {
        
            switch (order)  {
                case ("b"):
                case ("B"):
                    //  Prompt user for toppings
                    System.out.println("Enter A or a for 'all the fixins'");
                    System.out.println("C or c for cheese");
                    System.out.print("N or n for none of the above: ");
                    
                    //  Accept user input
                    String order2=myScanner.next();
                
                    switch (order2) {
                        case ("c"):
                        case ("C"):
                            //  Return customer's order
                            System.out.println("You ordered a burger with cheese");
                        break;
                        
                        case ("a"):
                        case ("A"):
                            //  Return customer's order
                            System.out.println("You ordered a burger with 'all the fixins'");
                        break;
                        
                        case ("n"):
                        case ("N"):
                            //  Return customer's order
                            System.out.println("You ordered none of the above");
                        break;
                    }
                break;
                
                case ("s"):
                case ("S"):
                    //  Prompt user for soda choice
                    System.out.println("Do you want Pepsi (P or p),");
                    System.out.println("Coke (C or c),");
                    System.out.println("Sprite (S or s),");
                    System.out.print("or Mountain Dew (M or m): ");
                    
                    //  Accept user input
                    String order3=myScanner.next();
                    
                    switch (order3) {
                        case ("p"):
                        case ("P"):
                            //  Return customer's order
                            System.out.println("You ordered a Pepsi");
                        break;
                        
                        case ("c"):
                        case ("C"):
                            //  Return customer's order
                            System.out.println("You ordered a Coke");
                        break;
                            
                        case ("s"):
                        case ("S"):
                            //  Return customer's order
                            System.out.println("You ordered a Sprite");
                        break;
                        
                        case ("m"):
                        case ("M"):
                            //  Return customer's order
                            System.out.println("You ordered a Mountain Dew");
                        break;
                    }
                break;
                
                case ("f"):
                case ("F"):
                    //  Prompt user for fry order
                    System.out.print("Do you want a large (L or l) or a small (S or s) order of fries: ");
                    
                    //  Accept user input
                    String order4=myScanner.next();
                    
                    switch (order4) {
                        case ("l"):
                        case ("L"):
                            //  Return customer's order
                            System.out.println("You ordered large fries");
                        break;
                        
                        case ("s"):
                        case ("S"):
                            //  Return customer's order
                            System.out.println("You ordered small fries");
                        break;
                    }
                break;
                
                default:
                    System.out.println("You did not enter an acceptable character");
                
            }
        }
        
        else
            System.out.println("A single character was expected");
        
        
    }   //End of main method
}   //End of class