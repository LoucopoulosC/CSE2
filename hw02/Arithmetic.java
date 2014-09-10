//
//Constantine Loucopoulos
//Hw02
//Arithmetic Java Program
//
//  First compile the program
//      Javac Arithmetic.java
//  Run the program
//      Java Arithmetic//

//  Define a Class
public class Arithmetic{

//  Add main method
    public static void main(String[] args)  {

//  Input variables

//  Pair of socks quantity
int nSocks=3;
//  Cost per pair of socks
// ('$' is part of the variable name)
double sockCost$=2.58;

//  Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;

//  Number of boxes of envelopes
int nEnvelopes=1;
//  Cost per box of envelopes
double envelopeCost$=3.25;

double taxPercent=0.06;

double totalSockCost$, totalGlassCost$, totalEnvelopeCost$, salesTaxSocks$;
double salesTaxGlasses$, salesTaxEnvelopes$, totalPurchaseCost$, totalSalesTax$;
double totalPaid$;

//  Run the calculations; store the values. Document your calculation here.
totalSockCost$=(nSocks*sockCost$);
totalGlassCost$=(nGlasses*glassCost$);
totalEnvelopeCost$=(nEnvelopes*envelopeCost$);

salesTaxSocks$=(totalSockCost$*taxPercent);
salesTaxGlasses$=(totalGlassCost$*taxPercent);
salesTaxEnvelopes$=(totalEnvelopeCost$*taxPercent);

totalPurchaseCost$=(totalSockCost$+totalGlassCost$+totalEnvelopeCost$);
totalSalesTax$=(salesTaxSocks$+salesTaxGlasses$+salesTaxEnvelopes$);

totalPaid$=(totalPurchaseCost$+totalSalesTax$);


//  Print numbers that are stored in the variables
System.out.println("Total cost of socks is: $"+(totalSockCost$));
System.out.println("Total cost of glasses is: $"+(totalGlassCost$));
System.out.println("Total cost of envelopes is: $"+(totalEnvelopeCost$));

System.out.println("Sales tax for sock purchase is: $"+(salesTaxSocks$));
System.out.println("Sales tax for glass purchase is: $"+(salesTaxGlasses$));
System.out.println("Sales tax for envelope purchase is: $"+(salesTaxEnvelopes$));

System.out.println("Total purchase cost without tax is: $"+(totalPurchaseCost$));

System.out.println("Total paid for entire transaction including sales tax is: $"+(totalPaid$));


    }   //End of main method
}   //End of class