import java.util.Scanner;

public class JavaC3E4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number: ");
		int x = scanner.nextInt();
		do{
			System.out.print(x+", ");
			if (x%2==0){
				x = x/2;
			}
			else if (x%2==1){
				x = (x*3)+1;
			}
			if (x == 1){
				break;
			}
		} while (x!=0);
		System.out.println(x); 
	}
}
