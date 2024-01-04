package test.bronzeV;

import java.util.Scanner;
//27433
public class BronzVTest04 {
	
//	문제
//	0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다.
//
//	출력
//	첫째 줄에 N!을 출력한다.
	
	public static void main(String[] args) {
		
		// get integer N
		Scanner s = new Scanner(System.in);
		String inpStr = s.nextLine();
		long N = Long.parseLong(inpStr);
		long output = 1;
		// use loop statement and loops' condition is set by N(limited by N)
		for (int i = 2 ; i <= N ; i++) {
			if(N==0 || N==1) {
				
				
			} else {
				output = output * i;
			}
			
		}
		// print output
		System.out.print(output);
		s.close();
	}

}
