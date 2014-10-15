//
//Constantine Loucopoulos
//HW 06
//Roulette Java Program
//
//  First compile the program
//      Javac Roulette.java
//  Run the program
//      Java Roulette//


//  Define a Class
public class Roulette{
    
    //  Add main method
    public static void main(String[] args)  {
        
        //  Declare variables
        int rouletteInt=(int)((Math.random())*37);
        int chosenNumber;
        int spinNumber=0;
        int trialNumber=0;
        int successCount=0;
        int failureCount=0;
        int profitCount=0;
        
        //  Output the number chosen for the user
        if (rouletteInt<36) {
            chosenNumber=rouletteInt;
        }
            else    {
                chosenNumber=00;
            }
        
        System.out.println("The number you are betting on is: "+chosenNumber);

        //  Run the trial 1000 times
        while (trialNumber<1000)   {
            trialNumber++;
                
                // One trial is constituted by 100 spins, so run 100 spins per trial
                while (spinNumber<100)  {
                    spinNumber++;
                    
                    int rouletteOutcome=(int)((Math.random())*37);
                    
                    if (rouletteOutcome==rouletteInt)   {
                        successCount++;
                    }
                        else if (rouletteOutcome!=rouletteInt)  {
                            failureCount++;
                        }
                    
                }
                
                spinNumber=0;
                
                if (successCount>=3) {
                    profitCount++;
                }
                
                successCount=0;    
        }
        
        System.out.println("You gained profit "+profitCount+" trials out of 1000");
        System.out.println("You lost money "+(1000-profitCount)+" trials out of 1000");
            
        
        
        
    }   //  End of main method
    
}   //  End of class