//
//Constantine Loucopoulos
//Lab 13
//Lab 13 Java Program
//
//  First compile the program
//      lab13.java
//  Run the program
//      Java lab13//

//  Define a Class
public class lab13{
    
    //  Add main method
    public static void main(String[] args)  {
        
        //  Declare Variables and Allocate Memory Space
        int[][] array = new int[5][];
        
        for(int i=0;i<5;i++){
            array[i]= new int[(i*3)+5];
        }
        
        for(int i=0;i<5;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=(int)((Math.random())*39);
            }
        }
        
        System.out.println();
        System.out.println("The array before sorting:");
        System.out.println();
        
        for(int j=0;j<array.length;j++){
            String out="{";
            if(j>0){
                System.out.println();
            }
            for(int i=0;i<array[j].length;i++){
                if(i>0){
                    out+=", ";
                }
                out+=array[j][i];
            }
            System.out.println(out+"}");
        }
        

        int min=0;
        
        for(int w=0;w<array.length;w++)
           for (int i = 0; i < array[w].length; i++) {
                // Assume first element is min
                min = i;
                for (int j = i + 1; j < array[w].length; j++) {
                    if (array[w][j] < array[w][min]) {
                        min = j;
        
                    }
                }
                if (min != i) {
                    final int temp = array[w][i];
                    array[w][i] = array[w][min];
                    array[w][min] = temp;
                }
                
            }
        
        System.out.println();
        System.out.println("The array after sorting:");
        System.out.println();
        
        for(int j=0;j<array.length;j++){
            String out="{";
            if(j>0){
                System.out.println();
            }
            for(int i=0;i<array[j].length;i++){
                if(i>0){
                    out+=", ";
                }
                out+=array[j][i];
            }
            System.out.println(out+"}");
        }
        
    }   //  End of main method
    
}   //  End of class