package test.bronzeIV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1264
public class BronzIVTest02 {
//	문제
//	영문 문장을 입력받아 모음의 개수를 세는 프로그램을 작성하시오. 모음은 'a', 'e', 'i', 'o', 'u'이며 대문자 또는 소문자이다.
//
//	입력
//	입력은 여러 개의 테스트 케이스로 이루어져 있으며, 각 줄마다 영어 대소문자, ',', '.', '!', '?', 공백으로 이루어진 문장이 주어진다. 각 줄은 최대 255글자로 이루어져 있다.
//
//	입력의 끝에는 한 줄에 '#' 한 글자만이 주어진다.
//
//	출력
//	각 줄마다 모음의 개수를 세서 출력한다.
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//get a string and set its line number
		String str = "";
		String vowel ="aeiouAEIOU";
		char[] vowelArr = vowel.toCharArray();
		char[] strArr = null;
		
		List<Integer> vowelNumList = new ArrayList<Integer>();
		Integer vowelNum = 0;
		
		
		for(int i = 1 ; i > 0 ; i++) {
			str = s.nextLine();
			strArr = str.toCharArray();
			
			
			if(strArr[0]=='#') {
				
				
				break;
			}
			
			for(int m =0; m < strArr.length ; m++) {
				
				for(int n = 0 ; n < vowelArr.length; n++) {
					if(strArr[m]==vowelArr[n]) {
						vowelNum++;
						
					}
					
				}
				
			}
			vowelNumList.add(vowelNum);
			strArr = null;
			vowelNum = 0;
			
		}
		for (int o =0; o<vowelNumList.size(); o++) {
			System.out.print(vowelNumList.get(o));
			System.out.println();
		}
		
		//when you meet a # in loop statement, ends loop statement
		//count vowels in respective lines(Object)
		//print counts
		s.close();
	}

}
