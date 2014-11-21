//
//Constantine Loucopoulos
//Find Duplicates Java Program
//
//  First compile the program
//      Javac FindDuplicates.java
//  Run the program
//      Java FindDuplicates//


//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class FindDuplicates{

    // Add Main Method
    public static void main(String [] arg)  {
        
        Scanner scan=new Scanner(System.in);
        
        //  Declare Variables
        int num[]=new int[10];
        String answer="";
        
        do{
            System.out.print("Enter 10 ints- ");
            
            for(int j=0;j<10;j++){
                num[j]=scan.nextInt();
            }
            
            String out="The array ";
            out+=listArray(num); //return a string of the form "{2, 3, -9}"
            
            if(hasDups(num)){
                out+="has ";
            }
                else{
                    out+="does not have ";
                }
            
            out+="duplicates.";
            System.out.println(out);
            out="The array ";
            out+=listArray(num);
            
            if(exactlyOneDup(num)){
                out+="has ";
            }
                else{
                    out+="does not have ";
                }

            out+="exactly one duplicate.";
            System.out.println(out);
            
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
            
        }while(answer.equals("Y") || answer.equals("y"));


    }   // End of Main Method

        public static String listArray(int num[])   {
            String out="{";
            
            for(int j=0;j<num.length;j++){
                if(j>0){
                    out+=", ";
                }
                out+=num[j];
            }

            out+="} ";
            return out;
        }


        public static boolean hasDups(int num[])  {
            
            //  Check the input array against itself to see if there are any duplicates
            for (int j=0;j<num.length;j++){
                for (int i=j+1;i<num.length;i++){
                    if (i!=j && num[i] == num[j])
                        return true;
                        else
                            continue;
                }
            }
            
            return false;
        }
            

        public static boolean exactlyOneDup(int num[])   {
            
            //  Declare Varibles
            int count=0;
            
            //  Check the input array against itself for duplicates, and count number of duplicates
            for (int j=0;j<num.length;j++){
                for (int i=j+1;i<num.length;i++){
                    if (i!=j && num[i] == num[j])
                        count++;
                }
            }
            
            //  If duplicate number is exactly one, then method returns true, else false
            if (count==1)
                return true;
                else
                    return false;
            
        }
    
}   // End of Class
