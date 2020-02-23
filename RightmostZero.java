public class RightmostZero{
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
	public static int rightmostSearch(int[] array, int k){
		// Continue to search until end
		int rightindex = -1;
		// Loop to the end of the array
		for(int i = 0; i < array.length; i++){
			// Check current item
			if (array[i] == k)
				// Store index
				rightindex = i;
		}
		return rightindex; // -1 not found or leftmost index 
	}
	public static void main(String[] args){
		// Declare an integer array
		int[] data = {1,0,1,0,1,1,1,1,0,1};
		int k = 0;
		// Print the array
		printArray(data);
		// Search for leftmost zero
		int rightmost = rightmostSearch(data, k);
		// Print results
		if (rightmost > 0)
			System.out.printf("Rightmost %d found at index %d.\n", k, rightmost);
		else
			System.out.printf("Value %d not found.\n", k);
	}
}


