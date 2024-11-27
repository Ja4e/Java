import java.util.Scanner;

public class JavaC4E3 {
	public static void main (String[] args) {
		do{
			try{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter a number ");
				int num = scanner.nextInt();
				while (num > 1000){
					System.out.println("Number too big");
					System.out.print("Enter a number within a range of 1000: ");
					num = scanner.nextInt();
				}
				int o = 0;
				int i=0, e=0;
				exit:
				for ( i =1;  i<=num ; i++){
					for ( e = 1; e<=num; e++){
						o = (i*i) + (e*e);
						if (o == num){ 
							//System.out.println(i +" " +e);
							break exit;
						}
					}
				}
				if (o == num){
					System.out.println(i + " " + e);
				}
				else{
					System.out.println("impossible");
				}
			}
			catch (Exception e){
				System.out.println("brother check your input");
			}
		}
		while (true);
	}
}
