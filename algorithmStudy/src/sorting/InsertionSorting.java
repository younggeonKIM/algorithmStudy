package sorting;

public class InsertionSorting {

	public static void main(String[] args) {
		
		int [] arr = new int[30];
		int j, k;
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = (int)(Math.random()*100);
		}
		
		System.out.println("정렬 전 데이터 : ");
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i]+" ");
		}
		for(j = 1 ; j < arr.length ; j++) {
			
			int target = arr[j];
			
			k = j-1;
			
			while(k >= 0 && target < arr[k]) {
				
				arr[k+1]=arr[k];
				k--;
			}
			arr[k+1] = target;
		}
		System.out.println();
		System.out.println("정렬 후 데이터 (오름차순) : ");
		for(int i = 0 ; i < arr.length ; i++) {

			System.out.print(arr[i]+" ");
		}
	}

}
