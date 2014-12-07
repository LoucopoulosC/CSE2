//
//Constantine Loucopoulos
//Lab 12
//Array Math Java Program
//
//  First compile the program
//      ArrayMath.java
//  Run the program
//      Java ArrayMath//

public class ArrayMath{
  
  public static void main(String [] arg){
    
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
      
    v=addArrays(x,y);
    
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));
                      
                       
  } //  End of main method
  
  
  public static String display(double [] x){
    String out="{";
    
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      
      out+=x[j];
    }
    return out+"}";
  }
  
  
  public static double[] addArrays(double[] x, double[] y){
    double sum;
    double[] array;
    boolean compare=x.length>y.length;
    int size;
    
    if (compare){
      size=x.length;
    }
      else{
        size=y.length;
      }
      
    array = new double[size];

    for(int i=0;i<size;i++){
        if(i+1>x.length){
          sum=0+y[i];
        }
          else if(i+1>y.length){
            sum=x[i]+0;
          }
              else{
                sum=x[i]+y[i];
              }
              
        array[i]=sum;
    }
    
    return array;
  }
  
  
  public static boolean equals(double[] x, double[] y){
    if (x.length==y.length){
      for(int i=0;i<x.length;i++){
        if (x[i]!=y[i]){
          return false;
        }
          else if (x[i]==y[i]){
            continue;
          }
        
      }
      
      return true;
      
    }
      else{
        return false;
      }
    
  }
  
  
} //  End of Class