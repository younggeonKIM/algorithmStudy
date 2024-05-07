package sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int [] arr = new int [30];
		int j, k, temp;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = (int)(Math.random()*100);
		}
		
		System.out.println("정렬 전 데이터 : ");
		for(int i = 0 ; i < arr.length; i ++) {
			
			System.out.print(arr[i]+" ");
		}
		
		for(j = 0; j < arr.length -1 ; j++) {
			
			for ( k = 0 ; k < arr.length-1-j ; k++) {
				
				if(arr[k] > arr[k+1]) {
					
					temp = arr[k];
					arr[k]= arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("정렬 후 데이터 (오름차순) : ");
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

}
