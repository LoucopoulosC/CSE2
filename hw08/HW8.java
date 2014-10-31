//HW8 Java Program
//
//  First compile the program
//      Javac HW8.java
//  Run the program
//      Java HW8//

//  Import scanner
import java.util.Scanner;

//  Define a class
public class HW8    {
    
    
    //  First definition of getInput Method
    public static char getInput(Scanner scan, String a) {
       
        
        Scanner myScanner=new Scanner(System.in);
        
        String user = myScanner.next();

            if (user.equals ("c"))    {
              return 'c';
            }
                else if (user.equals ("C"))   {
                    return 'C';
                }
                    else
                        return 'f';

                
    }

    // Second definition of getInput Method
    public static char getInput(Scanner scan, String a, int x) {
        
        Scanner myScanner=new Scanner(System.in);
        String user = myScanner.next();
        
            if (user.equals ("y"))    {
              return 'y';
            }
                else if (user.equals ("Y"))   {
                    return 'Y';
                }
                   else if (user.equals ("N"))   {
                        return 'N';
                    }
                         else if (user.equals ("n"))   {
                             return 'n';
                         }
                            else
                                return 'f';
                    
    }
    
    //  Third definition of getInput Method
    public static char getInput(Scanner scan, String a, String b)   {
        
        
    }

    
    public static void main(String [] arg){
      
    	char input;
    	
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Enter 'C' or 'c' to continue, anything else to quit: ");
        
    	input=getInput(scan,"Cc");
    	
    	System.out.println("You entered: '"+input+"'");
    	
    	System.out.print("Enter 'y', 'Y', 'n', or 'N': ");
    	
    	input=getInput(scan,"yYnN",5); //give up after 5 attempts
    	
    	if(input!=' '){
       	System.out.println("You entered '"+input+"'");
    	}
    	
    	input=getInput(scan,"Choose a digit.","0123456789");
    	System.out.println("You entered '"+input+"'");
    	
    	
    	
    
	
	
	}   //  End of main method
  
}   //  End of class

/* Did not have time to complete this code, 
as I was studying for other exams.
 I will work on it after submission, 
 but for now, here is what  I have to submit for a grade.*/