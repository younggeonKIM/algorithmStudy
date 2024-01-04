package test.bronzeIII.meChoice;

import java.util.Scanner;

//2588
public class BronzIIITest04 {
	
//	문제
//	(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//					472	-----(1)
//				*	385	-----(2)
//				=======
//				   2360	-----(3)
//				  3776	-----(4)
//				 1416	-----(5)
//				=======
//				 181720	-----(6)
//
//	(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//
//	출력
//	첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// get two 3-digit natural numbers 
		int one = s.nextInt(); int two = s.nextInt();
		// in (3), there is (1) * 1 digit number of (2)
		int three = one* (two%10);
		// in (4), there is (1) * 2-digit number of (2)
		int four = one * (two/10 % 10);
		// in (5), there is (1) * 3-digit number of (2)
		int five = one * (two/100);
		// in (6), there is (3) + 10*(4) + 100*(5) 
		int six = three + 10*four + 100*five ;
		System.out.println(three + " " + four + " " + five + " " + six);
		s.close();
	}

}
