package kosa.mission2;

import java.util.Scanner;

public class Misson2_1 {

	public static int[] solution(int arr[]) {
		int answer[] = new int[arr.length];
		int count = 0;
		
		answer[count++] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i-1]) {
				answer[count++] =  arr[i];
			}
		}
		
		int answer2[] = new int[count];
//		for (int i = 0; i < count; i++) {
//			answer2[i] = answer[i];
//		}
		System.arraycopy(answer, 0, answer2, 0, count);  // 원본 배열, 어디서 부터, 어디다가 복사, 어디서부터, count 만큼
	
		return answer2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //6
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer[] = solution(arr);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(" " + answer[i]);
		}
		
//		System.out.print("몇개의 정수를 입력 받을 껀가요? : ");
//		int num = sc.nextInt();
//			
//		int[] arr = new int[num];
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(i + "번째 숫자 입력 :");
//			arr[i] = sc.nextInt();
//			
//			System.out.println("비교 숫자는 " + arr[0]);
//			
//			if (arr[0] < arr[i]) {
//				System.out.print(arr[i]);
//			}
//			else {
//				continue;
//			}
//			
//			System.out.println();
//		
//		}
		
	}

}
