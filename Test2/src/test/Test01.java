package test;

import java.util.Scanner;

public class Test01 {
	
//	public static String word;
	
	
	public static void main(String[] args) {
		int wordLeng; int j;
		boolean isFelindrom = true;
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		//문자열 하나하나 짤라서 배열만들기
		//char[] inputC = input.toCharArray();
		//String[] inputC2 = input.split("");
		
		
		//영어 소문자인지 검사하기
		//String배열을 contains메서드 쓰거나 
		//Char배열을 아스키코드 검색해서 비교연산자로 첫문자만 검사하거나
		//정규표현식 사용할 수도 있음
		
		
		char[] inputC = input.toCharArray();
		char frontC = inputC[0];
		
		if(frontC >=97 && frontC <= 123) {
			
		} else {
			isFelindrom = false;
		}
		for(wordLeng = 0,  j=inputC.length-1 ; wordLeng< j ; wordLeng++, j--) {
			frontC=inputC[wordLeng];
			char backC=inputC[j];
			if(frontC != backC) {
				isFelindrom = false;
				break;
			}
		}
		
		
		if (isFelindrom == true) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		s.close();
	}
}
