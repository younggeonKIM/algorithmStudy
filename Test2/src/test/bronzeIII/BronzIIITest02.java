package test.bronzeIII;

import java.util.Scanner;

//2444
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
		// get integer N
		int N = s.nextInt();
		// make counter parameter
		int cnt = 0;
		
		// switch from increasing the number of stars into decreasing the number of stars
		boolean switchingIsStart = false;
		int star = 0;
		// use (2N-1) times loop statement
		for(int i = 0 ; i< 2*N-1 ; i++) {
			
			if(switchingIsStart == false) {
				
				cnt++;
				for (int down = N; down > cnt ; down--) {
					
					System.out.printf(" ");
				}
				for (star = 0 ; star < 2*cnt-1 ; star++) {
					
					System.out.printf("*");
				}
				System.out.println();
			}
			
			if(cnt == N) {
				
				switchingIsStart = true;
				cnt --;
				continue;
			} 
			if(switchingIsStart == true) {
				
				for(int up = 0; up< N-cnt ; up++) {
					
					System.out.printf(" ");
				}
				for (star = 2*cnt-1 ; star > 0;star--) {
					
					System.out.printf("*");
				}
				System.out.println();
				cnt--;
			}
		}
		s.close();
	}
}
