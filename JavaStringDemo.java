public class JavaStringDemo{
	public static void main(String args[]){
		System.out.println("uwu");
		String m = new String("Jake");
		System.out.println(m);
		String q = "lmao this is boring";
		System.out.println(m==q);
		System.out.println(m.equals(q));
		q.substring(2,4);
		q.equals(m);
		q.compareTo(m);
		q.length();
		System.out.println(q.substring(2,q.length()));
		System.out.println(q.substring(1,4)); //careful its ranked as 0,1,2,3
		System.out.println(q.substring(q.length()-2));
		System.out.println("Java is boring right");
	}
}
