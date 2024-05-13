package question6;

public class ArrayDeletion {
	
	    public static int[] deleteElement(int[] array, int index) {
	        // Check if the index is valid
	        if (index < 0 || index >= array.length) {
	            System.out.println("Invalid index.");
	            return array;
	        }
	        
	        // Create a new array with one less element
	        int[] modifiedArray = new int[array.length - 1];
	        
	        // Copy elements from the original array to the modified array
	        int j = 0;
	        for (int i = 0; i < array.length; i++) {
	            // Skip the element at the specified index
	            if (i == index) {
	                continue;
	            }
	            
	            modifiedArray[j] = array[i];
	            j++;
	        }
	        
	        return modifiedArray;
	    }

	    public static void main(String[] args) {
	        int[] array = {3, 7, 1, 9, 4};
	        int indexToDelete = 2;

	        System.out.print("Original array: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	        int[] modifiedArray = deleteElement(array, indexToDelete);

	        System.out.print("\nModified array: ");
	        for (int num : modifiedArray) {
	            System.out.print(num + " ");
	        }       
	 }
}
