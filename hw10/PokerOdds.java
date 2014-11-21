//
//Constantine Loucopoulos
//Poker Odds Java Program
//
//  First compile the program
//      Javac PokerOdds.java
//  Run the program
//      Java PokerOdds//


//  Import Random Number Generator
import java.util.Random;

//  Import Scanner
import java.util.Scanner;

//  Define a class
public class PokerOdds{

  public static void main(String [] arg){
    
    showHands();
    
    //simulateOdds();
    
    
  } //  End of main method


  public static void showHands()  {
    
    //  Declare variables
    String clubs = "Clubs: ";
    String diamonds = "Diamonds: ";
    String hearts = "Hearts: ";
    String spades = "Spades: ";
    
    for (int i=0; i<5; i++) {
      
      int card = (int)((Math.random())*51);
      
      int value = card/13;
      int number = card%13;

      if (value==0)  {
        if (card==0)  {
          clubs+="K ";
        }
          else if (card==1)  {
            clubs+="A ";
          }
            else if (card==11) {
              clubs+="J ";
            }
              else if (card==12) {
              clubs+="Q ";
            }
                else  {
                  clubs+=number+" ";
                }
      }
        
      else if (value==1)  {
          if (number==0)  {
            diamonds+="K ";
          }
            else if (number==1)  {
              diamonds+="A ";
            }
              else if (number==11) {
                diamonds+="J ";
              }
                else if (number==12) {
                diamonds+="Q ";
              }
                  else  {
                    diamonds+=number+" ";
                  }
        }
        
        else if (value==2)  {
          if (number==0)  {
            hearts+="K ";
          }
            else if (number==1)  {
              hearts+="A ";
            }
              else if (number==11) {
                hearts+="J ";
              }
                else if (number==12) {
                hearts+="Q ";
              }
                  else  {
                    hearts+=number+" ";
                  }
        }
        
        else if (value==3)  {
          if (number==0)  {
            spades+="K ";
          }
            else if (number==1)  {
              spades+="A ";
            }
              else if (number==11) {
                spades+="J ";
              }
                else if (number==12) {
                spades+="Q ";
              }
                  else  {
                    spades+=number+" ";
                  }
        }
    }
    
    System.out.println(clubs);
    System.out.println(diamonds);
    System.out.println(hearts);
    System.out.println(spades);
    
  }
  
} //  End of class