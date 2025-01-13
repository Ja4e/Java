public class JavaC9E2 {
	public static void main(String args[]){
		int[] num = new int[100];
			for (int i = 0; i < 100; i++){
				double xx = Math.random() * 6;
				num[i] = (int)(xx + 1);
			}
		for (int i = 0; i < 100; i++){
			System.out.print(num[i]+"\n");
		}
	}
}
