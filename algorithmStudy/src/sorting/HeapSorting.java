package sorting;

public class HeapSorting {

	public static int[] heapSort(int[] arr, int root, int leaf) {
		
		int max = arr[root], temp;
		if(2*(root+1)<=leaf) {
			
			arr= heapSort(arr, root+1, leaf);
		}
		
		if(2*(root+1)+2 > leaf && 2*(root+1)+1 == leaf) {
			
			if(arr[2*(root+1)+1] > max) {
				
				max=arr[2*(root+1)+1];
				temp = arr[root+1];
				arr[root+1]=arr[2*(root+1)+1];
				arr[2*(root+1)+1]=temp;
			}
			
			
		}
		else {
			
			if(arr[2*(root+1)+1] > max) {
				
				max=arr[2*(root+1)+1];
				temp = arr[root+1];
				arr[root+1]=arr[2*(root+1)+1];
				arr[2*(root+1)+1]=temp;
			}
			else if(arr[2*(root+1)+2] > max) {
				
				max=arr[2*(root+1)+2];
				temp = arr[root+1];
				arr[root+1]=arr[2*(root+1)+2];
				arr[2*(root+1)+2]=temp;
			}
			
		}
		
		
		
		temp = arr[leaf];
		arr[leaf]=arr[root];
		arr[root]=temp;
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int [] arr = new int [30];
		for(int i = 0 ; i < arr.length; i ++) {
			
			arr[i] = (int)(Math.random()*100);
		}
		
		System.out.println("정렬 전 데이터 배열 : ");
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		heapSort(arr, 0, arr.length-1);
		System.out.println("정렬 후 데이터 배열 : ");
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

}
