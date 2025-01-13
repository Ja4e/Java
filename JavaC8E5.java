public class JavaC8E5 {
    static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public static void main(String args[]) {
        boolean[] found = new boolean[100];
        
        for (int a = 1; a < 100; a++) {
            for (int b = a; b < 100; b++) {
                for (int c = b; c < 100; c++) {
                    if (a * a + b * b == c * c) {
                        int gcdAB = gcd(a, b);
                        int gcdAC = gcd(a, c);
                        int gcdBC = gcd(b, c);
                        
                        if (gcdAB == 1 && gcdAC == 1 && gcdBC == 1 && !found[a] && !found[b] && !found[c]) {
                            System.out.println(a + " " + b + " " + c);
                            found[a] = true;
                            found[b] = true;
                            found[c] = true;
                        }
                    }
                }
            }
        }
    }
}
