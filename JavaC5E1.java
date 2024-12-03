import java.util.Scanner;

public class JavaC5E1 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter first number: ");
		double a = scanner.nextDouble();
		System.out.print("enter second number: ");
		double b = scanner.nextDouble();
		double num = a/b;
		System.out.println("division gives: " + num);
	}
	
/*	public static void main2 (String[] args) {
		double a = IBIO.inputDouble("enter first number: ");
		double b = IBIO.inputDouble("enter second number: ");
		double num = a/b;
		IBIO.output("division gives: " + num);
	}*/
}


