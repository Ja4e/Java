import java.util.Scanner;

public class JavaC6E1 {
	static String stars(int n){
		String xx = "";
		for (int i = 0; i < n; i++){
			if (i % 10 == 0){
				xx = xx + "\n*";
			}
			else{
				xx = xx + "*";
			}
		}
		return xx;
	}
	public static void main (String[] args) {
		do{
			Scanner scanner = new Scanner(System.in);
			System.out.print("enter number of lines: ");
			int num = scanner.nextInt();
			String aa = stars(num);
			for (int i =0; i < num; i++){
				System.out.print(aa);
			}
		}
		while (true);
	}
}
