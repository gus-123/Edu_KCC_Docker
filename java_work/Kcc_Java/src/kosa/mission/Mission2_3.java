package kosa.mission;

import java.util.Scanner;

public class Mission2_3 { // 이거 2_9임

	public static int solution(int n, int arr[][]) {
		int answer = 0;
		int sum1 = 0;//가로
		int sum2 = 0;//세로

		// 가로, 세로 합 비교
		for (int i =0; i< n; i++) {
			sum1 = 0;
			sum2 = 0;
			for(int j =0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		// 대각선 합 비교
		sum1 = 0;
		sum2 = 0;
		
		for(int i = 0; i< n; i++) {
			sum1 += arr[i][i];  // 왼쪽 대각선
			sum2 += arr[i][n-1-i];  // 오른쪽 대각선
		}
		
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}
	
	public static void main(String[] args) {
		// 5
//		10 13 10 12 15
//		12 39 30 23 11
//		11 25 50 53 15
//		19 27 29 37 27
//		19 13 30 13 19
		
//		int[][] arr = {{10, 13, 10, 12, 15}, {12, 39, 30, 23, 11}, { 11, 25, 50, 53, 15}, {19,27, 29, 37, 27}, {19, 13, 30, 13, 19}};
//		int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0;
//		int[][] arr0 = new int[3][5];
//		
//		for (int i = 0; i <arr.length; i ++) {
//			for (int j = 0; j <arr[i].length; j ++) {
//				sum += arr[i][j];
//				sum1 += arr[j][i];
//				if (i == j) {
//					sum2 += arr[i][j];
//				}
//			}
//			System.out.print("가로 합 : " + sum);
//			System.out.println("세로 합 : " + sum1);
//			sum = 0;
//			sum1 = 0;
//		}
//		System.out.println("대각선 합 : " + sum2);
//		
//		int max = 0;
//		
//		if (sum > max) {
//			max = sum;
//			
//			System.out.println(sum);
//			
//			if (sum1 > sum) {
//				max = sum1;
//				
//				System.out.println(sum1);
//				
//				if (sum2 > sum1) {
//					max = sum2;
//					
//					System.out.println(sum2);
//				}
//			}
//		}
	
		// by. prod
		Scanner sc = new Scanner(System.in);
		// 배열 선언
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		
		for(int i = 0; i<n;i++) {
			for (int j = 0; j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solution(n,arr));
		
	}

}
