//
//Constantine Loucopoulos
//Lab 08
//More Loops Java Program
//
//  First compile the program
//      Javac MoreLoops.java
//  Run the program
//      Java MoreLoops//

import java.util.Scanner;

public class MoreLoops{
    
	public static void main(String[] arg)   {
	    
        Scanner scan=new Scanner(System.in);
        
        int n=0;
    
        System.out.print("Enter an int- ");
        
        int w=0;
        
        do{
            w++;
            if(w==1){
                continue;
            }
        	scan.next(); //get rid of the junk entered by user
        	System.out.print("You did not enter an int; try again- ");
        }while(!scan.hasNextInt());
        
        /*System.out.print("Enter an int- ");
        while(!scan.hasNextInt()){
    	    scan.next(); //get rid of the junk entered by user
    	    System.out.print("You did not enter an int; try again- ");
        }*/
        
        //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
        //DO-WHILE LOOP
        
        n=scan.nextInt();
        
        int j=0;
        
        while(j<n && j<40){
            int k=0;
            while(k<j+1){
                System.out.print('*');
                k++;
            }
            System.out.println();
            j++;
        }
        
        /*for(int j=0;j<n && j<40;j++){
        	for(int k=0;k<j+1;k++){
       	        System.out.print('*');
        	}
        	System.out.println();
        }*/
        
        //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
        //WHILE STATEMENTS
     	 
        int k=4;
    
        while(k<=4){
            System.out.println("k="+k);
        	k++;
        }
        
        /*do{
        	System.out.println("k="+k);
        	k++;
        } while (k<4);*/
        	//COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
        //WITH A WHILE LOOP
    
        for(int count=0;count<=10;count++){
            if(n==3){
                break;
            }
                else if(n>5 || n<1){
                    System.out.println(n + " is > 5 or <1");
                    break;
                }
                    else if(n==1 || n==2){
                        System.out.print("Case 2 ");
                        count--;
                    }
                        else if(n==4){
                            System.out.println("Case 4");
                            System.out.println("Case 5");
                        }
                            else if(n==5){
                                System.out.println("Case 5");
                            }
                                else{
                                    break;
                                }
                                
        }
    
        /*int count=0;
        	
        while(true){
        	switch(n){
        	    default: System.out.println(n + " is > 5 or <1");
       	            break;
        	    
        	    case 1:
        	    
        	    case 2: System.out.print("Case 2 ");
       	            continue;
        	    
        	    case 3: break;
        	    
        	    case 4: System.out.println("Case 4");
        	    
        	    case 5: System.out.println("Case 5");
       	            break;
        	}
        	count++;
        	
        	if(count>10)
       	        break;
        }*/
        
        //COMMENT OUT THE ABOVE 21 LINES AND REWRITE THE CODE USING
        // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
        //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
        //   -5, 1, 20, 5, ETC.
        //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
        //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    	
	    
	}   //  End of main method
	
}   //  End of class