import java.util.Scanner;

public class JavaC4E1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);//Couldve used IBIO.inputInt
		System.out.print("Press: [1] for addition\n       [2] for multiplication\n       [3] for quit")
		int num = scanner.nextInt();
		System.out.print("enter first number: ")
		int a = scanner.nextInt();
		System.out.print("enter second number: ")
		int b = scanner.nextInt();
		do{
			switch (num){
				case 1:
					num = a+b;
					break;
				case 2:
					num = a*b;
					break;
				case 3:
					System.out.print("quitting...")
					break;
			}
		}
		while (num!=3)
	}
}
