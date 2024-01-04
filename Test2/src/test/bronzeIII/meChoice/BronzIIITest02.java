package test.bronzeIII.meChoice;

import java.util.Scanner;

//2446
public class BronzIIITest02 {
	
//	문제
//	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//
//	입력
//	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//	출력
//	첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// get integer N to print stars' row
		int N = s.nextInt();
		// count line number by declaring cnt parameter
		int cnt = 1;
		// set switching point that starts functions stars getting increasing
		boolean isSwitchingPoint = false;
		// use loop statement to print stars
		for (int i = 0; i < 2*N -1 ; i++) {
			if(cnt == N ) {
				
				isSwitchingPoint = true;
			}
			if(isSwitchingPoint ==false ) {
				
				for (int down = 1 ; down < cnt ; down++) {
					
					System.out.printf(" ");
				}
				for (int star = 2*N -1 ; star >= 2*cnt-1 ; star--) {
					
					System.out.printf("*");
				}
				System.out.println();
				cnt++;
			}
			
			if(isSwitchingPoint == true) {
				
				for ( int up = 1 ; up < cnt  ; up++ ) {
					
					System.out.printf(" ");
				}
				for ( int star = 0 ; star < 2*(N-cnt)+1 ; star ++) {
					
					System.out.printf("*");
				}
				System.out.println();
				cnt--;
			}
		}
		// when cnt == N, the number of spaces starts decreasing as cnt number increases 
		// when cnt == N, the number of stars starts increasing as cnt number increases
		s.close();
	}
}
