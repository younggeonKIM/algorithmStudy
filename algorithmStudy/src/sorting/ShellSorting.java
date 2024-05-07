package sorting;

public class ShellSorting {

	/*public static void shellSort(int [] arr, int span) {
		
		int j;
		for(int i = 1 ; i<arr.length; i++) {
			
			int target=arr[i];
			j=i-1;
			
			while(j+span < arr.length && j > 0 && target < arr[j]) {
				
				arr[j+span] = arr[j];
				j--;
			}
			arr[j]=target;
		}
	}
	public static void main(String[] args) {
		
		int [] arr = new int[30];
		int N, span ;
		for(int i = 0 ; i < arr.length; i++) {
			
			arr[i]= (int)(Math.random()*100);
		}
		N=arr.length;
		span = N/2;
		System.out.println("정렬 전 데이터: ");
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
		while(span >= 1) {
			
			shellSort(arr, span);
			span /=2;
		}
		
		
		System.out.println();
		System.out.println("정렬 후 데이터: ");
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}*/
	
	
		
		private final static int[] gap = 
			{ 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937, 	
			8858, 19930, 44842, 100894, 227011, 510774,
			1149241, 2585792, 5818032, 13090572, 29453787, 
			66271020, 149109795, 335497038, 754868335, 1698453753};	// 갭을 담고있는 배열	
	 
		
		public static void shell_sort(int[] a) {
			shell_sort(a, a.length);
			
		}
	 
		// 맨 처음 gap을 참조 할 인덱스를 구하는 메소드
		private static int getGap(int length) {
			int index = 0;
			// 최소한 부분 배열의 원소가 2개씩은 비교 되도록 나눠준다.
			int len = (int)(length / 2.25);	
			while (gap[index] < len) {
				index++;
			}
			return index;
		}
		
	 	private static void shell_sort(int[] a, int size) {
			int gapIndex = getGap(size);
			
			// 갭이 1이 될 때까지 반복
			while(gapIndex >= 0) {
				int step = gap[gapIndex--];	// 현재 gap(step)
				
				
				/*
				 * --- 삽입 정렬 과정 ---
				 * 
				 * 각 부분리스트의 두 번째 원소의 인덱스 부터 순회한다.
				 * 예로들어 step이 3일 때 arr[0], arr[1], arr[2] 는 
				 * 이전 원소와 비교할 것이 없다.
				 * 그러므로 step부터 순회한다.   
				 */
				for(int i = step; i < size; i++) {
					
					/*
					 *  j는 target 원소가 되며 현재 원소(target) a[j]가 이전 원소 a[j - step]보다
					 *  작을 때 까지 반복한다.
					 */
					for (int j = i; j >= step && a[j] < a[j - step]; j -= step) {
						/*
						 *  현재(target) 원소의 인덱스(j)와 이전의 원소(j-step)의 인덱스에 있는
						 *  원소의 값을 교환한다.
						 */
						swap(a, j, j - step);
					}
				}
			}
		}
	 
		private static void swap(int[] a, int i, int j) {
			int swap = a[i];
			a[i] = a[j];
			a[j] = swap;
		}
		
		public static void main(String[] args) {
			
			int [] arr = new int[30];
			for(int i = 0 ; i < arr.length; i++) {
				
				arr[i]= (int)(Math.random()*100);
			}
			System.out.println("정렬 전 데이터: ");
			for(int i = 0 ; i < arr.length; i++) {
				
				System.out.print(arr[i]+" ");
			}
			shell_sort(arr, arr.length);
			
			System.out.println();
			System.out.println("정렬 후 데이터: ");
			for(int i = 0 ; i < arr.length; i++) {
				
				System.out.print(arr[i]+" ");
			}
		}
	}



