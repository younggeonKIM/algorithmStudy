package test.bronzeIII.meChoice;

import java.util.Scanner;

//5565
public class BronzIIITest05 {
//	문제
//	새 학기를 맞아 상근이는 책을 10권 구입했다. 상근이는 의욕이 너무 앞서서 가격을 조사하지 않고 책을 구입했다. 이제 각 책의 가격을 알아보려고 한다.
//
//	하지만, 영수증에는 얼룩이 묻어있었고, 상근이는 책 10권 중 9권의 가격만 읽을 수 있었다.
//
//	책 10권의 총 가격과 가격을 읽을 수 있는 9권 가격이 주어졌을 때, 가격을 읽을 수 없는 책의 가격을 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 10권의 총 가격이 주어진다. 둘째 줄부터 9개 줄에는 가격을 읽을 수 있는 책 9권의 가격이 주어진다. 책의 가격은 10,000이하인 양의 정수이다.
//
//	출력
//	첫째 줄에 가격을 읽을 수 없는 책의 가격을 출력한다.
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		// get 1 integer parameter for sum of 10 books, and 9 integer parameter for book prices
		int SUM = s.nextInt(); int[] bookPric = new int[9];
		for(int i = 0 ; i<9 ; i++) {
			
			bookPric[i]=s.nextInt();
		}
		// declare integer parameter for inked 1 book price on receipt and for 9 books' sum
		int inkedPric = 0; int NineSUMS = 0;
		// compare SUM parameter with the 9 books' sum (the different value is inkedPric)
		for(int i = 0 ; i < bookPric.length ; i++) {
			
			NineSUMS += bookPric[i];
		}
		inkedPric = SUM - NineSUMS;
		// print book price that can't read
		System.out.println(inkedPric);
		s.close();
	}

}
