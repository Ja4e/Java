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
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Array (memory reference): " + array);
        
        System.out.print("Array elements: ");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
        
        System.out.print("Using enhanced for-loop: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        System.out.println("First element: " + array[0]);
        System.out.println("Last element: " + array[array.length - 1]);
        
        array[0] = 42;
        System.out.println("Modified first element: " + array[0]);
        
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("Sum of array elements: " + sum);


        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
