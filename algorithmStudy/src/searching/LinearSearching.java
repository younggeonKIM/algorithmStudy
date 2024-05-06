package searching;

public class LinearSearching {

	public static void main(String[] args) {
		
		int i=0, searchNum=7;
		int[] arr = new int[30];
		for(int j = 0 ; j < arr.length ; j++) {
			
			arr[j]=(int)(Math.random()*100);
		}

		System.out.println("배열의 데이터 요소 : ");
		for(int j = 0 ; j < arr.length ; j++) {
			
			System.out.print(arr[j]+" ");
		}
		
		// 배열의 1번째 요소부터 마지막 요소까지 1씩 증가시키면서 검색 숫자와 비교
		// 일치하면 반복 종료
		while(i<arr.length) {
			
			if(arr[i]==searchNum) {
				
				break;
			}
			i++;
		}
		System.out.println();
		System.out.println("검색 숫자의 배열 요소 위치는 ");
		// i가 배열 길이보다 작으면 검색 결과 존재
		// i가 배열 길이와 같으면 검색 결과 존재 안함
		System.out.println(i);
		
	}

}
