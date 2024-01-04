package test.bronzeIV;

import java.util.Scanner;

//10101
public class BronzIVTest06 {
	
//	문제
//	창영이는 삼각형의 종류를 잘 구분하지 못한다. 따라서 프로그램을 이용해 이를 외우려고 한다.
//
//	삼각형의 세 각을 입력받은 다음, 
//
//	세 각의 크기가 모두 60이면, Equilateral
//	세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
//	세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
//	세 각의 합이 180이 아닌 경우에는 Error
//	를 출력하는 프로그램을 작성하시오.
//
//	입력
//	총 3개의 줄에 걸쳐 삼각형의 각의 크기가 주어진다. 모든 정수는 0보다 크고, 180보다 작다.
//
//	출력
//	문제의 설명에 따라 Equilateral, Isosceles, Scalene, Error 중 하나를 출력한다.
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// get 3 internal angles and set up the String result parameter
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		String result = "Error";
		// use if statement to print error when the sum of the 3 internal angels of triangle is not 180 degrees
		if (a+b+c != 180) {
			
			// use else statement when the sum of the 3 internal angels of triangle is not 180 degrees
		} else {
			if(a==60 && b == 60) {
				result = "Equilateral";
			} else if (a==b || b==c || c==a) {
				result = "Isosceles";
			} else {
				result = "Scalene";
			}
		}
		
		// make print 'Equilateral' when each the 3 internal angle is 60 degrees
		// make print 'Isosceles' when the two of internal angles are the same
		// make print 'Scalene' when any of the 3 internal angles is not the same to each others
		
		// print the result parameter
		System.out.println(result);
		s.close();
	}
}
