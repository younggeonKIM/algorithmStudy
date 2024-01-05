package test.bronzeII;

import java.math.BigInteger;
import java.util.Scanner;

// 1550번
public class BronzIITest03 {

	/*	문제
		16진수 수를 입력받아서 10진수로 출력하는 프로그램을 작성하시오.	
		입력
		첫째 줄에 16진수 수가 주어진다. 이 수의 최대 길이는 6글자이다. 16진수 수는 0~9와 A~F로 이루어져 있고, 
		A~F는 10~15를 뜻한다. 또, 이 수는 음이 아닌 정수이다.	
		출력
		첫째 줄에 입력으로 주어진 16진수 수를 10진수로 변환해 출력한다.*/
	
	public static void main(String[] args) {
		
		/*Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String manipulInput = input.toUpperCase();
		char[] hexArr = manipulInput.toCharArray();
		char[] decArr = new char[hexArr.length];
		for (int i = 0 ; i < hexArr.length ; i++) {
			
			if('A' == hexArr[i] ) {
				
				decArr [i] = '1';
				decArr [i+1] = '0';
				
			}
		}
		System.out.println(hexArr);*/
		
		Scanner s = new Scanner(System.in);
		String input = s.next();
		BigInteger hexademical_num = new BigInteger(input, 16);
		System.out.println(hexademical_num);
		s.close();
	}

}
