import java.util.Scanner;

public class JavaC10E2 {
    static int check(String num, char[] xx) {
        for (int d = 0; d < num.length(); d++) {
            if (xx[d] != '0' && xx[d] != '1') {
                return 1; 
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Binary: ");
        String num = scanner.next();
        char[] xx = num.toCharArray();
        int e = 1;
        int a = 0;

        if (check(num, xx) == 0) { 
            for (int d = 0; d < num.length(); d++) {
                if (xx[d] == '1') { 
                    a = a + e;
                }
                e = e * 2; 
            }
            System.out.println(a);
        } else {
            System.out.println("not a binary");
        }
    }
}
