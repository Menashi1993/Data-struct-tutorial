package Chapter3;

import java.util.Arrays;

//import chapter1.InsertionSorter;

public class insertionSortWithGenerics<T>{
	
	public void sort(Comparable<T>[] Objects) {
		for(int i=0; i< Objects.length;i++) {
			Comparable<T> curr = Objects[i];
			int j = i-1;
			
			while(j >= 0 && Objects[j].compareTo((T)curr) > 0) {
				Objects[j+1] = Objects[j];
				j--;
			}
			
			Objects[j+1] = curr;
				
		}
	}
	
	
public static void main(String[] args) {
		
		Circle[] circles = new Circle[]{new Circle(12),new Circle(4),new Circle(2), new Circle(19),new Circle(6)};
		//new InsertionSorter().sort(data);
		//System.out.println(Arrays.toString(data));
		
		insertionSortWithGenerics<Circle> sorter = new insertionSortWithGenerics<Circle>();
		sorter.sort(circles);
		for(int i =0; i< circles.length;i++)
		System.out.println(circles[i]);
	}



	
}
