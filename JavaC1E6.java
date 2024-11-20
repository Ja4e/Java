public class JavaC1E6{
	public static void main(String[] args){
		int term = IBIO.inputInt("term: ");
		int x = 3;
		int y = 4;
		int fibo = 0;
		for (int i=3; i<term; i++){
			fibo = x + y;
			System.out.print(fibo+", ");
			x = y;
			y = fibo;
		}
	}
}
