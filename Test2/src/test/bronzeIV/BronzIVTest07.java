package test.bronzeIV;

import java.util.Scanner;

//11282
public class BronzIVTest07 {
//	문제
//	한글의 각 글자는 초성, 중성, 종성으로 이루어져 있고, 이 세 가지를 모아써서 한 글자를 나타낸다.
//
//	초성은 ㄱ, ㄲ, ㄴ, ㄷ, ㄸ, ㄹ, ㅁ, ㅂ, ㅃ, ㅅ, ㅆ, ㅇ, ㅈ, ㅉ, ㅊ, ㅋ, ㅌ, ㅍ, ㅎ로 총 19개가 있고, 
//	중성은 ㅏ, ㅐ, ㅑ, ㅒ, ㅓ, ㅔ, ㅕ , ㅖ, ㅗ, ㅘ, ㅙ, ㅚ, ㅛ, ㅜ, ㅝ, ㅞ, ㅟ, ㅠ, ㅡ, ㅢ, ㅣ로 총 21개, 
//	종성은 없음, ㄱ, ㄲ, ㄳ, ㄴ, ㄵ, ㄶ, ㄷ, ㄹ, ㄺ, ㄻ, ㄼ, ㄽ, ㄾ, ㄿ, ㅀ, ㅁ, ㅂ, ㅄ, ㅅ, ㅆ, ㅇ, ㅈ, ㅊ, ㅋ, ㅌ, ㅍ, ㅎ로 총 28개가 있다.
//
//	첫 번째 글자는 초성에서 ㄱ, 중성에서 ㅏ, 종성에서 없음을 합친 "가"가 되고, 두 번째 글자는 초성에서 ㄱ, 중성에서 ㅏ, 종성에서 ㄱ을 합친 "각"이 된다. 
//	마지막 글자는 초성에서 ㅎ, 중성에서 ㅣ, 종성에서 ㅎ를 합친 "힣"이 된다.
//
//	초성과 중성, 그리고 종성을 합쳐서 만들 수 있는 글자의 개수는 총 19*21*28 = 11,172개가 된다.
//
//	입력으로 N이 주어졌을 때, N번째 글자를 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 N(1 ≤ N ≤ 11,172)이 주어진다.
//
//	출력
//	첫째 줄에 N번째 글자를 출력한다. 문자열의 인코딩은 UTF-8을 사용해야 한다.
	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		 int N = s.nextInt();
		 
		/*
		 * to find first figure you need to know that order number point 21*28=588, and
		 * divide integer N by 588, then the quotient is the first figure's order number
		 */
		
		/* in order to find the middle figure, divide the former calculation's remainder by 28, 
		 * then the quotient is the middle figure's order number
		 * then the remainder is the last figure's order number
		 */	
		
		// get unicode '가' and get unicode '힣' by character code
		// (44031 + 1 = '가', 44031 + 11172 = 55203 '힣')
		
		// set up charList to add chars between '가' and '힣' 
		// get a Korean character in the number that pointed by integer N 
		
		int charCode = 44031 + N;
		char a = (char)charCode;
		System.out.println(a);
		s.close();
	}

}
