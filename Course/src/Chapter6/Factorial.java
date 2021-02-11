package Chapter6;

public class Factorial {
	public long factorial(int n) {
		if(n==0) return 1;
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(new Factorial().factorial(4));
	}

}


