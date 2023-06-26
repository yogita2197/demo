package variable_programms;

public class Swap_variable_using_thirdvariable {

	public static void main(String[] args) {
		// The simplest method to swap two variables is to use a third temporary variable
		int a, b, temp;
		   a = 15;
		   b = 27;
		   System.out.println("Before swapping : a, b = "+a+", "+ + b);
		   temp = a;
		   a = b;
		   b = temp;   
		  System.out.println("After swapping : a, b = "+a+", "+ + b);
	}

}
