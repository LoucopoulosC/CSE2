//
//Constantine Loucopoulos
//Lab02
//Cyclometer Java Program
//
//  First complie the program
//      Javac Cyclometer.java
//  Run the program
//      Java Cyclometer//

//  Define a Class
public class Cyclometer{
    
//  Main method required for every Java program
    public static void main(String[] args)  {

// Variables
int secsTrip1=480; //
int secsTrip2=3220; //
int countsTrip1=1561; //
int countsTrip2=9037; //

// Constants
double wheelDiameter=27.0, //
PI=3.14159, //
feetPerMile=5280, //
inchesPerFoot=12, //
secondsPerMinute=60; //
double distanceTrip1, distanceTrip2, totalDistance;

//Print numbers that are stored in the variables
System.out.println("Trip 1 took "+
    (secsTrip1/secondsPerMinute)+" minutes and had "+
    countsTrip1+" counts.");
System.out.println("Trip 2 took "+
    (secsTrip2/secondsPerMinute)+" minutes and had "+
    countsTrip2+" counts.");

//Run the calculations; store the values. Document your
//calculation here. What are you calculating?
distanceTrip1=countsTrip1*wheelDiameter*PI;
//Above gives distance in inches
//(For each count, a rotation of the wheel travels
//the diameter in inches times PI)
distanceTrip1=inchesPerFoot*feetPerMile; //Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data.
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");



    }   //End of main method
}   // End of class