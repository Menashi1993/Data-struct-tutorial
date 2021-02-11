package chapter1;

public class GCDFinder {

	public int GCD(int a, int b) {
		if(b==0) return a;
		return (GCD(b,a%b));
	}
	
	public static void main(String[] args) {
		System.out.println(new GCDFinder().GCD(6,9));
	}
}





