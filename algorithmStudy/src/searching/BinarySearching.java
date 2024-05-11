package searching;

public class BinarySearching {

	public static void quickSort(int[] arr, int begin, int end) {
		
		if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);

	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
		/*
		if((end - begin) / 2  <1) {
			
			if(arr[begin] > arr[end]) {
				
				int temp = arr[begin];
				arr[begin]= arr[end];
				arr[end] =temp;
			}
			return;
		}
		int pivot = arr[end], arrIdx=begin-1;
		for(int i = 0 ; i < end ; i++) {
			
			if(pivot > arr[i]) {
				arrIdx++;
				
				int temp = arr[i];
				arr[i] = arr[arrIdx];
				arr[arrIdx] = temp;
				arrIdx++;
			}
		}
		int temp = arr[pivot];
		arr[pivot] = arr[arrIdx+1];
		arr[arrIdx+1]= temp;
		
		
		
			quickSort(arr, begin, arrIdx);
			quickSort(arr, arrIdx+2, end);
		*/
	}
	
	private static int partition(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;

	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;

	    return i+1;
	}
	
	public static void binSearch(int[] arr, int start, int end, int target) {
		
		int middle = (start +end )/2;
		if(arr[middle] < target) {
			
			binSearch(arr, middle +1, end, target);
		} else if (arr[middle] > target) {
			
			binSearch(arr, start, middle -1, target);
		} else {
			
			System.out.print("검색 값의 인덱스 위치는 : " + middle);
		}
	}
	
	public static void main(String[] args) {
		
		int targetNum = 7;
		
		int [] arr = new int [30];
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = (int)(Math.random()*25);
		}
		System.out.println("정렬 전 데이터 열 : ");
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println();
		System.out.println("정렬 후 데이터 열 : ");
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		binSearch(arr, 0, 29, targetNum);
	}
}
