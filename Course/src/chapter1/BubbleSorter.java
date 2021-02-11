package chapter1;

import java.util.Arrays;

public class BubbleSorter {
	public static void main(String args[]) {
		int[] data = {9,3,10,5,1,4};
		new BubbleSorter().sort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public void sort(int[] data) {
		for(int i=0;i<data.length-1;i++) {
			for(int j=0;j<data.length-1-i;j++) {
				if(data[j] > data[j+1]) {
					int temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
				}
			}
		}
		
	}

}
