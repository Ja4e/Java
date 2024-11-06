public class Test {
	static long fib(long n) {
		if (n <= 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	public static void main(String[] args) {
		System.out.println("Zhu Jinyang");
		while (true) {
			// try {
				long total = 0;
				long counter = 0;
				long x = IBIO.inputInt("Calculate up to term (n)? ");
				long d = fib(x);
				double f = 0;
				if (x < 0) {
					System.out.println("Error– enter a positive number.\n");
				} 
				else if (x == 0) {
					break;
				}
				if (x > 0 && x <= 20) {
					for (long i = 0; i <= x; i++) {
						long g = fib(i);
						System.out.print(g);
						total += g;
						if (i < x) {
							System.out.print("; ");
						}
					}
					f = (double) total / (double) x;
					System.out.println();
					System.out.println("Average = " + f);
				} 
				else if (x > 20) {
					// System.out.println(d);
					System.out.printf("Term %d: %d\n", x, d);
					for (long i = 0; i <= x; i++) {
						total += fib(i);
					}
					for (long i = d; i != 0; i /= 10) {
						counter++;  
					}
					f = (double) total / (double) x;
					System.out.println("Average = " + f);
					System.out.printf("%d has %d digits\n", d, counter);
				}
			// } catch (Exception e) {
			//     System.out.println("Invalid input, please enter a valid integer.\n");
			// }
		}
	}
}
