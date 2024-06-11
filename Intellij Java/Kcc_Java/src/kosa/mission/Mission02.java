package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적 관리 구현
		// 국어, 영어, 수학 점수를 키보드로 부터 입력 받고
		// 총점과 평균을 출력하세요. (단 평균은 실수형)
		Scanner sc = new Scanner(System.in);

//		System.out.print("국어 점수를 입력하시오 : ");
//		double kor = sc.nextDouble();
//
//		System.out.print("영어 점수를 입력하시오 : ");
//		double eng = sc.nextDouble();
//
//		System.out.print("수학 점수를 입력하시오 : ");
//		double math = sc.nextDouble();
//
//		System.out.println();
//
//		double hap = kor + eng + math;
//		double avg = hap / 3;
//
//		System.out.println("국어 : " + kor);
//		System.out.println("영어 : " + eng);
//		System.out.println("수학 : " + math);
//
//		System.out.printf("총점 : %.1f \n", hap);
//		System.out.printf("평균 : %.1f", avg);

		int kor, eng, math;
		int total , avg;


		System.out.print("국어 : ");
		kor = sc.nextInt();

		System.out.print("영어: ");
		eng = sc.nextInt();

		System.out.print("수학 : ");
		math = sc.nextInt();

		total = kor + eng + math;
		avg = total / (int)3.0;

		System.out.println();
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

		// 학점 90 이상 => A학점
		// 학점 80 이상 => B학점
		// 학점 70 이상 => C학점
		// 학점 60 이상 => D학점
		// 학점 60 이하 => F학점


//		if (avg >= 90) {
//			System.out.println("위 학생은 A학점 입니다.");
//		}
//		else if(avg >= 80) {
//			System.out.println("위 학생은 B학점 입니다.");
//		}
//		else if(avg >= 70){
//			System.out.println("위 학생은 C학점 입니다.");
//		}
//		else if(avg >= 60) {
//			System.out.println("위 학생은 D학점 입니다.");
//		}
//		else {
//			System.out.println("위 학생은 F학점 입니다.");
//		}

		switch (avg%10) {
			case 90 :
				System.out.println("위 학생은 A학점 입니다.");
				break;
			case 80 :
				System.out.println("위 학생은 B학점 입니다.");
				break;
			case 70 :
				System.out.println("위 학생은 C학점 입니다.");
				break;
			case 60 :
				System.out.println("위 학생은 D학점 입니다.");
				break;
			default :
				System.out.println("위 학생은 F학점 입니다..");
				break;

		}





	}

}
