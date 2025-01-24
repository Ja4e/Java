/*public class JavaStringDemoThur{
	public static void main (String[] args){
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		System.out.println(array);
		for(int index = 0; index < array.length; index++){
			System.out.print(array[index] + " ");
		}
	}
}*/

public class JavaStringDemoThur {
    public static void main(String[] args) {
        // Initialize an array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        
        // Print the array reference
        System.out.println("Array (memory reference): " + array);
        
        // Print elements using a for loop
        System.out.print("Array elements: ");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
        
        // Print elements using an enhanced for loop
        System.out.print("Using enhanced for-loop: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // Accessing elements
        System.out.println("First element: " + array[0]);
        System.out.println("Last element: " + array[array.length - 1]);
        
        // Modifying elements
        array[0] = 42;  // Change the first element
        System.out.println("Modified first element: " + array[0]);
        
        // Calculate the sum of all elements
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("Sum of array elements: " + sum);
        
        // Find the maximum element
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
