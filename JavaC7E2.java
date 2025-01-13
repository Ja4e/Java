import java.util.Scanner;

public class JavaC7E2 {
	public static void main(String[] args){
		double xx = 1;
		for (int i = 0; i < 10; i++){
			xx = xx * 3.732 * 100;
			double dd = ((double)xx)/100;
			xx =  dd/ 100.0;
			String yy = "" + xx;
			int decimal = yy.indexOf('.');
			int spacesToAdd = 8 - decimal;
			for (int d = 10; d > 0; d--){
				System.out.print(" ");
			}
			System.out.print(yy+"\n");
		}
	}
}
