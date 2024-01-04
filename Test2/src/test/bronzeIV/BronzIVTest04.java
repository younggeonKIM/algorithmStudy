package test.bronzeIV;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//15726
public class BronzIVTest04 {
//	문제
//	다음과 같이 세 수가 연속해서 주어졌을 때 한 번의 곱셈 기호와 한 번의 나눗셈 기호를 이용하여 만든 식 중 가장 큰 값을 출력하는 프로그램을 작성하시오. (세 수의 순서는 변하지 않는다.)
//
//	32 ☐ 16 ☐ 8
//
//	입력
//	첫째 줄에 세 개 정수 A, B, C(1 ≤ A, B, C ≤ 1,000,000)가 주어진다. 답은 int범위를 벗어나지 않는다.
//
//	출력
//	나올 수 있는 가장 큰 값을 출력한다. 단, 소수점 아래는 버린다. 1e-9 이하의 오차로 인해 출력이 달라지는 입력은 주어지지 않는다.
//	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Use BigDecimal data type to round number when the value has decimal point
		// get 3 integers A, B, C
		BigDecimal A = s.nextBigDecimal();
		BigDecimal B = s.nextBigDecimal();
		BigDecimal C = s.nextBigDecimal();
		// divide with setting billions scale quotient
		BigDecimal multBefDiv = (A.multiply(B)).divide(C, 9, RoundingMode.DOWN);
		BigDecimal divBefMult = (A.divide(B, 9, RoundingMode.DOWN)).multiply(C);
		
		BigDecimal output = null;

		// calculate the results and compare with the results by which operator get the bigger value
		if(multBefDiv.compareTo(divBefMult) == -1 ) {
			output = divBefMult.setScale(0, RoundingMode.DOWN);
		} else if(multBefDiv.compareTo(divBefMult) == 1) {
			output = multBefDiv.setScale(0, RoundingMode.DOWN);
		} else {
			output = multBefDiv.setScale(0, RoundingMode.DOWN);
		};
//		System.out.println("The multBefDiv's value is " + multBefDiv + " and the divBefMult's value is " + divBefMult);
//		System.out.println("The calculation return value is " + multBefDiv.compareTo(divBefMult));
		
		System.out.println(output);
		// print the result
		s.close();
	}

}
