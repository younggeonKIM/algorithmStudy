package test.bronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 1252번
public class BronzIITest02 {

	/*	문제
		두 개의 이진수를 입력받아 이를 더하는 프로그램을 작성하시오.	
		입력
		첫째 줄에 두 개의 이진수가 빈 칸을 사이에 두고 주어진다. 각 이진수는 1 또는 0으로만 이루어져 있으며, 0으로 시작할 수도 있다. 
		또한 각 이진수의 길이는 80을 넘지 않는다.	
		출력
		첫째 줄에 이진수 덧셈 결과를 출력한다. 결과가 0인 경우를 제외하고는 출력되는 이진수는 항상 1로 시작해야 한다.
	*/
	public static void main(String[] args) throws IOException{
		/*
		Scanner sc = new Scanner(System.in);
		while (true) {
		String[] arr = sc.nextLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = a + b;
		String res = Integer.toString(c);
		char[] charArr= res.toCharArray();
		char[] newCharArr = new char[80];
		for(int i = 0 ; i < charArr.length; i++) {
			
			int imsi = (int)charArr[i];
			if(2 == imsi % 3 ) {
				
				
				Array.setChar(newCharArr, i, '1');
				Array.setChar(newCharArr, i+1, '0');
			} else if ( 1 == imsi %3) {
				
				if ( '2'== charArr[i+1]) {
					
					Array.setChar(newCharArr, i, '1');
					Array.setChar(newCharArr, i+1, '0');
				}
				if ('1' == newCharArr[i+1] ) {
					
					Array.setChar(newCharArr, i, '1');
					Array.setChar(newCharArr, i+1, '0');
				}
				if ('0' == newCharArr[i+1]) {
					
					Array.setChar(newCharArr, i+1, '1');
				}
			}
			
		}
		System.out.println(newCharArr);
		}
		
*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		
		//BigInteger 형변환 하면서 10진수로 바꿔준다.(A, 2)가 10진수로 바꾸는 방법
		BigInteger A_binary = new BigInteger(A, 2);
		BigInteger B_binary = new BigInteger(B, 2);
		
		//합 연산식(add)로 더해서 변수에 저장.
		BigInteger sum = A_binary.add(B_binary);
		
		//풀이방식에 적어둔 대로 2진수로 변환
		String sum_binary = sum.toString(2);
		
		System.out.println(sum_binary);
	}

}
