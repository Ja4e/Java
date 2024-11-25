import java.util.Scanner;

public class JavaC4E2{
	public static void main(String[] args){
		do{
			try{
				while(true){
					Scanner scanner = new Scanner(System.in);//Couldve used IBIO.inputInt
					System.out.println("Press: [1] for Continue\n       [2] for quit");
					System.out.print("Input: ");
					int num = scanner.nextInt();
					if (num == 2){
						System.out.println("Quitting... adios");
						break;
					}
					long d = 0;
					System.out.print("enter first number: ");
					long a = scanner.nextInt();
					System.out.print("enter second number: ");
					long b = scanner.nextInt();
					System.out.print("enter third number: ");
					long c = scanner.nextInt();
					System.out.print("enter: ");
/*					int a = scanner.nextInt(); //if you use this code bruh you are taking the laziness to the next level already...
					for (int d = 0; d<=2; d++){
					}*/
					for (long i = 1; i<1000; i++){ //i++ wasnt supposed to be there... what else can i replace this????
						System.out.print(i + "*" + a + " + ");
						d=i*a;
						System.out.print((i+1) + "*" + b + " - ");
						d=a+(i*b);
						if (i==999){
							System.out.print((i+1) + "*" + c +" \n");
							d=a-(i*c);
							break;
						}
						System.out.print((i+1) + "*" + c + " + ");
						d=a-(i*c);
					}
					System.out.println("output: "+d);
				}
			}
			catch (Exception e){
				System.out.println("bro all you need is to type in a forking number into the fucking input space");
				System.out.println("Error {e}");
				continue;
			}
		}
		while (true);
	}
}
