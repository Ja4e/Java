//import java.util.Scanner;
/*public class JavaC10E1 {
	public static void main(String args[]){
		//Scanner scanner = new Scanner(System.in);
		//System.out.print("enter your name: ");
		//String ss = scanner.next();
		String ss = IBIO.input("enter your name: "); // This IBIO could be replaced by these four lines manually without IBIO support
		//char[] xx = ss.toCharArray();
		
		for (int i = 0; i < ss.length(); i++){
			System.out.print(ss.substring(i,ss.length()));
		}
		System.out.print("\n");
		for (int d = ss.length(); d > 0; d--){
			System.out.print(ss.substring(d,ss.length()));
		}
		System.out.print("\n");
	}
}
*/

//import java.util.Scanner;
public class JavaC10E1 {
	public static void main(String args[]) {
		// Scanner scan = new Scanner(System.in);
		// System.out.print("enter your name: ");
		// String ss = scan.next();
		String ss = IBIO.input("enter your name: "); // This IBIO could be replaced by these four lines manually without IBIO support
		char[] xx = ss.toCharArray();
		System.out.println(ss);

		// for (int i = 0; i < ss.length(); i++){
		//     System.out.print(xx.substring(i,dd)); // Incorrect, as char[] does not have substring
		// }

		for (int d = xx.length - 1; d >= 0; d--) {
			System.out.print(xx[d]);
		}
		System.out.print('\n' + ss);

		for (int d = xx.length - 2; d >= 0; d--) {
			System.out.print(xx[d]);
		}
	}
}
