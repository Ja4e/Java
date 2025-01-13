public class JavaC8E1{
    static boolean good(int a, int b){
        int x = a * b + 1;
        int y = (int) (Math.sqrt(x) + .5);
        return ( y * y == x );
    }
    public static void main(String args[]){
        for (int i = 1; i < 100; i++){
            for (int j = i; j < 100; j++){ // start j from i
                for (int k = j; k < 100; k++){ // start k from j
                    if (good(i, j) && good(j, k) && good(i, k)){
                        System.out.print(i + " " + j + " " + k + "\n");
                    }
                }
            }
        }
    }
}
