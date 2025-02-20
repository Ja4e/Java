public class JavaC9E1 {
	public static double average(int[] array){
		double sum = 0;
		int length = array.length;
		for (int i = 0; i < array.length; i++){
			sum = sum + array[i];
		}
		return sum / length;
	}
	public static int minimum(int[] array){
		int minimum = array[0];
		int length = array.length;
		for(int i = 0; i < length; i++){
			if (array[i]<minimum){
				minimum = array[i];
			}
		}
		return minimum;
	}
	public static int maximum(int[] array){
		int maximum = array[0];
		int length = array.length;
		for(int i = 0; i < length; i++){
			if (array[i]>maximum){
				maximum = array[i];
			}
		}
		return maximum;
	}
	public static int range(int[] array){
		return (maximum(array)-minimum(array));
	}
	public static void main(String args[]){
		int[] num = new int[100];
		for (int i = 0; i < 100; i++){
			double xx = Math.random() * 6;
			int yy = (int)(xx + 1);
			num[i] = (int)(xx + 1);
			System.out.print(yy+" ");
		}
		System.out.printf("\nAverage = %,.2f", average(num));
		System.out.printf("\nMinimum = %,d", minimum(num));
		System.out.printf("\nMaximum = %,d", maximum(num));
		System.out.printf("\nRange = %,d", range(num));
	}
}
