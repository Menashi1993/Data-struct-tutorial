package Chapter3;

public class Circle implements Comparable<Circle>{
	public double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public Circle() {
		this(1);
	}

	@Override
	public int compareTo(Circle other) {		
		if(this.radius > other.radius)
			return 1;
		else if(this.radius < other.radius)
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "The radius of the circle is :: " + this.radius;
	}
	
	
}
