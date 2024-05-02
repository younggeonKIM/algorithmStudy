package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSorting {

	public static List<int[]> stdDivideSort(int[] arr, int stdNum) {
		
		int[] newArr;
		List<int[]> dividedArraysList = new ArrayList<int[]>();
		
		int saveForArrIdx=0, saveBackArrIdx=stdNum+1, arrLength;
		arrLength = arr.length;
		
		
		newArr = new int[arrLength];
		for(int i = 0 ; i<arr.length; i++) {
			
			if(arr[i] <= arr[stdNum]) {
				
				newArr[saveForArrIdx] = arr[i];
				saveForArrIdx++;
			} 
			else {
				
				newArr[saveBackArrIdx]=arr[i];
				saveBackArrIdx++;
			}
		}
		int[] forArrays = Arrays.copyOfRange(newArr, 0, stdNum);
		int[] backArrays = Arrays.copyOfRange(newArr, stdNum, arrLength);
		dividedArraysList.add(forArrays);
		dividedArraysList.add(backArrays);
		return dividedArraysList;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[30];
		int stdNum, arrLeng=arr.length;
		
		for(int i = 0 ; i < arrLeng ; i++) {
			
			arr[i] = (int)(Math.random()*100);
		}
		
		stdNum = arr.length/2;
		
	}

}
