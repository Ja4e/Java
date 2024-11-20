public class JavaC2E8{
	public static void main(String[] args){
		int counter = 0;
		for (int i = 0; i < 1000000; i++){
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
				counter++;
			}
		}
		System.out.println("the answer is "+counter);
	}
}
