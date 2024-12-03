public class JavaC5E4{
	public static void main(String arg[]){
		double	denumer = 1;
		double	numer = 1;
		double	term = 1;
		double	incre = 1;
		double	sum = 0;
		for (int i = 1; i < 100; i++){
			term = numer/denumer;
			sum = sum + term;
			incre = incre + 2;
			numer = numer * i;
			denumer = denumer * incre;
		}
		sum = sum*2;
		System.out.println("Output: "+sum);
	}
}
