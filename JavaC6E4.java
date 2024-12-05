import java.util.Scanner;

public class JavaC6E4 {
	static String stars(int n){
		String xx = "";
		for (int i = 0; i < n; i++){
			xx = xx + "*";
		}
		return xx;
	}
	public static void main (String[] args) {
			do{
				try{
					Scanner scanner = new Scanner(System.in);
					System.out.print("enter number of lines: ");
					int num = scanner.nextInt();
					int count = num;
					for (int d = num; d >= 0; d--){
						count = d + 1;
						String bb = stars(count);
						System.out.print(bb+"\n");
					}
					for (int i =0; i < num+1; i++){
						count = i + 1;
						String aa = stars(count);
						System.out.print(aa+"\n");
					}
				}
				catch (Exception e){
					System.out.print("brother its number...");
				}
			}
			while (true);
	}
}
