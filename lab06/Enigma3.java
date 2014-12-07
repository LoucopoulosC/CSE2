/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    System.out.println("n: "+n+"  k: "+k);
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    System.out.println("n: "+n+"  k: "+k);
    if(n*n>k){
      n=42;
      out+=n+k;
      System.out.println("n: "+n+"  k: "+k);

    }
    else {
      n=45;
      out+=n+k;
      System.out.println("n: "+n+"  k: "+k);
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
      /*default:
        n-=3;
        k-=5;*/
    }
    System.out.println("n: "+n+"  k: "+k);
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * 
 *  The code runs fine until right before the final print statement.
    The code is channeled to case 98 within the switch statement.
    This results in the action "k/9" which, at this point, is "53/9".
    The result is 5.888889. Since k is an int, however, the decimals
    are eliminated and the number is not rounded.
    Therefore, at this point, k = 5.
    Then values then continue to the default case of the switch statement.
    In this case, k is subtracted by 5, which, at this point, is 5-5=0.
    Once the values exit the switch statement, some values are being added to "out".
    One of these values is 1/k. Since k is 0, at this point,
    1/k is undefined and results in a runtime error.
 * 
 * 
 */

