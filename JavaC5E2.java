public class JavaC5E2{
	public static void main(String arg[]){
		double term = 0;
		double sum = 0;
		for (double i = 1; i < 100; i++){
			term = 1/(i*i);
			sum = sum + term;
			System.out.print(sum + " ");
		}
		System.out.println("\n"+sum);
	}
}
