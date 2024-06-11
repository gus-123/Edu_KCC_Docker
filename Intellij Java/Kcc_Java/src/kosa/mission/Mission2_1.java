package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {
	
//	public static void hap (double arr[]) {
//		arr[3] = arr[0] + arr[1] + arr[2];
//	}
//	
//	public static void avg (double arr[]) {
//		arr[4] = arr[3] / 3;
//	}

	public static void average(int arr[]) {
		arr[4] = arr[3] /3;
	}
	
	public static void main(String[] args) {
		// 국어, 영어, 수학 => 키보드를 입력 받아 배열로 구현하자.
		// 총점, 평균 구하기 => 메서드 정의 구현
		
//		double[] arr = new double[5];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어 점수 : ");
//		double kor = sc.nextDouble();
//		
//		System.out.print("영어 점수 : ");
//		double eng = sc.nextDouble();
//		
//		System.out.print("수학 점수 : ");
//		double math = sc.nextDouble();
//		
//		arr[0] = kor;
//		arr[1] = eng;
//		arr[2] = math;
//		
//		hap(arr);
//		System.out.println("합계 : " + arr[3]);
//		avg(arr);
//		System.out.printf("평균 : %.2f", arr[4]);
		
		Scanner sc = new Scanner(System.in);
		String subject[] = {"국어","영어", "수학"};
		int arr[] = new int[5];
		
		for (int i = 0; i <3; i++) {
			System.out.println(subject[i] + "입력 :");
			arr[i] = sc.nextInt();
			arr[3] += arr[i];
			
		}
		average(arr);
		
		System.out.print("국어\t영어\t수학\t총점\t평균");
		for (int n : arr) {
			System.out.print(n + "\t");
		}
	}

}
