public class JavaC8E2{
    static boolean good(int a, int b){
        int x = a * b + 1;
        int y = (int) (Math.sqrt(x) + .5);
        return (y * y == x);
    }
    public static void main(String args[]){
        for (int i = 1; i < 200; i++){
            for (int j = i; j < 200; j++){
                for (int k = j; k < 200; k++){
                    for (int l = k; l < 200; l++){
                        if (good(i, j) && good(j, k) && good(i, k) && good(i, l) && good(j, l) && good(k, l)){
                            System.out.println(i + " " + j + " " + k + " " + l);
                        }
                    }
                }
            }
        }
    }
}
