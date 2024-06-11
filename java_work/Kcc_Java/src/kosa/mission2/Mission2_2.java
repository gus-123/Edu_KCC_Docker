package kosa.mission2;

import java.util.Scanner;

public class Mission2_2 {

//	public static void count (int arr[]) {
//		int answer[] = new int[arr.length];
//		int count = 0;
//		
//		for (int i = 0; i < answer.length; i++) {
//			if (answer[i] < answer[i+1]) {
//				count++;
//			}
//		}
//		
//		
//		System.out.println(count);
//	}
//	
//	public static void main(String[] args) {
//		// 130 135 148 140 145 150 150 153
//
//		Scanner sc = new Scanner(System.in);
//		
//		int student = sc.nextInt();
//		int count = 0;
//		int arr[] = new int[student];
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("키 입력 : ");
//			int height = sc.nextInt();
//			
//			arr[i] = height;
//				
//		}
//		
//		System.out.println(count);
//		
//	}
	
	public static int solution(int arr[]) {
		int answer =1;
		int max = arr[0];
		for(int i =1; i <arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i <n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(arr));
	}
	

}
