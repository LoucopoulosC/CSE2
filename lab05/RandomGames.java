//
//Constantine Loucopoulos
//Lab 04
//Random Games Java Program
//
//  First compile the program
//      Javac RandomGames.java
//  Run the program
//      Java RandomGames//

//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class RandomGames{
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner myScanner;

        //  Call Scanner constructor
        myScanner=new Scanner(System.in);
        
        //  Accept input by prompting user to enter identifying game letter
        System.out.println("Enter R or r for Roulette, C or c for Craps, P or p for Pick a Card: ");
        
        String gameSelection=myScanner.next();
        
        switch (gameSelection) {
            case ("R"): 
                int randomNumber=(int)((Math.random())*37);
                
                if (randomNumber==37)
                    System.out.println("Roulette: 00");
                    
                    else
                    System.out.println("Roulette: "+randomNumber);
            break;
            
            
            case ("r"):
                
                if (randomNumber==37)
                    System.out.println("Roulette: 00");
                    
                    else
                    System.out.println("Roulette: "+randomNumber);
            break;
            
            
            case ("C"):
            
            break;
            
            case ("c"):
            
            break;
            
            case ("P"):
            
            break;
            
            case ("p"):
            
            break;
            
        }
        
    }
}
        
        