import java.util.Scanner;

public class JavaC3E2{
	static boolean Prime(int n){
		if (n <= 1){
			return false;
		}
		for (int i = 2; i < n/2; i++){
			if (n % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = scanner.nextInt();
		int i = 2;
		if (Prime(x)==true && x > 1){
			do{
				if (x % i == 0 && Prime(i)){
					break;
				}
				i++;
			}
			while (true);
			System.out.println(x + " is divisible by " + i);
		}
		else{
			System.out.println("not a prime or number too small");
		}
	}
}

