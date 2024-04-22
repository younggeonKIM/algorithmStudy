package sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		
		int[] arr = new int[30];
		int temp,k, l;
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println("정렬 전 데이터: ");
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		for(k = 0 ; k < arr.length ; k++) {
			
			for(l = k+1; l < arr.length ; l++) {
				
				if(arr[l] < arr[k]) {
					
					temp = arr[k];
					arr[k] = arr[l];
					arr[l] = temp;
				}
			}
			
		}
		System.out.println();
		System.out.println("정렬 후 데이터 (오름차순): ");
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	}

}
