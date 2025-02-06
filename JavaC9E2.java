public class JavaC9E2 {
	static int random(){
		return ((int)((double)Math.random() * 6)+1);
	}
	
	public static void main(String args[]){
		int[] num = new int[100];
			for (int i = 0; i < 100; i++){
				num[i] = random();
			}
		for (int i = 0; i < 100; i++){
			System.out.println(num[i]);
		}
	}
}
