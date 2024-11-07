import java.math.RoundingMode;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test2 {
	static BigInteger fib(long n) { // updated
		if (n <= 1) {
			return BigInteger.valueOf(n);
		} else {
			BigInteger a = BigInteger.ZERO, b = BigInteger.ONE, c = BigInteger.ZERO; // Using Big Integer for the formula to have unlimited recursion loops
			for (BigInteger i = BigInteger.valueOf(2); i.compareTo(BigInteger.valueOf(n)) <= 0; i = i.add(BigInteger.ONE)) {
				c = a.add(b);
				a = b;
				b = c;
			}
			return b;
		}
	}
	
	public static void main(String[] args) { 
		Runtime.getRuntime().addShutdownHook(new Thread() { // Originally from stackoverflow... if this script is killed on the spot, output these accordingly 
			public void run() {
				System.out.println("\nProgram terminated.");
			}
		});
		
		System.out.println("Zhu Jinyang");
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("Calculate up to term (n)? ");
				String input = scanner.nextLine().trim();
				
				if (input.trim().isEmpty()) { // Done to report empty input
					System.out.println("Invalid input, try again.\n");
					continue;
				}
				
				long x = Long.parseLong(input);
				
				if (x < 0) {
					System.out.println("Error– enter a positive number.\n");
					continue;
				} else if (x == 0) {
					break;
				}
				
				BigInteger total = BigInteger.ZERO;
				BigInteger d = fib(x);
				
				if (x > 0 && x <= 20) {
					for (long i = 0; i <= x; i++) {
						BigInteger g = fib(i);
						System.out.print(g);
						total = total.add(g);
						if (i < x) {
							System.out.print("; ");
						}
					}
					
					BigDecimal average = new BigDecimal(total).divide(BigDecimal.valueOf(x), 50, RoundingMode.FLOOR);
					System.out.println();
					System.out.println("Average = " + average);
				} 
				else if (x > 20) {
//					System.out.printf("Term %d: %s\n", x, d);
					int counter = d.toString().length();
					System.out.printf("Term %d: %s\n has %d digits\n", x, d, counter);
					for (long i = 0; i <= x; i++) {
						total = total.add(fib(i));
					}  
					BigDecimal average = new BigDecimal(total).divide(BigDecimal.valueOf(x), 50, RoundingMode.FLOOR);
					System.out.println("Average = " + average);
//					System.out.printf("%s has %d digits\n", d, counter);
				}
			} 
			catch (NumberFormatException e) {
				System.out.println("Invalid input, please enter a valid integer.");
			} 
			catch (Exception e) {
				System.out.println("An error occurred. Error Code: " + e.getMessage());
			}
			finally {
				System.out.println("fun :D");
			}
		}
		scanner.close();
	}
}
