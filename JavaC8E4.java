public class JavaC8E4{
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
        System.out.println(gcd(36, 27));
    }
}
