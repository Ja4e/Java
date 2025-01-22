public class JavaMethodDemo{
	public static final double GST = 0.09; //This is a global value set for all functions and void/mains
	
	public static double calculateGST(double price, double gst){ //notice this... this is a function
		//Similar to double gst = 0.09;
		System.out.println("\nPrevailing GST = " + GST);
		System.out.println("\tparameter variable-in = " + price);
		price = price + (price * gst);
		System.out.println("\tparameter variable-post processing = " + price);
		return price;
	}
	
	public static void main (String[] args){
		double price = 100;
		System.out.println("Prevailing GST = " + GST);
		System.out.println("");
		
	}
	
}
