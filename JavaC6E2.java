import java.util.Scanner;

public class JavaC6E2 {
	static String stars(int n){
		String xx = "";
		for (int i = 0; i < n; i++){
			xx = xx + "*";
		}
		return xx;
	}
	public static void main (String[] args) {
		do{
			Scanner scanner = new Scanner(System.in);
			System.out.print("enter number of lines: ");
			int num = scanner.nextInt();
			int count = num;
			for (int i =0; i < num; i++){
				count = i + 1;
				String aa = stars(count);
				System.out.print(aa+"\n");
			}
		}
		while (true);
	}
}
