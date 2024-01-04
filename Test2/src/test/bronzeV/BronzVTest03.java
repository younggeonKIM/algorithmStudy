package test.bronzeV;

import java.util.Scanner;
//27323
public class BronzVTest03 {
	
//	입력
//		표준 입력에 다음과 같은 형태로 입력이 주어진다.
//
//		A
//		B
//	
//	출력
//		세로 길이가 A cm, 가로 길이가 B cm인 직사각형의 넓이를 cm2 단위로 구하고, 단위 (cm2)를 생략하여 출력한다.
//
//	제한
//		1 ≦ A ≦ 100.
//		1 ≦ B ≦ 100.
//		A, B 는 정수이다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		int ab = 0;
		if(a>100 || a<=0 || b>100 || b<=0) {
			System.out.println("a and b should be the number between 1 and 100");
		} else {
			ab = a*b;
			System.out.println(ab);
		}
		sc.close();
		
	}

}
