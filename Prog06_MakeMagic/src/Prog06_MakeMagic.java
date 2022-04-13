/**
 * This is a program that will create a matrix or "Magic Square" then it will test the principles of a magic square. 
 * It will test that the sum of each row, column, and diagonal are equal.
 * 
 * CSC 1350 Programming project No 6
 * Section 6 
 * 
 * @author Kaden Wyble
 * @since 10/31/18
 * 
 */

import java.util.Scanner;

public class Prog06_MakeMagic {

	public static void main(String[] args) {

		System.out.println("Lets make a magic table!");
		System.out.print("Enter a odd number: ");
		
		int n = 0;
		
		n = test(n);
	    
	    int[][] mSquare = MakeSquare(n);
	    pSquare(mSquare);
		
	}
	
	public static int test(int n) {
		
		Scanner in = new Scanner(System.in);
		
		
		while(!in.hasNextInt()) {
				System.out.print("Please enter a interger: ");
				in.nextLine();
			}	
		n = in.nextInt();
		
		while(true) {
		
			if (n % 2 == 0) {
				System.out.print("Please enter a odd number: ");
				n = in.nextInt();
			}
			else if (n < 0) {
				System.out.print("Please enter a positive number: ");
				n = in.nextInt();
			}
			else if (n > 0) {
				break;
			}
		}
		
		System.out.println();
		in.close();
		
		return n;
		
		
		
	}
	
	public static int [][] MakeSquare (int n) {
		
		
		//Array
		int [][] matrix = new int [n][n];
		
		
		//Initialization of the calculation values
		
		int row = 0;
		int col = n / 2;
		int cRow;
		int cCol;
				    
		for (int k = 1; k <= n * n; k++) {
			matrix[row][col] = k;
		    
		    cRow = row;
		    cCol = col;
		    row = row - 1;
		    col = col + 1;
		    if (row == -1) {
		    	row = n - 1;
		    }
		    if (col == n) {
		    	col = 0;
	        }
		    if (matrix[row][col] != 0) {
			   	row = cRow + 1;
			   	col = cCol;
			   	if (row == -1) {
	                row = n - 1;
		       }
		    }
		}
				
		
		return matrix;
	}
	
	public static void pSquare (int [][] mSquare) {
		
		//Prints the table
		for(int i = 0; i < mSquare.length; i++) {
			for(int j = 0; j < mSquare.length; j++) {
				System.out.printf("%4d", mSquare[i][j]);
			}
			System.out.println();
		}		
	}

	public static void check(int [][] mSquare) {
		
		int sRow = 0;
		int sCol = 0;
		int sDag = 0;
		
		System.out.println();
		for(int i = 0; i < mSquare.length; i++) {
			sRow = sRow + mSquare[i][0];
		}
		for(int i = 0; i < mSquare.length; i++) {
			sCol = sCol + mSquare[0][i];
		}
		for(int i = 0;  i < mSquare.length; i++) {
			
				
			
		}
		System.out.println(sRow);
		System.out.println(sCol);
		System.out.println(sDag);
		
	}
	
}
