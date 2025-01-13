public class JavaC9E3 {
	public static void main(String args[]){
		int[] num = new int[100];
			for (int i = 0; i < 100; i++){
				double xx = Math.random() * 6;
				num[i] = (int)(xx + 1);
			}
		for (int d = 1; d <= 6; d++){
			for (int i = 0; i < 100; i++){
				if (num[d]==i){
					System.out.println(num[i]);
				}
			}
			System.out.println();
		}
	}
}
