import java.util.Scanner;

public class JavaC3E2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = scanner.nextInt();
		int i = 1;
		do{
			i++;
		}
		while (x % i != 0 &&);
		System.out.println(x + " is divisible by " + i);
	}
}
