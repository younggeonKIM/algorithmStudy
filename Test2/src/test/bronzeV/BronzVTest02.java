package test.bronzeV;

import java.math.BigInteger;
import java.util.Scanner;
//13277
public class BronzVTest02 {
	
//	문제
//	두 정수 A와 B가 주어졌을 때, 두 수의 곱을 출력하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 정수 A와 B가 주어진다. 두 정수는 0보다 크거나 같은 정수이며, 0을 제외한 정수는 0으로 시작하지 않으며, 
//	수의 앞에 불필요한 0이 있는 경우도 없다. 또한, 수의 길이는 300,000자리를 넘지 않는다.
//
//	출력
//	두 수의 곱을 출력한다.
	
	
	public static void main(String[] args) {
		//use loop statement (switch-case or while)
		Scanner s = new Scanner(System.in);
		//get input1, input2
		try {
			
			BigInteger output;
			BigInteger input1 = s.nextBigInteger();
			BigInteger input2 = s.nextBigInteger();
			
			// input1 >=0, input2 >=0
			output = input1.multiply(input2);
			
			System.out.println(output);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			s.close();
		}
		
		//input1 * input2
		
		
		
		// firFig != lastFig
		// firFig == 0, get rid of 0
		
		// output ---> char[300000] 
		
		
	}

}
