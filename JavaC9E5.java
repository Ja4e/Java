public class JavaC9E5 {
	public static void main(String args[]){
		int[] num = new int[1000];
		
		for (int i = 0; i < 100; i++){
			double xx = Math.random() * 6;
			double dd = Math.random() * 6;
			num[i] = (int)(xx + 1) + (int)(dd + 1);
		}
		
		for (int d = 2; d <= 12; d++){
			System.out.print(d);
			System.out.print("   ");
			for (int i = 0; i < 1000; i++){
				if (num[i]==d){
					System.out.print("X");
				}
			}
			System.out.print("\n");
		}
	}
}
