import java.util.Scanner;

public class JavaC7E1 {
	public static void main(String[] args){
		double xx = 1;
		for (int i = 0; i < 10; i++){
			xx = xx * 3.732 * 100;
			int dd = (int)xx;
			dd = dd/100;
			System.out.print(dd);
		}
	}
}
