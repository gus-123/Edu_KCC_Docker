package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// 문자열 비교
		String a= "abc";  //  String은 데이터가 아니라 참조형 데이터이기 때문에 주소값이 들어가 있는데 위 와 같이 생성되면 내용이 같으므로 주소가 같음. 
		String b = "abc";
		
//		if(a==b) {  /*이건 주소 값 비교 */
//			System.out.println("같다");
//		}
//		else {
//			System.out.println("틀리다");
//		}
		
//		if (a.equals(b)) {  /* 이건 문자열 내용 비교 */
//			System.out.println("같다.");
//		}else {
//			System.out.println("틀리다.");
//		}
		
		
		// 두 정수와 연산자 문자열을 입력 받아
		// 사칙연산 결과를 출력하시오.
		// ex> 정수 1 : 10
		//        정수 2 : 20
		//        연산자 : +
		//결과 > 30
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		String key = "";
		
		System.out.print("정수1 : ");
		num1 = sc.nextInt();
		System.out.print("정수2 : ");
		num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("연산자 : ");
		key = sc.nextLine();
		
		
		if (key.equals("+")) {  
			System.out.printf("%d + %d = %d", num1, num2, num1+num2);
		}
		else if (key.equals("-")) {
			System.out.printf("%d - %d = %d", num1, num2, num1-num2);
		}
		else if (key.equals("*")) {
			System.out.printf("%d * %d = %d", num1, num2, num1*num2);
		}
		else if (key.equals("/")) {
			System.out.printf("%d / %d = %d", num1, num2, num1/num2);
		}
		else if (key.equals("%")) {
			System.out.printf("%d % %d = %d", num1, num2, num1%num2);
		}
		else {
			System.out.println("연산자가 아닙니다.");
		}
	}

}
