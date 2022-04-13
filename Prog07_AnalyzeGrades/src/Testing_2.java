import java.util.Scanner;

public class Testing_2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int [] arr = {96,93,88,82,72,70,69,63,50,35,23,19};
		
		int i;
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int Max = arr[0];
		int Min = arr[i-1];
		int Median = arr.length/2;
		int Mean = 0;
		
		
		for(int j = 0; j < arr.length; j++) {
			Mean = (Mean + arr[j]);
		}
		Mean = Mean/arr.length;
		
		System.out.println("Max: " + Max);
		System.out.println("Min: " + Min);
		System.out.println("Median: " + arr[Median]);
		System.out.println("Mean: " + Mean);
		
		System.out.println();
		System.out.print("Enter: ");
		
		int target = in.nextInt();
		
		Bsearch(arr,target);
		
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
