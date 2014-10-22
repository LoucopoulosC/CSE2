//
//Constantine Loucopoulos
//HW 06
//Number Stack Program
//
//  First compile the program
//      Javac NumberStack.java
//  Run the program
//      Java NumberStack//

//  Import Scanner
import java.util.Scanner;

//  Define a Class
public class NumberStack{
    
    //  Add main method
    public static void main(String[] args)  {

        //  Declare instance of scanner object
        Scanner myScanner;

        //  Call Scanner constructor
        myScanner=new Scanner(System.in);
        
        //  Prompt user for a number between 1 and 9, inclusive
        System.out.print("Enter a number between 1 and 9: ");
        
        //  Accept user input
        int x = myScanner.nextInt();
        
        //  Variables
        int a = 0;
        
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
        
        
        //  Create array using while loops
        if (x==1)   {
            a=0;
            while (a < 1)    {
                System.out.println(1);
                a++;
            }
            System.out.println("-");
        }
        
            else if (x==2)  {
                a=0;
                while (a < 1)    {
                    System.out.println(1);
                    a++;
                }
                System.out.println("-");
        
        
                a=0;
                while (a < 3)  {
                    System.out.print(2);
                    a++;
                }
                System.out.println();
                System.out.println("---");
            }
            
                else if (x==3)  {
                    a=0;
                    while (a < 1)    {
                        System.out.println(1);
                        a++;
                    }
                    System.out.println("-");
        
        
                    a=0;
                    while (a < 3)  {
                        System.out.print(2);
                        a++;
                    }
                    System.out.println();
                    System.out.println("---");

        
                    a=0;
                    while (a < 5)  {
                        System.out.print(3);
                        a++;
                    }
                    System.out.println();
                    System.out.println("-----");
                }
                
                    else if (x==4)  {
                        a=0;
                        while (a < 1)    {
                            System.out.println(1);
                            a++;
                        }
                        System.out.println("-");
            
            
                        a=0;
                        while (a < 3)  {
                            System.out.print(2);
                            a++;
                        }
                        System.out.println();
                        System.out.println("---");
    
            
                        a=0;
                        while (a < 5)  {
                            System.out.print(3);
                            a++;
                        }
                        System.out.println();
                        System.out.println("-----");
            
            
                        a=0;
                        while (a < 7)  {
                            System.out.print(4);
                            a++;
                        }
                        System.out.println();
                        System.out.println("-------");
                    }
                    
                        else if (x==5)  {
                            a=0;
                            while (a < 1)    {
                                System.out.println(1);
                                a++;
                            }
                            System.out.println("-");
                
                
                            a=0;
                            while (a < 3)  {
                                System.out.print(2);
                                a++;
                            }
                            System.out.println();
                            System.out.println("---");
        
                
                            a=0;
                            while (a < 5)  {
                                System.out.print(3);
                                a++;
                            }
                            System.out.println();
                            System.out.println("-----");
                
                
                            a=0;
                            while (a < 7)  {
                                System.out.print(4);
                                a++;
                            }
                            System.out.println();
                            System.out.println("-------");
                            
                            a=0;
                            while (a < 9)  {
                                System.out.print(5);
                                a++;
                            }
                            System.out.println();
                            System.out.println("---------");
                        }
                        
                            else if (x==6)  {
                                a=0;
                                while (a < 1)    {
                                    System.out.println(1);
                                    a++;
                                }
                                System.out.println("-");
                    
                    
                                a=0;
                                while (a < 3)  {
                                    System.out.print(2);
                                    a++;
                                }
                                System.out.println();
                                System.out.println("---");
            
                    
                                a=0;
                                while (a < 5)  {
                                    System.out.print(3);
                                    a++;
                                }
                                System.out.println();
                                System.out.println("-----");
                    
                    
                                a=0;
                                while (a < 7)  {
                                    System.out.print(4);
                                    a++;
                                }
                                System.out.println();
                                System.out.println("-------");
                                
                                a=0;
                                while (a < 9)  {
                                    System.out.print(5);
                                    a++;
                                }
                                System.out.println();
                                System.out.println("---------");
                                
                                a=0;
                                while (a < 11)  {
                                    System.out.print(6);
                                    a++;
                                }
                                System.out.println();
                                System.out.println("-----------");
                            }
                            
                                else if (x==7)  {
                                    a=0;
                                    while (a < 1)    {
                                        System.out.println(1);
                                        a++;
                                    }
                                    System.out.println("-");
                        
                        
                                    a=0;
                                    while (a < 3)  {
                                        System.out.print(2);
                                        a++;
                                    }
                                    System.out.println();
                                    System.out.println("---");
                
                        
                                    a=0;
                                    while (a < 5)  {
                                        System.out.print(3);
                                        a++;
                                    }
                                    System.out.println();
                                    System.out.println("-----");
                        
                        
                                    a=0;
                                    while (a < 7)  {
                                        System.out.print(4);
                                        a++;
                                    }
                                    System.out.println();
                                    System.out.println("-------");
                                    
                                    a=0;
                                    while (a < 9)  {
                                        System.out.print(5);
                                        a++;
                                    }
                                    System.out.println();
                                    System.out.println("---------");
                                    
                                    a=0;
                                    while (a < 11)  {
                                        System.out.print(6);
                                        a++;
                                    }
                                    System.out.println();
                                    System.out.println("-----------");
                                    
                                    a=0;
                                    while (a < 13)  {
                                        System.out.print(7);
                                        a++;
                                    }
                                    System.out.println();
                                    System.out.println("-------------");
                                }
                                
                                    else if (x==8)  {
                                        a=0;
                                        while (a < 1)    {
                                            System.out.println(1);
                                            a++;
                                        }
                                        System.out.println("-");
                            
                            
                                        a=0;
                                        while (a < 3)  {
                                            System.out.print(2);
                                            a++;
                                        }
                                        System.out.println();
                                        System.out.println("---");
                    
                            
                                        a=0;
                                        while (a < 5)  {
                                            System.out.print(3);
                                            a++;
                                        }
                                        System.out.println();
                                        System.out.println("-----");
                            
                            
                                        a=0;
                                        while (a < 7)  {
                                            System.out.print(4);
                                            a++;
                                        }
                                        System.out.println();
                                        System.out.println("-------");
                                        
                                        a=0;
                                        while (a < 9)  {
                                            System.out.print(5);
                                            a++;
                                        }
                                        System.out.println();
                                        System.out.println("---------");
                                        
                                        a=0;
                                        while (a < 11)  {
                                            System.out.print(6);
                                            a++;
                                        }
                                        System.out.println();
                                        System.out.println("-----------");
                                        
                                        a=0;
                                        while (a < 13)  {
                                            System.out.print(7);
                                            a++;
                                        }
                                        System.out.println();
                                        System.out.println("-------------");
                                        
                                        a=0;
                                        while (a < 15)  {
                                            System.out.print(8);
                                            a++;
                                        }
                                        System.out.println();
                                        System.out.println("---------------");
                                    }
                                    
                                        else if (x==9)  {
                                            a=0;
                                            while (a < 1)    {
                                                System.out.println(1);
                                                a++;
                                            }
                                            System.out.println("-");
                                
                                
                                            a=0;
                                            while (a < 3)  {
                                                System.out.print(2);
                                                a++;
                                            }
                                            System.out.println();
                                            System.out.println("---");
                        
                                
                                            a=0;
                                            while (a < 5)  {
                                                System.out.print(3);
                                                a++;
                                            }
                                            System.out.println();
                                            System.out.println("-----");
                                
                                
                                            a=0;
                                            while (a < 7)  {
                                                System.out.print(4);
                                                a++;
                                            }
                                            System.out.println();
                                            System.out.println("-------");
                                            
                                            a=0;
                                            while (a < 9)  {
                                                System.out.print(5);
                                                a++;
                                            }
                                            System.out.println();
                                            System.out.println("---------");
                                            
                                            a=0;
                                            while (a < 11)  {
                                                System.out.print(6);
                                                a++;
                                            }
                                            System.out.println();
                                            System.out.println("-----------");
                                            
                                            a=0;
                                            while (a < 13)  {
                                                System.out.print(7);
                                                a++;
                                            }
                                            System.out.println();
                                            System.out.println("-------------");
                                            
                                            a=0;
                                            while (a < 15)  {
                                                System.out.print(8);
                                                a++;
                                            }
                                            System.out.println();
                                            System.out.println("---------------");
                                            
                                            
                                            a=0;
                                            while (a < 17)  {
                                                System.out.print(9);
                                                a++;
                                            }
                                            System.out.println();
                                            System.out.println("-----------------");
                                        }
                                        
                                            else    {
                                                System.out.println("You did not enter a number within the range [1,9]");
                                                return;
                                            }
                                            
        
        //  Create array using do-while statements                                    
        if (x==1)   {
            a=0;
            do {
                System.out.println(1);
                a++;
            }   while (a < 1);
            System.out.println("-");
        }
        
            else if (x==2)   {
                a=0;
                do {
                    System.out.println(1);
                    a++;
                }   while (a < 1);
                System.out.println("-");
            
                a=0;
                do {
                    System.out.print(2);
                    a++;
                }   while (a < 3);
                System.out.println();
                System.out.println("---");
            }
            
                else if (x==3)   {
                    a=0;
                    do {
                        System.out.println(1);
                        a++;
                    }   while (a < 1);
                    System.out.println("-");
                
                    a=0;
                    do {
                        System.out.print(2);
                        a++;
                    }   while (a < 3);
                    System.out.println();
                    System.out.println("---");
                    
                    a=0;
                    do {
                        System.out.print(3);
                        a++;
                    }   while (a < 5);
                    System.out.println();
                    System.out.println("-----");
                }
                
                    else if (x==4)   {
                        a=0;
                        do {
                            System.out.println(1);
                            a++;
                        }   while (a < 1);
                        System.out.println("-");
                    
                        a=0;
                        do {
                            System.out.print(2);
                            a++;
                        }   while (a < 3);
                        System.out.println();
                        System.out.println("---");
                        
                        a=0;
                        do {
                            System.out.print(3);
                            a++;
                        }   while (a < 5);
                        System.out.println();
                        System.out.println("-----");
                        
                        a=0;
                        do {
                            System.out.print(4);
                            a++;
                        }   while (a < 7);
                        System.out.println();
                        System.out.println("-------");
                    }
                    
                        else if (x==5)   {
                            a=0;
                            do {
                                System.out.println(1);
                                a++;
                            }   while (a < 1);
                            System.out.println("-");
                        
                            a=0;
                            do {
                                System.out.print(2);
                                a++;
                            }   while (a < 3);
                            System.out.println();
                            System.out.println("---");
                            
                            a=0;
                            do {
                                System.out.print(3);
                                a++;
                            }   while (a < 5);
                            System.out.println();
                            System.out.println("-----");
                            
                            a=0;
                            do {
                                System.out.print(4);
                                a++;
                            }   while (a < 7);
                            System.out.println();
                            System.out.println("-------");
                            
                            a=0;
                            do {
                                System.out.print(5);
                                a++;
                            }   while (a < 9);
                            System.out.println();
                            System.out.println("---------");
                        }
                        
                            else if (x==6)   {
                                a=0;
                                do {
                                    System.out.println(1);
                                    a++;
                                }   while (a < 1);
                                System.out.println("-");
                            
                                a=0;
                                do {
                                    System.out.print(2);
                                    a++;
                                }   while (a < 3);
                                System.out.println();
                                System.out.println("---");
                                
                                a=0;
                                do {
                                    System.out.print(3);
                                    a++;
                                }   while (a < 5);
                                System.out.println();
                                System.out.println("-----");
                                
                                a=0;
                                do {
                                    System.out.print(4);
                                    a++;
                                }   while (a < 7);
                                System.out.println();
                                System.out.println("-------");
                                
                                a=0;
                                do {
                                    System.out.print(5);
                                    a++;
                                }   while (a < 9);
                                System.out.println();
                                System.out.println("---------");
                                
                                a=0;
                                do {
                                    System.out.print(6);
                                    a++;
                                }   while (a < 11);
                                System.out.println();
                                System.out.println("-----------");
                            }
                            
                                else if (x==7)   {
                                    a=0;
                                    do {
                                        System.out.println(1);
                                        a++;
                                    }   while (a < 1);
                                    System.out.println("-");
                                
                                    a=0;
                                    do {
                                        System.out.print(2);
                                        a++;
                                    }   while (a < 3);
                                    System.out.println();
                                    System.out.println("---");
                                    
                                    a=0;
                                    do {
                                        System.out.print(3);
                                        a++;
                                    }   while (a < 5);
                                    System.out.println();
                                    System.out.println("-----");
                                    
                                    a=0;
                                    do {
                                        System.out.print(4);
                                        a++;
                                    }   while (a < 7);
                                    System.out.println();
                                    System.out.println("-------");
                                    
                                    a=0;
                                    do {
                                        System.out.print(5);
                                        a++;
                                    }   while (a < 9);
                                    System.out.println();
                                    System.out.println("---------");
                                    
                                    a=0;
                                    do {
                                        System.out.print(6);
                                        a++;
                                    }   while (a < 11);
                                    System.out.println();
                                    System.out.println("-----------");
                                    
                                    a=0;
                                    do {
                                        System.out.print(7);
                                        a++;
                                    }   while (a < 13);
                                    System.out.println();
                                    System.out.println("-------------");
                                }
                                
                                    else if (x==8)   {
                                        a=0;
                                        do {
                                            System.out.println(1);
                                            a++;
                                        }   while (a < 1);
                                        System.out.println("-");
                                    
                                        a=0;
                                        do {
                                            System.out.print(2);
                                            a++;
                                        }   while (a < 3);
                                        System.out.println();
                                        System.out.println("---");
                                        
                                        a=0;
                                        do {
                                            System.out.print(3);
                                            a++;
                                        }   while (a < 5);
                                        System.out.println();
                                        System.out.println("-----");
                                        
                                        a=0;
                                        do {
                                            System.out.print(4);
                                            a++;
                                        }   while (a < 7);
                                        System.out.println();
                                        System.out.println("-------");
                                        
                                        a=0;
                                        do {
                                            System.out.print(5);
                                            a++;
                                        }   while (a < 9);
                                        System.out.println();
                                        System.out.println("---------");
                                        
                                        a=0;
                                        do {
                                            System.out.print(6);
                                            a++;
                                        }   while (a < 11);
                                        System.out.println();
                                        System.out.println("-----------");
                                        
                                        a=0;
                                        do {
                                            System.out.print(7);
                                            a++;
                                        }   while (a < 13);
                                        System.out.println();
                                        System.out.println("-------------");
                                        
                                        a=0;
                                        do {
                                            System.out.print(8);
                                            a++;
                                        }   while (a < 15);
                                        System.out.println();
                                        System.out.println("---------------");
                                    }
                                    
                                        else if (x==9)   {
                                            a=0;
                                            do {
                                                System.out.println(1);
                                                a++;
                                            }   while (a < 1);
                                            System.out.println("-");
                                        
                                            a=0;
                                            do {
                                                System.out.print(2);
                                                a++;
                                            }   while (a < 3);
                                            System.out.println();
                                            System.out.println("---");
                                            
                                            a=0;
                                            do {
                                                System.out.print(3);
                                                a++;
                                            }   while (a < 5);
                                            System.out.println();
                                            System.out.println("-----");
                                            
                                            a=0;
                                            do {
                                                System.out.print(4);
                                                a++;
                                            }   while (a < 7);
                                            System.out.println();
                                            System.out.println("-------");
                                            
                                            a=0;
                                            do {
                                                System.out.print(5);
                                                a++;
                                            }   while (a < 9);
                                            System.out.println();
                                            System.out.println("---------");
                                            
                                            a=0;
                                            do {
                                                System.out.print(6);
                                                a++;
                                            }   while (a < 11);
                                            System.out.println();
                                            System.out.println("-----------");
                                            
                                            a=0;
                                            do {
                                                System.out.print(7);
                                                a++;
                                            }   while (a < 13);
                                            System.out.println();
                                            System.out.println("-------------");
                                            
                                            a=0;
                                            do {
                                                System.out.print(8);
                                                a++;
                                            }   while (a < 15);
                                            System.out.println();
                                            System.out.println("---------------");
                                            
                                            a=0;
                                            do {
                                                System.out.print(9);
                                                a++;
                                            }   while (a < 17);
                                            System.out.println();
                                            System.out.println("-----------------");
                                        }
                                        
                                            else    {
                                                System.out.println("You did not enter a number within the range [1,9]");
                                                return;
                                            }
                                
                
    }   //  End of main method
    
}   //  End of class