//
//Constantine Loucopoulos
//Test Java Program
//
//  First compile the program
//      Javac Test.java
//  Run the program
//      Java Test//

//  Define a Class
public class Test{
    
//  Add main method
    public static void main(String[] args)  {
        
        //  Declare variables
        final int NUM_STUDENTS = 5000;
        int[] studentIds;
        int i = 0;
        
        //  Allocate memory space
        studentIds = new int[NUM_STUDENTS];
        
        //  Initialize values
        studentIds[0] = 1;
        studentIds[1] = 2;
        studentIds[2] = 3;
        studentIds[3] = 4;
        studentIds[4] = 5;
        studentIds[5] = 6;
        studentIds[6] = 7;
        studentIds[7] = 8;
        studentIds[8] = 9;
        studentIds[9] = 10;
        studentIds[10] = 11;
        studentIds[11] = 0;
        
        
        
        /*//  Initialization shortcut
        for (i=0; i < NUM_STUDENTS; i++)
            studentIds[i] = i+1;*/
            
        //  .length shows length of array ("studentIds" in this case)
        int size = studentIds.length;
        
        System.out.println(size);
        System.out.println(studentIds[15]);

        
        
    }   //  End of main method
    
}   // End of class