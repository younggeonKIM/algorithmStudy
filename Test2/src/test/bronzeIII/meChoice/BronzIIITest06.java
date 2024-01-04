package test.bronzeIII.meChoice;

import java.util.Scanner;

//3009
public class BronzIIITest06 {
//	문제
//	세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
//
//	입력
//	세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
//
//	출력
//	직사각형의 네 번째 점의 좌표를 출력한다.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// get 3 pairs of two integers (x1 y1 x2 y2 x3 y3)
		int x1 = s.nextInt(); int y1 = s.nextInt();
		int x2 = s.nextInt(); int y2 = s.nextInt();
		int x3 = s.nextInt(); int y3 = s.nextInt();
		// declare 1 pair of two integers (x4 y4)
		int x4; int y4;
		// if x1 is equal to x3, fix this formula x1 + x2 - x3
		// x4 = x1+x3 - x2
		if (x1 == x3) {
			
			x4 = x1 + x2 - x3;
		} else {
			
			x4 = x1 + x3 - x2;
		}
		
		// y4 = y1+y3 - y2
		if (y1 == y3) {
			
			y4 = y1 + y2 -y3;
		} else {
			
			y4 = y1 + y3 -y2;
		}
		// print x4, y4
		System.out.println(x4 + " " +y4);
		s.close();
	}
}
