/**
 * This is a calculator to calculate the date of Easter Based on the year entered by the user.
 * 
 * CSC 1350 Promgramming project No 2
 * Section 6
 * 
 * @author kadenwyble
 * @since 9/12/2018
 */

import java.util.Scanner;



public class Prog02_EasterCalc {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("When is Easter, you ask?");
		System.out.print("Enter the year of your choosing: ");
		

		
		
		// Year
		int y = in.nextInt();
		
		// Calculator
		int a = y % 19;
		int b = y / 100;
		int c = y % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		
		//Month
		int n = (h - m + r + 90) / 25;
		
		//Day
		int p = (h - m + r + n + 19) % 32;
	
		// Answer
		System.out.println();
		System.out.printf("In %d, Easter falls on %d/%d.", y,n,p);
		
		
		
		
		
		in.close();

	}

}
