import java.util.Scanner;

public class JavaC6E1R {
	static String stars(int n){
		String xx = "";
				for (int i = 0; i < n; i++){
					xx = xx + "*";
				}
				xx = xx + "\n";
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
