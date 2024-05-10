package searching;

public class BinarySearching {

	public static void quickSort(int[] arr, int std) {
		
	}
	
	public static void binSearch(int[] arr, int start, int end, int target) {
		
		int arrLeng = arr.length, middle = (start +end )/2;
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
		System.out.println("데이터 열의 요소들 : ");
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		
		binSearch(arr, 0, 29, targetNum);
	}

}
