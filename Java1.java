import java.util.Scanner;

public class Java1
{
	public static void main(String[] args){
		double x = 212349;
		int start = IBIO.inputInt("hello input: ");
		IBIO.output("THE NUMBA was:" +x);
		System.out.println("The number was = " + x);
		System.out.println("input number is: "+ start);
		start = IBIO.inputInt("hello this is fun: ");
		System.out.println("Look this is input lmfao"+ start);
		IBIO.output("look at this"+start);
		System.out.println("Lets get serious...");
		Thread.sleep(1);
		int start = IBIO.inputInt("Enter starting number");
		Thread.sleep(1);
		int increment = IBIO.inputInt("Enter increment number");
		Thread.sleep(1);
		int fun = IBIO.inputInt("Enter a fun number");
		Thread.sleep(1);
		IBIO.output("starting number: " + start);
		IBIO.output("starting increment: " + increment);
		IBIO.output("starting fun: " + fun);
		Thread.sleep(100);
		int x = start;
		for(int counter=0; counter < fun; counter++){
			IBIO.output(x);
			x = x + increment;
		}
		int counter = 0;
		while (counter < fun)
		{
			IBIO.output(x);
			x = x + increment;
			counter++; //counter = counter + 1
		}
		//while True{
		//	if 
		//}
		
	}
}

