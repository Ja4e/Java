import java.util.Scanner;

public class JavaC3E3{
	public static void main(String[] args){
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number: ");
		int x = scanner.nextInt();
		do{
		int digit = x % 10;
		sum = sum + (digit*digit*digit);
		x = x /10;
		} while (x!=0);
		System.out.println(sum); 
	}
}
