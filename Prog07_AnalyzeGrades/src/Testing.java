import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Testing {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Select a File.");
		System.out.println();
				
		try {
			
			int [] grades = arr();
				
			bSort(grades);
				
			output(grades);
			
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
		catch (FileNotFoundException e) {
			System.out.println();
			System.out.println("File not Found");
		}
		catch (SecurityException e) {
			System.out.println();
			System.out.println("Access Denied");
		}
	}
	
	public static int [] arr () throws FileNotFoundException {
		
		String desktop = System.getProperty ("user.home") + "/Desktop/";
		File myFile = new File (desktop + "input.txt");
	
		Scanner in = new Scanner(myFile);
		
		int [] arr = new int [in.nextInt()];
		
		
		while(in.hasNextInt()) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}
		}
		in.close();
		
		
		
		return arr;
		
	}
	
	public static int[] bSort(int[] grades) {

		boolean sorted = false;
		int i = 1;
			
		while(!sorted) {
			if (i == grades.length) {
				sorted = true;
			}
			else {
					
				sorted = true;
				for (int j = 0; j < grades.length - i; j++) {
					
			        if (grades[j] < grades[j+1] ) {
			           	
			           	swap(grades,j,j+1);
			           	sorted = false;
		           }
			           
		        }
			}
		  i++;
		}
				    
		
	    return grades;	
	}
	
	public static int[] swap(int[] grades, int i ,int j){
		
		int temp = grades[i];
        grades[i] = grades[j];
        grades[j] = temp;
        
        return grades;
	}

	public static void output (int[] grades) throws FileNotFoundException {
		
		
		JFileChooser chooser = new JFileChooser();
		
		if(chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			File outFile = chooser.getSelectedFile();
			PrintWriter out = new PrintWriter(outFile);
			
			int i;
			for (i = 0; i < grades.length; i++) {
				out.println(grades[i]);
			}
			
			int Max = grades[0];
			int Min = grades[i-1];
			int Median = grades.length/2;
			int Mean = 0;
			for(int j = 0; j < grades.length; j++) {
				Mean = (Mean + grades[j]);
			}
			Mean = Mean/grades.length;
			
			out.println();
			
			out.println("Max: " + Max);
			out.println("Min: " + Min);
			out.println("Median: " + grades[Median]);
			out.println("Mean: " + Mean);
			
			int A = 0;
			int B = 0;
			int C = 0;
			int D = 0;
			int F = 0;
			
			for(int x = 0; x < grades.length-1; x++) {
				if (grades[x] >= 90) {
					A++;
				}
				else if (grades[x] >= 80) {
					B++;
				}
				else if (grades[x] >= 70) {
					C++;
				}
				else if (grades[x] >= 60) {
					D++;
				}
				else if (grades[x] <= 60) {
					F++;
				}
			}
			
			int t = A + B + C + D + F;
			
			out.println();
			out.println("Number of As: " + A);	
			out.println("Number of Bs: " + B);	
			out.println("Number of Cs: " + C);	
			out.println("Number of Ds: " + D);	
			out.println("Number of Es: " + F);
			
			out.println("Total number of Grades: " + t);
				
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