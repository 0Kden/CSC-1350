/**
 * CSC 1350 Programming Project No.5
 * Section 6
 * 
 * @author kadenwyble
 * @since 10/15/2018
 */

import java.util.Scanner;

public class Prog05_ProgramsMenu {
	
	

	public static void main(String[] args) {
		//Scanner 
		Scanner in = new Scanner(System.in);
		String menu = "A";
		
		//Selection Menu
		while(!menu.equals("X")) {
			System.out.println();
			System.out.println("INTERESTING PROGRAMS MENU");
			System.out.println("===================================");
			System.out.println("[A]  CALCULATE EASTER DATE");
			System.out.println("[B]  CALCULATE COMMISSION PAY");
			System.out.println("[C]  GENERATE CALCULATION TABLE");
			System.out.println("[X]  QUIT");
			System.out.println("===================================");
			System.out.print("ENTER MENU OPTION: ");
			menu = in.nextLine();
			System.out.println();
				
			handle(menu);	
			
		}
	}
	
	
	public static String handle (String menu) {

		Scanner in = new Scanner(System.in);
		
		while (true) {
			if (menu.equals("A")) {
				Prog02_EasterCalc();
				break;
			}
			else if (menu.equals("B")) {
				Prog03_PayCalc();
				break;
			}
			else if (menu.equals("C")) {
				Prog04_MakeTable();
				break;
			}
			else if (menu.equals("X")){
				System.out.println();
				System.out.println("Program stopped, Thank you!");
				break;
				
			}
			else {
				System.out.print("Please enter vaild input: ");
				menu = in.nextLine();
			}
		}
		
		return menu;
	}
	
	public static void Prog02_EasterCalc () {
		
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
		System.out.println();
		
		
	}
	
	public static void Prog03_PayCalc () {
		
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
					
					System.out.print("Are you finished entering sales? (Y/N) ");
					done = in.nextLine();
					System.out.println();
					
					
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
				System.out.println();
				
				
				
	}
	
	public static void Prog04_MakeTable() {
		
		//Scanner
				Scanner in = new Scanner(System.in);
				
				//Initializations
				String operator;
				int small;
				int large;
				int i;
				int j;
				
				
				//Input Questions
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
			        for(i = small; i <= large ;i++ ) {
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
				//Division Table Needs fixing
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
				//Random Table Needs fixing
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
			            	if (pro > j) {
			            		System.out.print("   -");
			            	}
			            	else {
			            		System.out.printf("%4d",pro);
			            	}
			             }
			            
			            System.out.println();
			        }
				}
				
			
	}
	
}
