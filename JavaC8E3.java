public class JavaC8E3{
    public static void main(String args[]){
        for (int a = 1; a < 100; a++){
            for (int b = a; b < 100; b++){
                for (int c = b; c < 100; c++){
                    if (a * a + b * b == c * c){
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}
