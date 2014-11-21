//
//Constantine Loucopoulos
//Test2 Java Program
//
//  First compile the program
//      Javac Test2.java
//  Run the program
//      Java Test2//

//  Define a Class
public class Test2{
    
public static int perplex(int x,int y){
	x++;
	y+=x;
	System.out.println(x+" "+y);
	return x+y;
}

public static void main( String args[] ){
	int x=3,z=5;
	int y=perplex(x,z);
	System.out.println(y+" "+x+" "+z);
	x=10;
	y=perplex(x,x);
	System.out.println(y+ " " + x);
}
}