package test.bronzeIII;

import java.util.Scanner;

//10992
public class BronzIIITest03 {
//	문제
//	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//
//	입력
//	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//	출력
//	첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// get integer N
		int N = s.nextInt();
		int cnt =1;
		int starBase =0;
		
		/*
		 * in order to make star pyramid, 
		 * you should focus the bottom of this star pyramid
		 */
		/* the base's number of stars increases 
		 * by 2 proportion to pyramid's floor number
		 */
			// the number of the bottom line stars is 2(N-1)
		
		// in this situation, integer N becomes the pyramid's floor
		// use N times loop statement
		for (int i = 0 ; i < N ; i++) {
			/*
			 * if(cnt==1) { for (int j = 0 ; j < N-1 ; j++) {
			 * 
			 * System.out.printf(" "); } for (starRoof = 0; starRoof < 1 ; starRoof++) {
			 * 
			 * System.out.println("*"); } cnt++; }
			 */
			if (N >= 2 && cnt != N) {
				
				if (N==2) {
					
					for (int lefDown = 0 ; lefDown < 1 ; lefDown++) {
						
						System.out.print(" ");
					}
					System.out.printf("*");
				} else {
					
					for (int lefDown = 0 ; lefDown < N - cnt ; lefDown++) {
						
						System.out.printf(" ");
					}
					System.out.printf("*");
					for (int blank =0 ; blank < (2*cnt)-3; blank++) {
						
						System.out.printf(" ");
					}
					if(cnt != 1) {
						
						System.out.printf("*");
					}
					System.out.println();
					cnt++;
					if(cnt == N ) {
						
						break;
					} else if(cnt < N ) {
						
						continue;
					}
				}
				
				if(cnt ==1) {
					
					System.out.println();
					cnt++;
				}
			}
			if(cnt == 2 && N != 2) {
				
				cnt++;
			}
			
		}
		if(cnt == N ) {
			
			for(starBase = 0 ; starBase < 2*N-1 ; starBase++) {
				
				System.out.printf("*");
			}
		}
		// first, you should build the pyramid's roof 
		// and then build the pyramid's base
		
		// top of pyramid's star is in the middle of the base stars
		s.close();
		
	}//main

}//class
