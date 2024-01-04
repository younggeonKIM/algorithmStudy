package test.bronzeIV;

import java.util.Scanner;

//10039
public class BronzIVTest05 {
//	문제
//	상현이가 가르치는 아이폰 앱 개발 수업의 수강생은 원섭, 세희, 상근, 숭, 강수이다.
//
//	어제 이 수업의 기말고사가 있었고, 상현이는 지금 학생들의 기말고사 시험지를 채점하고 있다. 기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다. 
//	하지만, 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다. 보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.
//
//	학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.
//
//	입력
//	입력은 총 5줄로 이루어져 있고, 원섭이의 점수, 세희의 점수, 상근이의 점수, 숭이의 점수, 강수의 점수가 순서대로 주어진다.
//
//	점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다. 
//
//	출력
//	첫째 줄에 학생 5명의 평균 점수를 출력한다.
	public static int finTestScoring (int mark) {
		if (mark < 40) {
			mark = 40;
		} else {
			
		}
		return mark;
	}
	public static int sum(int a, int b, int c, int d,int e) {
		int res = a + b + c + d + e ;
		return res;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// get 5 marks for each student (wonsub, sehui, sanggeun, sungi, gangsu)
		int wonSub = s.nextInt();
		int seHui = s.nextInt();
		int sangGeun = s.nextInt();
		int sungI = s.nextInt();
		int gangSu = s.nextInt();
		// if a student's mark is below 40, then the student's mark turns to be 40
		wonSub = finTestScoring(wonSub);
		seHui = finTestScoring(seHui);
		sangGeun = finTestScoring(sangGeun);
		sungI = finTestScoring(sungI);
		gangSu = finTestScoring(gangSu);
		// get average marks of 5 students' marks
		int aver = sum(wonSub, seHui, sangGeun, sungI, gangSu) / 5;
		System.out.println(aver);
		s.close();
	}

}