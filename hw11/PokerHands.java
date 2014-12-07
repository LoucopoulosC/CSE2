//
//Constantine Loucopoulos
//HW 11
//Poker Hands Java Program
//
//  First compile the program
//      Javac PokerHands.java
//  Run the program
//      Java PokerHands//

//  Import Scanner
import java.util.Scanner;

//  Define a class
public class PokerHands{

  public static void main(String [] arg){
      
      Scanner myScanner=new Scanner(System.in);
      
      System.out.println("Enter 'y' or 'Y' to enter a hand: ");
      myScanner.next();
      
      
        
      //  Declare variables
      int[][] array=new int[4][13];
      boolean invalid=false;
      int s=0;
  
      
      for(int i=0;i<5;i++){
        do{
            System.out.println("Enter the suit: 'c', 'd', 'h', or 's': ");
            String suit=myScanner.next();
        
            switch (suit){
                case ("C"):
                case ("c"):
                case ("D"):
                case ("d"):
                case ("H"):
                case ("h"):
                case ("S"):
                case ("s"):break;
                default:
                  invalid=true;
                  System.out.println("You did not enter a valid response");
                  
                if(suit=="c" || suit=="C"){
                  s=0;
                }
                else if(suit=="d" || suit=="D"){
                  s=1;
                }
                else if(suit=="h" || suit=="H"){
                  s=2;
                }
                else if(suit=="s" || suit=="S"){
                  s=3;
                }
            }
        } while (invalid);
        
      
        
        
        
        do{
            System.out.println("Enter one of 'A', 'K', 'Q', 'J', '10', ...'2': ");
            String rank=myScanner.next();
        
            switch (rank){
                case ("a"):
                case ("A"):
                  array[s][1]=1;
                  break;
                case ("k"):
                case ("K"):
                  array[s][0]=1;
                  break;
                case ("Q"):
                case ("q"):
                  array[s][12]=1;
                  break;
                case ("J"):
                case ("j"):
                  array[s][11]=1;
                  break;
                case ("10"):
                  array[s][10]=1;
                  break;
                case ("9"):
                  array[s][9]=1;
                  break;
                case ("8"):
                  array[s][8]=1;
                  break;
                case ("7"):
                  array[s][7]=1;
                  break;
                case ("6"):
                  array[s][6]=1;
                  break;
                case ("5"):
                  array[s][5]=1;
                  break;
                case ("4"):
                  array[s][4]=1;
                  break;
                case ("3"):
                  array[s][3]=1;
                  break;
                case ("2"):
                  array[s][2]=1;
                  break;
                default:
                  invalid=true;
                  System.out.println("You did not enter a valid response");
            }
        } while (invalid);
      }
      
      /*while(!scan.hasNextInt()){
    	    scan.next(); //get rid of the junk entered by user
    	    System.out.print("You did not enter an int; try again- ");
      }*/
      
      
      
      
      

      
      
      
      
  } //  End of main method
  
  
  public static void showOneHand(int[] hand){
      
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
	String out="";
	
	for(int s=0;s<4;s++){
      	out+=suit[s];
      	for(int rank=0;rank<13;rank++)
        	for(int card=0;card<5;card++)
             	if(hand[card]/13==s && hand[card]%13==rank)
                    out+=face[rank];
      	out+='\n';
	}
	System.out.println(out);
  }
  

}   //  End of class