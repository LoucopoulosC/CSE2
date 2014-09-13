//
//Constantine Loucopoulos
//Lab 03
//BigMac Java Program
//
//  First compile the program
//      Javac BigMac.java
//  Run the program
//      Java BigMac//

//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class BigMac{
    
//  Add main method
    public static void main(String[] args)  {

//  Declare instance of scanner object
Scanner myScanner;

//  Call Scanner constructor
myScanner=new Scanner(System.in);

//  Accept input by prompting user for number of Big Macs
System.out.print("Enter the number of Big Macs (an integer > 0): ");

int nBigMacs=myScanner.nextInt();

//  Prompt user for cost of Big Mac and percent sales tax. Then accept the input
System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): ");
double bigMac$=myScanner.nextDouble();
System.out.print("Enter the percent tax as a whole number (xx): ");
double taxRate=myScanner.nextDouble();
taxRate/=100;
//  User enters percent, but I want proportion

double cost$;
int dollars, dimes, pennies;
//  Whole dollar amount of cost for storing digits to the right of the decimal point for the cost$
cost$=nBigMacs*bigMac$*(1.00+taxRate);
//  Get the whole amount, dropping decimal fraction
dollars=(int)cost$;
//get dimes amount, e.g.,
//  (int)(6.73*10)%10->67%10->7
//  Where the % (mod) operator returns the remainder after the division: 583%100 -> 83,
//  27%5 -> 2
dimes=(int)(cost$*10)%10;
pennies=(int)(cost$*100)%10;
System.out.println("The total cost of " +nBigMacs + "BigMacs, at $ " +bigMac$ + "per bigMac,with a " + "sales tax of " +(int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
        
//End of program        
    }
}