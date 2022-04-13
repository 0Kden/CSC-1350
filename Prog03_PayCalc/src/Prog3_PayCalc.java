/**
 * 
 * This program will 1st take in the users data then 2nd calculate the sum a salesperson's sales for each day of the week
 * ,3rd calculate the total sales for the week, 4th calculate the commission earned by the salesperson
 * for the week, and 5th calculate the average sale value.
 * 
 * CSC 1350 Programming project No 3
 * Section 6 
 * 
 * @author kadenwyble
 * @since 10/1/2018
 * 
 */

import java.util.Scanner;

public class Prog3_PayCalc {

	public static void main(String[] args) { 
		
		//Scanner
		Scanner in = new Scanner(System.in);
		
		//Initializations
		double sunday = 0;
		double monday = 0;
		double tuesday = 0;
		double wednesday = 0;
		double thursday = 0;
		double friday = 0;
		double saturday = 0;
		double sAmt = 0;
		
		
		String done = "N";
		String day;
		//boolean d = true;
		int sNum = 0;
		
		//While Loop
		while (done.equals("N")) {
			System.out.print("Enter Day of Sale (Sunday, Monday, Tuesday, etc.): ");
			day = in.nextLine();
			
			while (true) {
				if (day.equals("Sunday")) {
					break;
				}
				else if (day.equals("Monday")) {
					break;
				}
				else if (day.equals("Tuesday")) {
					break;
				}
				else if (day.equals("Wednesday")) {
					break;
				}
				else if (day.equals("Thursday")) {
					break;
				}
				else if (day.equals("Friday")){
					break;
				}
				else if (day.equals("Saturday")) {
					break;
				}
				else {
					System.out.print("Invalid Input, please enter day of the week: ");
					day = in.nextLine();
				}
			}
			
			System.out.print("Enter Sale Amount: ");
			sAmt = in.nextDouble();
			in.nextLine();
			

			while (sAmt <= 0) {
				System.out.print("Invalid Input, please enter positve number: ");
				sAmt = in.nextDouble();
				in.nextLine();
			}
			
			//Yes or No Statement
			System.out.print("Are you finished entering sales? (Y/N) ");
			done = in.nextLine();
			System.out.println();
			boolean yn = true;
			
			while (yn == true) {
				if (done.equals("Y")) {
					yn = false;
				}
				else if (done.equals("N")) {
					yn = false;
				}
				else {
					yn = true;
					System.out.print("Invaild Input, Please enter Y or N: ");
					done = in.nextLine();
				}
			}
			
			//Stores the number values to the corresponding day
			if (day.equals("Sunday")) {
				sunday = sunday + sAmt;
				sNum++;
			}
			else if (day.equals("Monday")) {
				monday = monday + sAmt;
				sNum++;
			}
			else if (day.equals("Tuesday")) {
				tuesday = tuesday + sAmt;
				sNum++;
			}
			else if (day.equals("Wednesday")) {
				wednesday =  wednesday + sAmt;
				sNum++;
			}
			else if (day.equals("Thursday")) {
				thursday = thursday + sAmt;
				sNum++;
			}
			else if (day.equals("Friday")) {
				friday = friday + sAmt;
				sNum++;
			}
			else if (day.equals("Saturday")) {
				saturday =  saturday + sAmt;
				sNum++;
			}
			
		}
		
		//Final Calculations
		double myCost = sunday + monday + tuesday + wednesday + thursday + friday + saturday;
		double average = myCost / sNum;
		double comm = (myCost * .09) + 200;
		
		if (myCost > 15000) {
			comm = comm + 1000;
		}
		
		if (myCost >= 60000 ) {
			System.out.println(" ***");
		}
		
		//Print statements
		System.out.println("Total number of sales: " + sNum + " sales.");
		System.out.println();
		
		System.out.println("     Day         Sales   ");
		System.out.printf("Sunday        $" + "%,10.2f\n",sunday);
		System.out.printf("Monday        $" + "%,10.2f\n",monday);
		System.out.printf("Tuesday       $" + "%,10.2f\n",tuesday);
		System.out.printf("Wednesday     $" + "%,10.2f\n",wednesday);
		System.out.printf("Thursday      $" + "%,10.2f\n",thursday);
		System.out.printf("Friday        $" + "%,10.2f\n",friday);
		System.out.printf("Saturday      $" + "%,10.2f\n",saturday);
		System.out.println("              -----------");
		
		
		System.out.printf("Total Sales:  $" + "%,10.2f\n", myCost);
		System.out.printf("Average sale value: $" + "%,10.2f\n", average);
		System.out.printf("Commission on Sales: $" + "%,10.2f", comm);
		
		
		in.close();
	}

}
