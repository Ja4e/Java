public class Test5{
	static long fib(long n) { // updated the formula for better one
//		if (n <= 1) {
//			return n;
//		}
//		else{
			long a = 0, b = 1, c = 0;
			for (long i = 2; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			return b;
//		}
	}
	public static void main(String[] args) {
		System.out.println("Zhu Jinyang");
		while (true) {
//			try{
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
//				}
//			catch (Exception e) {
//				System.out.println("Invalid input, please enter a valid integer.\n");
		}
	}
}

