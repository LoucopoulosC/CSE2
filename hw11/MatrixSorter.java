//
//Constantine Loucopoulos
//HW 11
//Matrix Sorter Java Program
//
//  First compile the program
//      Javac MatrixSorter.java
//  Run the program
//      Java MatrixSorter//

public class MatrixSorter{
    
  public static void main(String arg[]){
      
    int mat3d[][][];
    
    mat3d=buildMat3d();
    
    show(mat3d);
    
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
  			
    System.out.println("After sorting the 3rd matrix we get");
    
    sort(mat3d[2]);
    
    show(mat3d);
   }
   
   
   public static int[][][] buildMat3d(int[][][] array){
       
       
   }
   
   
   public static void show(int[][][] array){
       
       
       
   }
   
   
   public static int[][][] findMin(int[][][] array){
       
       
   }
   
   
   public static int[][] sort(int[][] array){
       
       
       
   }
   
}

/*  Unfortunately I have not had time to complete the programs
    assigned for homework, as I have had assignments and presentations
    due this entire week, and have been studying for exams as well.
    I will rework the homeworks when I get a chance,
    to make sure I understand the concepts and to prepare for the exam.
    For the moment, however, this all I have completed to be submitted.
*/