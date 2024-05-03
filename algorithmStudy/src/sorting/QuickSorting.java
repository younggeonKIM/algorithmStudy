package sorting;

public class QuickSorting {

	/*public static List<int[]> stdDivideSort(int[] arr, int stdNum) {
		
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
	
	public static int getStdNumIdx(int[] arr) {
		
		int stdNum = arr.length/2, stdNumidx;
		
	}*/
	
	public static void main(String[] args) {
		
		int[] arr = new int[30];
		int arrLeng=arr.length;
		
		for(int i = 0 ; i < arrLeng ; i++) {
			
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("정렬 전 데이터 배열 : ");
		for(int i = 0; i < arrLeng; i++) {
			
			System.out.print(arr[i]+" ");
		}
		quickSort(arr, 0, arrLeng-1);
		System.out.println();
		System.out.println("정렬 전 데이터 배열 : ");
		for(int i = 0; i < arrLeng; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

	public static void quickSort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);

	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
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
}
