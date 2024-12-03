public class JavaC5E3{
	public static void main(String arg[]){
		double	term = 1;
		double	sum = 0;
		double	sign=1;
		for (int i = 1; i < 10000; i++){
			sum = sum + (1/(sign*term));
			term = term + 2;
			sign = sign * -1;
		}
		sum = sum * 4;
		System.out.print(sum);
	}
}
