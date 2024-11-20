import java.util.Scanner;

public class JavaC3E1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x;
		do{
		System.out.print("enter a number less than 100: ");
		x = scanner.nextInt();
		}
		while (x<100 && x>0);
		System.out.println("thank you");
	}
}
