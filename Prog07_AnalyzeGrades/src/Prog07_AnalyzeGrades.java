/**This program takes data off of a text file with test grade values that the user selects
 * thought the file chooser. Puts the data in ArrayList and then sorts the grades in descending 
 * order and one per line. Then it will ask the user to select where to put the text file with 
 * the newly sorted data.
 * 
 * CSC 1350 Programming project No 6
 * Section 6
 * 
 * @author Kaden Wyble
 * @since 11/7/2018
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import java.io.PrintWriter;

public class Prog07_AnalyzeGrades {

	public static void main(String[] args) throws FileNotFoundException{
		
		
		try {
			//Initializations of the array used to store the data from the text file
			int [] grades = arr();
			
			//Calling of the sorting method
			bSort(grades);
			
			//Calling of the method that writes the sorted data to a text file
			output(grades);
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("Do you want to search for a grade? (Y/N) ");
			String search = in.nextLine();
			boolean done = false;
			
			while(done = true) {
				
				if(search.equals("Y")) {
					
					System.out.println();
					System.out.print("Enter a grade to search for: ");
					int target = in.nextInt();
					
					Bsearch(grades,target);
					
					System.out.println();
					System.out.print("Do you want to search for another grade? (Y/N) ");
					
					done = true;
				}
				else if (search.equals("N")){
					done = false;
				}
				
			}
		}	
		
		//Catches the error if the file is not found
		catch (FileNotFoundException e) {
			System.out.println();
			System.out.println("File not Found");
		}
		
		//Catches the error if the file is not accessible
		catch (SecurityException e) {
			System.out.println();
			System.out.println("Access Denied");
		}
	}
	
	//Method that creates the array from the data of the text file.
	public static int [] arr () throws FileNotFoundException {
		
		//Allows the user to select the data file
		JFileChooser chooser = new JFileChooser();
		Scanner in = null;
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File inputFile = chooser.getSelectedFile();
			in = new Scanner(inputFile);
		}
		
		//Array used to reference to grades
		int [] arr = new int[in.nextInt()];
		
		//Reads and takes in the data values till there is no more to read.
		while(in.hasNextInt()) {

			//Adds each read value to the array list
			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}
		}
		//Closes Scanner in
		in.close();
		
		//Returns the completed array list
		return arr;
		
	}
	
	//Method that uses the bubble sort algorithm to sort the array list in descending order
	public static int [] bSort(int[] grades) {
		
		//Short circuit B.Sort
		boolean sorted = false;
		int i = 1;
		
		while(!sorted) {
			if (i == grades.length) {
				sorted = true;
			}
			else {
				
				sorted = true;
				for (int j = 0; j < grades.length - i; j++) {
		        	//Determines if the value needs to be swapped or not
		            if (grades[j] < grades[j+1] ) {
		            	//Calls the swap method
		            	swap(grades,j,j+1);
		            	sorted = false;
		            }
		        }
			}
		 i++;	
		}
		
	   //Returns the sorted array list
       return grades;
		
	}
	
	//Method that swaps the two adjacent values
	public static int [] swap(int[] grades ,int i, int j) {
		
		//Swaps the two values being compared
		int temp = grades[i];
        grades[i] = grades[j];
        grades[j] = temp;
        
        //returns swapped values
        return grades;
	}

	//Method that lets the user decide where they want to put the output of the data
	public static void output (int[] grades) throws FileNotFoundException {
		
		//File chooser
		JFileChooser chooser = new JFileChooser();
		
		if(chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			File outFile = chooser.getSelectedFile();
			PrintWriter out = new PrintWriter(outFile);
			
			//Goes through the array list and prints out each data value on separate lines
			for (int i = 0; i < grades.length; i++) {
				out.println(grades[i]);
			}
			//Closes PrintWriter out
			out.close();
		}
		
	}
	
	public static int Bsearch (int [] arr,int target) {	
			
			int low = 0;
			int high = arr.length - 1;
			int index = 0;
			
			while (low <= high) {
		        int mid = (low + high) / 2;
		        if (arr[mid] > target) {
		            low = mid + 1;
		        } 
		        else if (arr[mid] < target) {
		            high = mid - 1;
		        } 
		        else if (arr[mid] == target) {
		            index = mid;
		            break;
		        }
		    }
			System.out.println(index);
		    return index;
		}
}
