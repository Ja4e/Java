public class JavaC2E7{
	public static void main(String[] args){
		for (int i = 0; i < 100; i++){
			if (i % 2 != 0 && i % 3 != 0){ // (i % 2 != 0 || i % 3 != 0) work as well
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
