/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a proportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;

public class Enigma1{
  
  public static void main(String []arg){
    
    double percent;
    
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    
    double x=((new Scanner(System.in)).nextDouble());
    double leftover;
    
    System.out.println("You entered "+x+"%");

    //print out the proportion remaining for select percentages
    
    if (x>=0 || x<=99)  {
      leftover= 1-(x/100);
      System.out.println("The proportion remaining is "+leftover);
    }
    
      else  {
        System.out.println("You did not enter a number within the range [0,99]");
      }
      
      
    /*if(1-x/100==0.93)  {  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    }
   
      else if(1-x/100==0.59)  {  //when the user enters 41
        System.out.println("The proportion remaining is "+0.59);
      }
      
        else if(1-x/100==0.86)  {   //when the user enters 14
          System.out.println("The proportion remaining is "+0.86);
        }
        
          else if(1-x/100==0.67)  { //when the user enters 33
            System.out.println("The proportion remaining is "+0.67);
          }
          
            else if(1-x/100==0.4)   { //when the user enters 60
              System.out.println("The proportion remaining is "+0.40);
            }
            */
            
            
    
  }
   
}



/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 * 
 *    The current code does not print the remaining proportion
      for all values. Even for the specific values listed
      (7, 41, 14, 33, 60) the remaining proportion is not always
      printed, because when processing doubles, the values do not
      always round to fit to the naturally expected output.
 */

