//
//Constantine Loucopoulos
//HW 05
//Boola Boola Java Program
//
//  First compile the program
//      Javac BoolaBoola.java
//  Run the program
//      Java BoolaBoola//


//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class BoolaBoola{
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner in;

        //  Call Scanner constructor
        in=new Scanner(System.in);
        
        //  Declare variables
        boolean a = 1 == (int)((Math.random())*2);
        boolean b = 1 == (int)((Math.random())*2);
        boolean c = 1 == (int)((Math.random())*2);
        
        int rand = (int)(Math.random()*4);
        boolean answer;
        String input;
        
        //  Initiate random scenarios
        switch (rand)   {
            case (0):
                //  Present expression to user
                System.out.println("Does "+a+" || "+b+" || "+c+" have the value true (T/t) or false(F/f)? ");
                answer = a || b || c;
                
                input = in.next();
                
                if (answer==true && (input.equals("t") || input.equals("T")))
                System.out.println("Correct!");
                
                else if (answer==false && (input.equals("f") || input.equals("F")))
                System.out.println("Correct!");
                
                else {
                    System.out.println("Wrong; try again");
                }
            break;
            
            case (1):
                //  Present expression to user
                System.out.println("Does "+a+" && "+b+" && "+c+" have the value true (T/t) or false(F/f)? ");
                answer = a && b && c;
                
                input = in.next();
                
                if (answer==true && (input.equals("t") || input.equals("T")))
                System.out.println("Correct!");
                
                else if (answer==false && (input.equals("f") || input.equals("F")))
                System.out.println("Correct!");
                
                else {
                    System.out.println("Wrong; try again");
                }
            break;
            
            case (2):
                //  Present expression to user
                System.out.println("Does "+a+" && "+b+" || "+c+" have the value true (T/t) or false(F/f)? ");
                answer = a && b || c;
                
                input = in.next();
                
                if (answer==true && (input.equals("t") || input.equals("T")))
                System.out.println("Correct!");
                
                else if (answer==false && (input.equals("f") || input.equals("F")))
                System.out.println("Correct!");
                
                else {
                    System.out.println("Wrong; try again");
                }
            break;
            
            case (3):
                //  Present expression to user
                System.out.println("Does "+a+" || "+b+" && "+c+" have the value true (T/t) or false(F/f)? ");
                answer = a || b && c;
                
                input = in.next();
                
                if (answer==true && (input.equals("t") || input.equals("T")))
                System.out.println("Correct!");
                
                else if (answer==false && (input.equals("f") || input.equals("F")))
                System.out.println("Correct!");
                
                else {
                    System.out.println("Wrong; try again");
                }
            break;
                
                
        }
        
    }   // End of main method
    
}   // End of class