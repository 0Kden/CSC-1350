/**
 * This program is written to experiment with the use of the
 * 'print' and 'println' methods, variable declaration, string concatenation
 * dividing intergers and dividing real numbers or mixed operands.
 * 
 * CSC 1350 Programming project No 1
 * Section 6
 * 
 * @author Kaden Wyble
 * @since 8/31/2018
 *
 */

public class Prog01_ExploreJava {

	public static void main(String[] args) {
		
		//Step 7
		int first = 3, second = 10;
		
		
		//Step 2
		System.out.println("frist name: John"); // need '(',')', and the double quotes
		System.out.println(" last name: Tyler"); //the leading space aligns the ":"s
		System.out.println();
		
		//Step 4
		System.out.println("first name: John");
		System.out.println(" last name: Tyler");
		System.out.println();

		//Step 6
		System.out.print("first name:");
		System.out.println(" John");
		System.out.println(" last name: Tyler");
		
		//Step 11
		System.out.println();
		System.out.println("first = " + first + ", second = " + second);
		
		//Step 15
		double average = (first + second)/2.0;
		System.out.println();
		System.out.println("Average = " + average);
		
		
		//Step 16
		int quotient = second / first;
		int remainder = second % first;
		System.out.println();
		System.out.println("Quotient of second/first = " + quotient);
		System.out.println("Remainder of second/first = " + remainder);
		
		//Step 17
		System.out.println();
		String firstname = "John";
		System.out.println("first name: " + firstname);
		
		//Step 19
		String name = "John Tyler";
		System.out.println();
		System.out.println("name: " + name);

	}

}
