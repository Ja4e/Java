public class JavaC2E2{
	public static void main(String[] args){
		int enter = IBIO.inputInt("enter: ");
		if (enter % 2 == 1){
			System.out.println("The number is ODD ");
		}
		else if (enter % 2 == 0){
			System.out.println("The number is EVEN");
		}
	}
}
