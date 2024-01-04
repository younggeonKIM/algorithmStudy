package test.bronzeIV;

import java.util.Scanner;

//2439
public class BronzIVTest01 {
	
	//문제
	//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	//
	//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
	//
	//입력
	//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
	//
	//출력
	//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		// get integer N 
		int N = s.nextInt();
		// count the number for printing stars that increase their numbers
		int cnt = 1;
		
		for (int i = 1 ; i <= N ; i++) {
			for (int m = N-1 ; m>cnt-1 ; m-- ) {
				System.out.printf(" ");
			}
			for(int n = 1; n<=cnt ; n++) {
				System.out.printf("*");
			}
			System.out.println();
			cnt++;
		}
		
		// use loop statement
		// increase the number of stars and stars' rows by the size of integer N
		// push the stars to the right
		
		s.close();
	}

}
