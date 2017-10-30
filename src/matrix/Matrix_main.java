package matrix;

import java.util.Arrays;

public class Matrix_main {
	
	public static void main(String[] args) {
	
	  double a[][] = {{1, 2}, {-1,1}};
	  double b[][] = {{3, -1}, {2, 1}};
	  
	  Matrix_lib mlib = new Matrix_lib(a, b);
	  System.out.println("Prodct = "+Arrays.deepToString(mlib.getProduct()));
	}
}
