import java.util.Scanner;

public class JavaC10E2 {
    static boolean isBinary(char[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] != '0' && num[i] != '1') {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Binary: ");
        String num = scanner.next();
        scanner.close(); 
		char[] a = num.toCharArray(); 
        if (isBinary(a)) { 
            long b = 0;
            long c = 1;

            for (int d = a.length - 1; d >= 0; d--) {
                if (a[d] == '1') { 
                    b += c;
                }
                c *= 2;
            }
            System.out.println("Decimal: " + b);
        } else {
            System.out.println("Not a binary number.");
        }
    }
}
