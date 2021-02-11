package chapter1;

import java.util.Arrays;

public class InsertionSorter {

	public static void main(String[] args) {
		
		int[] data = {10,2,8,6,7,3};
		new InsertionSorter().sort(data);
		System.out.println(Arrays.toString(data));
		
	}

	public void sort(int[] data) {
		for(int i=0; i< data.length;i++) {
			int curr = data[i];
			int j = i-1;
			
			while(j >= 0 && data[j] > curr) {
				data[j+1] = data[j];
				j--;
			}
			
			data[j+1] = curr;
				
		}
	}
}
