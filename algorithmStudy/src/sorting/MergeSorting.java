package sorting;

import java.util.Arrays;

public class MergeSorting {

	public static int[] mergeArr(int[] arrA, int[] arrB) {
		
		int arrAIndex=0, arrBIndex=0, newArrIndex=0;
		int[] newArr = new int[arrA.length+arrB.length];
		
		
			
		while(arrAIndex != arrA.length && arrBIndex != arrB.length) {
			
			if(arrA[arrAIndex] < arrB[arrBIndex]) {
				
				newArr[newArrIndex] = arrA[arrAIndex];
				arrAIndex++;
				newArrIndex++;
			} else {
				
				newArr[newArrIndex] = arrB[arrBIndex];
				arrBIndex++;
				newArrIndex++;
			}
		}
		
		if(arrAIndex != arrA.length) {
			
			for(int i = newArrIndex ; i < newArr.length ; i++) {
				
				newArr[i] = arrA[arrAIndex];
				arrAIndex++;
			}
		} else {
			
			for(int i = newArrIndex ; i < newArr.length ; i++) {
				
				newArr[i] = arrB[arrBIndex];
				arrBIndex++;
			}
		}
		
		return newArr;
		
	}
	
	public static int[] insertionSort(int[] arr) {
		
		int j, k, targetNum;
		for(j = 1; j<arr.length;j++) {
			
			targetNum = arr[j];
			k = j-1;
			while(k >= 0 && targetNum < arr[k]) {
				
				arr[k+1] = arr[k];
				k--;
			}
			arr[k+1]=targetNum;
		}
		return arr;
	}
	
	public static void main(String[] args) {

		int[] arr = new int[30];
		int[][] newSplitedArr;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println("분할 전 2차원 배열 : ");
		
			
		for(int arrVal : arr) {
			
			System.out.print(arrVal+" ");
		}
		System.out.println();
		
		
		
		int N = arr.length, rowIndex=0, copyStartIndex=0;
		newSplitedArr=new int[5][6];
		while(N -6 >= 0) {
			
			newSplitedArr[rowIndex] = Arrays.copyOfRange(arr, copyStartIndex, copyStartIndex+6);
			rowIndex++;
			copyStartIndex+=6;
			N-=6;
		}
		
			
		System.out.println("분할 후 2차원 배열 : ");
		for(int[] arrRows : newSplitedArr) {
			
			for(int arrVal : arrRows) {
				
				System.out.print(arrVal+" ");
			}
			System.out.println();
		}
		
		// 분할한 배열을 삽입 정렬 알고리즘으로 정렬
		for(int[] arrRows : newSplitedArr) {
			
			rowIndex=0;
			
			newSplitedArr[rowIndex] = insertionSort(arrRows);
			
			rowIndex++;
		}
		
		// 병합하기
		int [] temp1 = mergeArr(newSplitedArr[0], newSplitedArr[1]);
		int [] temp2 = mergeArr(newSplitedArr[2], newSplitedArr[3]);
		int [] temp3 = mergeArr(temp1, temp2);
		arr= mergeArr(temp3, newSplitedArr[4]);
		
		System.out.println(arr);
	}
}
