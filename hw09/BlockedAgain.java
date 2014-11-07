//Blocked Again Java Program
//
//  First compile the program
//      Javac BlockedAgain.java
//  Run the program
//      Java BlockedAgain//

//  Import scanner
import java.util.Scanner;


//  Define a class
public class BlockedAgain{
    
    
    public static boolean checkInt(char data)    {
            if((int)data>=49 && (int)data<=57)    {
                return true;
            }
                else {
                    return false;
                }
    }
    
    
    public static boolean checkRange(String input)  {
        
        if (input.length()>1)   {
            
            return false;
        }
            else {
                
                return true;
            }
    }
    
    
    public static int getInt()  {
        
        //  Call Scanner constructor
        Scanner myScanner=new Scanner(System.in);
            
        //  Accept user input by prompting user to enter number within [1,9]
        System.out.println("Enter an in int between 1 and 9, inclusive: ");
        
        do {
            
            String input = myScanner.next();
            boolean b = checkRange(input);
            if (b==false)   {
                System.out.println("You did not enter an int in [1,9]; try again: ");
                continue;
            }
                else    {
                    char data = input.charAt(0);
                    boolean a = checkInt(data);
                        if (a==true)    {
                            return (data-48);
                        }
                            else {
                                System.out.println("You did not enter an int in [1,9]; try again: ");
                                continue;
                            }
                }
            
        } while (true);
    }
        
    
    public static void allBlocks(int x)  {
        
        //  Initialize variables
        int a;
        
        System.out.println();
        
        //  Create array using for loops
        if (x==1)   {
            for (a = 0; a < 1; a++)    {
                System.out.println(1);
            }
            System.out.println("-");
        }
        
            else if (x==2)  {
                for (a = 0; a < 1; a++)    {
                    System.out.println(1);
                }
                System.out.println("-");
        
        
                for (a = 0; a < 3; a++)  {
                    System.out.print(2);
                }
                System.out.println();
                System.out.println("---");
            }
            
                else if (x==3)  {
                    for (a = 0; a < 1; a++)    {
                        System.out.println(1);
                    }
                    System.out.println("-");
        
        
                    for (a = 0; a < 3; a++)  {
                        System.out.print(2);
                    }
                    System.out.println();
                    System.out.println("---");

        
                    for (a = 0; a < 5; a++) {
                        System.out.print(3);
                    }
                    System.out.println();
                    System.out.println("-----");
                }
                
                    else if (x==4)  {
                        for (a = 0; a < 1; a++)    {
                            System.out.println(1);
                        }
                        System.out.println("-");
            
            
                        for (a = 0; a < 3; a++)  {
                            System.out.print(2);
                        }
                        System.out.println();
                        System.out.println("---");
    
            
                        for (a = 0; a < 5; a++) {
                            System.out.print(3);
                        }
                        System.out.println();
                        System.out.println("-----");
            
            
                        for (a = 0; a < 7; a++) {
                            System.out.print(4);
                        }
                        System.out.println();
                        System.out.println("-------");
                    }
                    
                        else if (x==5)  {
                            for (a = 0; a < 1; a++)    {
                                System.out.println(1);
                            }
                            System.out.println("-");
                
                
                            for (a = 0; a < 3; a++)  {
                                System.out.print(2);
                            }
                            System.out.println();
                            System.out.println("---");
        
                
                            for (a = 0; a < 5; a++) {
                                System.out.print(3);
                            }
                            System.out.println();
                            System.out.println("-----");
                
                
                            for (a = 0; a < 7; a++) {
                                System.out.print(4);
                            }
                            System.out.println();
                            System.out.println("-------");
                            
                            for (a = 0; a < 9; a++) {
                                System.out.print(5);
                            }
                            System.out.println();
                            System.out.println("---------");
                        }
                        
                            else if (x==6)  {
                                for (a = 0; a < 1; a++)    {
                                    System.out.println(1);
                                }
                                System.out.println("-");
                    
                    
                                for (a = 0; a < 3; a++)  {
                                    System.out.print(2);
                                }
                                System.out.println();
                                System.out.println("---");
            
                    
                                for (a = 0; a < 5; a++) {
                                    System.out.print(3);
                                }
                                System.out.println();
                                System.out.println("-----");
                    
                    
                                for (a = 0; a < 7; a++) {
                                    System.out.print(4);
                                }
                                System.out.println();
                                System.out.println("-------");
                                
                                for (a = 0; a < 9; a++) {
                                    System.out.print(5);
                                }
                                System.out.println();
                                System.out.println("---------");
                                
                                for (a = 0; a < 11; a++) {
                                    System.out.print(6);
                                }
                                System.out.println();
                                System.out.println("-----------");
                            }
                            
                                else if (x==7)  {
                                    for (a = 0; a < 1; a++)    {
                                        System.out.println(1);
                                    }
                                    System.out.println("-");
                        
                        
                                    for (a = 0; a < 3; a++)  {
                                        System.out.print(2);
                                    }
                                    System.out.println();
                                    System.out.println("---");
                
                        
                                    for (a = 0; a < 5; a++) {
                                        System.out.print(3);
                                    }
                                    System.out.println();
                                    System.out.println("-----");
                        
                        
                                    for (a = 0; a < 7; a++) {
                                        System.out.print(4);
                                    }
                                    System.out.println();
                                    System.out.println("-------");
                                    
                                    for (a = 0; a < 9; a++) {
                                        System.out.print(5);
                                    }
                                    System.out.println();
                                    System.out.println("---------");
                                    
                                    for (a = 0; a < 11; a++) {
                                        System.out.print(6);
                                    }
                                    System.out.println();
                                    System.out.println("-----------");
                                    
                                    for (a = 0; a < 13; a++) {
                                        System.out.print(7);
                                    }
                                    System.out.println();
                                    System.out.println("-------------");
                                }
                                
                                    else if (x==8)  {
                                        for (a = 0; a < 1; a++)    {
                                            System.out.println(1);
                                        }
                                        System.out.println("-");
                            
                            
                                        for (a = 0; a < 3; a++)  {
                                            System.out.print(2);
                                        }
                                        System.out.println();
                                        System.out.println("---");
                    
                            
                                        for (a = 0; a < 5; a++) {
                                            System.out.print(3);
                                        }
                                        System.out.println();
                                        System.out.println("-----");
                            
                            
                                        for (a = 0; a < 7; a++) {
                                            System.out.print(4);
                                        }
                                        System.out.println();
                                        System.out.println("-------");
                                        
                                        for (a = 0; a < 9; a++) {
                                            System.out.print(5);
                                        }
                                        System.out.println();
                                        System.out.println("---------");
                                        
                                        for (a = 0; a < 11; a++) {
                                            System.out.print(6);
                                        }
                                        System.out.println();
                                        System.out.println("-----------");
                                        
                                        for (a = 0; a < 13; a++) {
                                            System.out.print(7);
                                        }
                                        System.out.println();
                                        System.out.println("-------------");
                                        
                                        for (a = 0; a < 15; a++) {
                                            System.out.print(8);
                                        }
                                        System.out.println();
                                        System.out.println("---------------");
                                    }
                                    
                                        else if (x==9)  {
                                            for (a = 0; a < 1; a++)    {
                                                System.out.println(1);
                                            }
                                            System.out.println("-");
                                            
                                            
                                            for (a = 0; a < 3; a++)  {
                                                System.out.print(2);
                                            }
                                            System.out.println();
                                            System.out.println("---");
                                    
                                            
                                            for (a = 0; a < 5; a++) {
                                                System.out.print(3);
                                            }
                                            System.out.println();
                                            System.out.println("-----");
                                            
                                            
                                            for (a = 0; a < 7; a++) {
                                                System.out.print(4);
                                            }
                                            System.out.println();
                                            System.out.println("-------");
                                            
                                            
                                            for (a = 0; a < 9; a++) {
                                                System.out.print(5);
                                            }
                                            System.out.println();
                                            System.out.println("---------");
                                            
                                            
                                            for (a = 0; a < 11; a++) {
                                                System.out.print(6);
                                            }
                                            System.out.println();
                                            System.out.println("-----------");
                                            
                                            
                                            for (a = 0; a < 13; a++) {
                                                System.out.print(7);
                                            }
                                            System.out.println();
                                            System.out.println("-------------");
                                            
                                            
                                            for (a = 0; a < 15; a++) {
                                                System.out.print(8);
                                            }
                                            System.out.println();
                                            System.out.println("---------------");
                                            
                                            
                                            for (a = 0; a < 17; a++) {
                                                System.out.print(9);
                                            }
                                            System.out.println();
                                            System.out.println("-----------------");
                                        }
                                        
                                            else    {
                                                System.out.println("You did not enter a number within the range [1,9]");
                                                return;
                                            }
    }
    
    
    
    //  Add main method
    public static void main(String []s) {
        
        
    int m;
    
    //force user to enter int in range 1-9, inclusive.
    m = getInt();

    allBlocks(m);

    
    
    
    
    
    
    
    }   //  End of main method
    
}   //  End of class