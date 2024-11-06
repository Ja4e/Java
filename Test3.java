import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class Test3 {
	// Calculate Fibonacci number using iterative method
	public static BigInteger fib(long n) {
		if (n <= 1) {
			return BigInteger.valueOf(n);
		} else {
			BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
			for (long i = 2; i <= n; i++) {
				BigInteger temp = a.add(b);
				a = b;
				b = temp;
			}
			return b; // This returns the nth Fibonacci number
		}
	}

	static class FibonacciTask extends RecursiveTask<List<BigInteger>> {
		private final long start;
		private final long end;

		public FibonacciTask(long start, long end) {
			this.start = start;
			this.end = end;
		}

		@Override
		protected List<BigInteger> compute() {
			List<BigInteger> results = new ArrayList<>();
			if (end - start <= 10) { // If the range is small, compute directly
				for (long i = start; i <= end; i++) {
					results.add(Test3.fib(i));
				}
			} else {
				long mid = (start + end) / 2;
				FibonacciTask leftTask = new FibonacciTask(start, mid);
				FibonacciTask rightTask = new FibonacciTask(mid + 1, end);
				
				leftTask.fork(); // Process left task asynchronously
				results.addAll(rightTask.compute()); // Compute right task synchronously
				results.addAll(leftTask.join()); // Wait for left task to complete
			}
			return results;
		}
	}
	
	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("\nProgram terminated.")));

		System.out.println("Zhu Jinyang");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Calculate up to term (n)? ");
				String input = scanner.nextLine().trim();

				if (input.trim().isEmpty()) {
					System.out.println("Invalid input, try again.\n");
					continue;
				}

				long x = Long.parseLong(input);

				if (x < 0) {
					System.out.println("Error – enter a positive number.\n");
					continue;
				} else if (x == 0) {
					break; // Exit the loop if input is 0
				}

				BigInteger total = BigInteger.ZERO;
				List<BigInteger> results = new ArrayList<>();

				if (x > 0 && x <= 20) {
					for (long i = 0; i <= x; i++) {
						BigInteger g = fib(i);
						System.out.print(g);
						total = total.add(g);
						results.add(g);
						if (i < x) {
							System.out.print("; ");
						}
					}
					// Average calculation using x as double
					double average = total.doubleValue() / (x + 1);
					System.out.println();
					System.out.printf("Average = %.2f\n", average);
				} else if (x > 20) {
					System.out.printf("Calculating Fibonacci up to term %d...\n", x);

					ForkJoinPool pool = new ForkJoinPool();
					FibonacciTask task = new FibonacciTask(0, x);
					results = pool.invoke(task); // Start the computation

					for (BigInteger result : results) {
						total = total.add(result);
					}

					// Average calculation using x as double
					double average = total.doubleValue() / (x + 1);
					System.out.printf("Average = %.2f\n", average);
					
					// Output the last Fibonacci number and count its digits
					if (!results.isEmpty()) {
						BigInteger lastFibonacci = results.get(results.size() - 1); // Ensure we are getting the last computed Fibonacci number
						System.out.printf("The last Fibonacci term calculated (%d) is %s.\n", x, lastFibonacci);
						System.out.printf("The last Fibonacci term calculated (%d) has %d digits.\n", x, lastFibonacci.toString().length());
					} else {
						System.out.println("No results calculated.");
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input, please enter a valid integer.");
			} catch (Exception e) {
				System.out.println("An error occurred. Error Code: " + e.getMessage());
			}
		}
		scanner.close();
	}

}
