package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {
	
	public static void main(String[] args) {
		//키보드로 데이터 입력 (api => scanner)
		/* 외부 패키지를 사용하기 위해서는 import를 해주어야한다. */
		Scanner sc = new Scanner(System.in); 
		
		/*System.out.print("정수 입력 : ");
		
		int num = Integer.parseInt(sc.nextLine()); // 2번 방법
		
		//int num = sc.nextInt();  // 10 + enter
		
		//sc.nextLine(); // 1번 방법
		
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println(num);
		System.out.println(str);*/
		
		// int <==> char
		char ch = 'A';
		
		System.out.println((int)ch);  // => int를 넣으면 아스키코드로 나옴
		
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		String num2 = "100";
		int num3 = Integer.parseInt(num2);
		int result = num3 + 100;
		
		System.out.println(result);
		
		int num4 = 10;
		String num5  = String.valueOf(num4);
		String num6 = num4 + "";
		
		String str = 7 + "7" + 7;
		System.out.println(str);
	}

}
