package test.bronzeIII.meChoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2562
public class BronzIIITest03 {
	
//	문제
//	9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//
//	예를 들어, 서로 다른 9개의 자연수
//
//	3, 29, 38, 12, 57, 74, 40, 85, 61
//
//	이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
//
//	입력
//	첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
//
//	출력
//	첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// get integer 9 parameter
		List<Integer> lis = new ArrayList<Integer>();
		
		// make ArrayList to save 9 different natural numbers
		for(int i = 0; i<9 ; i++) {
			lis.add(s.nextInt());
		}
		// make parameters to save the max value and its order number
		Integer maxVal = lis.get(0); int orderNum = 0;
		// use loop statement to find out the biggest value in the list and its order number
		for(int i = 0 ; i < lis.size() ; i++) {
			if(maxVal < lis.get(i)) {
				maxVal = lis.get(i); orderNum = i+1;
			} else {
				if(i == 0) {
					orderNum = 1;
				}
				
			}
		}
		System.out.println(maxVal);
		System.out.println(orderNum);
		s.close();
	}
}
