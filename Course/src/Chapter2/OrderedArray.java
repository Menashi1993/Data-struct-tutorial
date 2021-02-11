package Chapter2;

import java.util.Arrays;


public class OrderedArray {
	
	private Integer[] data;
	
	public OrderedArray(int size) {
		this.data = new Integer[size];
	}

	public OrderedArray() {
		this(100);
	}
	
	public int binarySearch(int item) {
		int maxIndex = size()-1;
		int minIndex = 0;
		int indexToLook = (int) Math.floor((maxIndex + minIndex)/2);
		
		while(data[indexToLook] != item && maxIndex > minIndex) {
			
			if(data[indexToLook] > item) {
				maxIndex = indexToLook - 1;
			}
			else{
				minIndex = indexToLook + 1;
			};
			
			indexToLook = (int) Math.floor((maxIndex + minIndex)/2);
		}
		
		if(data[indexToLook] == item) return indexToLook;
		return -1;
	}
	
	public int binarySearchRecursive(int item, int minIndex, int maxIndex) {
		if(minIndex == maxIndex) {
			if(data[minIndex] == item)
				return minIndex;
			return -1;
		}
		int indexToLook = (int) Math.floor((maxIndex + minIndex)/2);
		if(data[indexToLook] == item)
			return indexToLook;
		else if(data[indexToLook] > item)
			return binarySearchRecursive(item,minIndex,indexToLook - 1);
		else
			return binarySearchRecursive(item,indexToLook + 1,maxIndex);
		
	}
	
	public int insert(int item) {
		int i =0;
		while(i< data.length && data[i] != null) {
			if(data[i] > item)
				break;
			i++;
		}
		shiftElementsToRight(i);
		data[i] = item;
		return i;
	}
	
	public int delete(int item) {
		int i = binarySearch(item);
		if(i>=0)
			shiftElementsToLeft(i+1);
		return i;
	}
	
	private int size() {
		int i = 0;
		while(i < data.length && data[i] != null)
			i++;
		return i;
	}
	
	private void shiftElementsToRight(int startIndex) {
		for(int i = size()-1; i>= startIndex;i--) {
			data[i+1] = data[i];	
		}
	}
	
	private void shiftElementsToLeft(int startIndex) {
		int maxIndex = size()-1;
		for(int i = startIndex; i <= maxIndex;i++) {
			data[i-1] = data[i];		
		}
		data[maxIndex] = null;
	}
	
	@Override	
	public String toString() {
		return Arrays.deepToString(this.data);
	}
	
}
















