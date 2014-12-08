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
