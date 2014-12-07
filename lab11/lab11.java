//
//Constantine Loucopoulos
//Lab 11
//Lab 11 Java Program
//
//  First compile the program
//      lab11.java
//  Run the program
//      Java lab11//

//  Import Scanner

import java.util.Scanner;

//  Define a Class
public class lab11{
    
//  Add main method
    public static void main(String[] args)  {
        
        Scanner scan=new Scanner(System.in);
        
        //  Declare variables
        final int numInts = 10;
        int[] array;
        int temp=0;
        int sum=0;
        
        //  Allocate memory space
        array = new int[numInts];
        
        
        System.out.print("Enter 10 ints: ");
        
        for(int i=0;i<numInts;i++){
            array[i]=scan.nextInt();
        }
        
      
        for(int i=1;i<10;i++){
            if(array[temp]>array[i]){
                temp=i;
            }
        }
        
        System.out.println("The lowest entry is: "+array[temp]);
        
        
        temp=0;
        
        for(int i=1;i<10;i++){
            if(array[temp]<array[i]){
                temp=i;
            }
        }
        
        System.out.println("The highest entry is: "+array[temp]);
        
        for(int i=0;i<10;i++){
            sum+=array[i];
        }
        
        System.out.println("The sum is: "+sum);
        
        //  Declare array
        int[] secondArray;
        
        //  Allocate memory space
        secondArray = new int[numInts];
        
        
        //  Initialize array values
        for(int i=9;i>=0;i--){
                secondArray[9-i]=array[i];
        }
        
        for(int i=0;i<10;i++){
            System.out.print(array[i]+"  "+secondArray[i]);
            System.out.println();
        }
        
        
    }   //  End of main method
    
}   //  End of class