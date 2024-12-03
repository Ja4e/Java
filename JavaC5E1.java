//import java.util.Scanner;

public class JavaC5E1{
	public static void main(String args[]){
		double term = 1;
		double sum = 0;
		for (int i = 0 ; i < 100; i++){
			term = term / 5;
			sum = sum + term;
			System.out.print(sum);
		}
		System.out.print("total is "+ sum);
	}
}
