public class JavaStringDemo{
	public static void main(String args[]){
		System.out.println("uwu");
		String m = new String("Jake");
		System.out.println(m);
		String q = "lmao this is boring";
		System.out.println(m==q);
		System.out.println(m.equals(q));
		String a = q.substring(2,4);
		boolean b = q.equals(m);
		int c = q.compareTo(m);
		long d = q.length();
		System.out.println(q.substring(2,q.length()));
		System.out.println(q.substring(1,4)); //careful its ranked as 0,1,2,3
		System.out.println(q.substring(q.length()-2));
		System.out.println("Java is boring right");
		System.out.println("b: " + b + ", c: " + c + ", d: " + d);
	}
}
