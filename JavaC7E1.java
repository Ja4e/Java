import java.util.Scanner;

public class JavaC7E1 {
	static String pad(int n, int tab){
		String xx = "" + n;
		do
			xx = " " + xx;
		while (xx.length() < tab);
		return xx;
	}
	public static void main(String args[]){
		for (int i = 0; i < 20; i++){
			String xx = pad(i, 10)+pad(i*i, 10)+pad(i*i*i, 10);
			IBIO.output(xx);
		}
	}
}
