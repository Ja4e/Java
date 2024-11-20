public class JavaC2E6{
	public static void main(String[] args){
		for (int i = 0; i < 100; i++){
			if (i % 2 == 1){
				if (i < 100){
					System.out.println("  " + i);
				}
				else{
					System.out.println(" " + i);
				}
			}
		}
	}
}
