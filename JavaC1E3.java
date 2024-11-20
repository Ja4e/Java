public class JavaC1E3{
	public static void main(String[] args){
		int number = 10;
		int squares = 0;
		int cubes = 0;
		for (int i = 1; i < number ; i++){
			squares = i * i;
			cubes = i * i * i;
			IBIO.output("number: "+number+" squares: "+squares+" cubes: "+cubes);
		}
	}
}
