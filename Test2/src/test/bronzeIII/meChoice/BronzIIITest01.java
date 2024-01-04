package test.bronzeIII.meChoice;

import java.util.Scanner;

//1085
public class BronzIIITest01 {
//	문제
//	한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
//	
//	입력
//	첫째 줄에 x, y, w, h가 주어진다.
//	
//	출력
//	첫째 줄에 문제의 정답을 출력한다.
//	
//	제한
//	1 ≤ w, h ≤ 1,000
//	1 ≤ x ≤ w-1
//	1 ≤ y ≤ h-1
//	x, y, w, h는 정수
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// get 4 integer x y w h parameter
		int x = s.nextInt(); int y = s.nextInt();
		int w = s.nextInt(); int h = s.nextInt();
		int pointToY = 0; int pointToX = 0; int pointToRight = 0; int pointToTop = 0;
		// compare with each 4 different (x-0), (y-0), (w-x), (h-y) straight line's distance
		pointToY = x-0; pointToX = y-0; pointToRight = w-x; pointToTop = h-y;
		
		
		int pointToMin1 = Math.min(pointToX, pointToY); int pointToMin2 = Math.min(pointToRight, pointToTop);
		int min = Math.min(pointToMin1, pointToMin2);
		// print min(distance)
		System.out.println(min);
		s.close();
	}

}
