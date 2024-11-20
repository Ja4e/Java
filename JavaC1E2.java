public class JavaC1E2{
	public static void main(String[] args){
		int number_start = IBIO.inputInt("enter starting number: ");
		int number_steps = IBIO.inputInt("enter number of steps: ");
		int number_increment = IBIO.inputInt("enter increment: ");
		for (int i = 0; i < number_steps ; i++){
			IBIO.output(number_start);
			number_start = number_start + number_increment;
		}
	}
}
