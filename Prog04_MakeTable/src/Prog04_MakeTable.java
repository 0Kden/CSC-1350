/**
 * This program will create a table based on user input of the range and operation.
 * 
 * CSC 1350 Programming project No 4
 * Section 6
 * 
 * @author KadenWyble
 * @since 10/8/18
 * 
 */

import java.util.Scanner;

public class Prog04_MakeTable {

	public static void main(String[] args) {
		
		//Scanner
		Scanner in = new Scanner(System.in);
		
		//Initializations
		String operator;
		int small;
		int large;
		int i;
		int j;
		
		
		//Input Questions
		//while (true) {
		System.out.print("Enter the table operator (+, -, *, /, %, or R): ");
		operator = in.nextLine();
		
		while(true) {
			if (operator.equals("+")) {
				break;
			}
			else if (operator.equals("-")) {
				break;
			}
			else if (operator.equals("*")) {
				break;
			}
			else if (operator.equals("/")) {
				
			}
			else if (operator.equals("R")) {
				break;
			}
			else {
				System.out.print("Invalid input, enter valid input: ");
				operator = in.nextLine();
			}
		}
		
		System.out.print("Enter the smallest operand for the table: ");
		small = in.nextInt();
		
		System.out.print("Enter the largest operand for the table: ");
		large = in.nextInt();
		
		System.out.println();
		
		//Addition Table
		if(operator.equals("+")) {
			System.out.print("   +");
	        for(i = small; i <= large ;i++ ) {
	            System.out.printf("%4d",i);
	        }
	        System.out.println();
	        for(i = small ;i <= large ;i++) {
	             System.out.printf("%4d",i);
	             for(j = small;j <= large ;j++) {
	            	 System.out.printf("%4d",i+j);
	            }
	            System.out.println();
	        }
		}
		//Subtraction Table
		else if (operator.equals("-")) {
			System.out.print("   -");
	        for(i = small; i <= large ;i++) {
	            System.out.printf("%4d",i);
	        }
	        System.out.println();
	        for(i = small ;i <= large ;i++) {
	             System.out.printf("%4d",i);
	             for(j = small;j <= large ;j++) {
	            	 System.out.printf("%4d",i-j);
	            }
	            System.out.println();
	        }
		}
		//Multiplication Table
		else if (operator.equals("*")) {
			System.out.print("   *");
	        for(i = small; i <= large ;i++ ) {
	            System.out.printf("%4d",i);
	        }
	        System.out.println();
	        for(i = small ;i <= large ;i++) {
	             System.out.printf("%4d",i);
	             for(j = small;j <= large ;j++) {
	            	 System.out.printf("%4d",i*j);
	            }
	            System.out.println();
	        }
		}
		//Division Table
		else if (operator.equals("/")) {
			System.out.print("   /");
	        for(i = small; i <= large ;i++ ) {
	            System.out.printf("%4d",i);
	        }
	        System.out.println();
	        for(i = small ;i <= large ;i++) {
	             System.out.printf("%4d",i);
	             for(j = small;j <= large ;j++) {
	            	 if (j == 0) {
		            		System.out.print("   -");
	            	 } 
	            	 else {
	            	 System.out.printf("%4d",i/j);
	            	 }
	            }
	             
	            System.out.println();
	        }
		}
		//Modulo Table
		else if (operator.equals("%")) {
			System.out.print("   %");
	        for(i = small; i <= large ;i++ ) {
	            System.out.printf("%4d",i);
	        }
	        System.out.println();
	        for(i = small ;i <= large ;i++) {
	             System.out.printf("%4d",i);
	             for(j = small;j <= large ;j++) {
	            	 if (j == 0) {
	            		System.out.print("   -");
	            	 } 
	            	 else {
	            	 System.out.printf("%4d",i%j);
	            	 }
	            }
	            System.out.println();
	        }
		}
		//Random Table 
		else if (operator.equals("R")) {
			System.out.print("   R");
	        for(i = small; i <= large ;i++ ) {
	            System.out.printf("%4d",i);
	        }
	        System.out.println();
	        for(i = small ;i <= large ;i++) {
	             System.out.printf("%4d",i);
	             for(j = small;j <= large ;j++) {
	            	int pro = 0;
	            	pro = i +(int)(Math.random()* j);
	            	if (pro >= j) {
	            		System.out.print("   -");
	            	}
	            	else {
	            		System.out.printf("%4d",pro);
	            	}
	             }
	            
	            System.out.println();
	        }
		}
		
		
		
		
		
		
		
		in.close();
		
	}

}
