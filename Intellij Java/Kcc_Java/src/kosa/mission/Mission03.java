package kosa.mission;

import java.util.Scanner;

public class Mission03 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//임의의 정수값에 대해서 전체 자리수 중 짝수, 홀수의 개수를 구하자.
//		// 5자리 ex) 12345
//		// 짝수의 개수 : 2개
//		// 홀수의 개수 : 3개
//		// 조건 연산자 , / , %
//		int counta = 0, countb = 0;
//
//		Scanner sc = new Scanner(System.in);
//
//		for (int i =1; i <6 ; i++) {
//			System.out.print("숫자를 입력하시오 : ");
//			int num = sc.nextInt();
//
//			if (num %2 == 0) {
//				System.out.println("짝수");
//				counta ++;
//			}else {
//				System.out.println("홀수");
//				countb ++;
//			}
//			System.out.printf("숫자의 몫은 %d 이고, 나머지는 %d 입니다.\n", num/2, num%2);
//		}
//
//		System.out.println("짝수의 갯수는 " + counta + "개 이고, " + "홀수의 갯수는 " + countb + "개 입니다.");
//	}

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //임의의 정수값에 대해서 전체 자리수 중 짝수, 홀수의 개수를 구하자.
        // 5자리 ex) 12345
        // 짝수의 개수 : 2개
        // 홀수의 개수 : 3개
        // 조건 연산자 , / , %
        Scanner sc = new Scanner(System.in);
        System.out.println("5자리 숫자 입력:");

        int num =sc.nextInt();//12345
        int even = 0;
        int odd = 0;

        even += (num/10000%2 == 0)? 1:0;
        even += (num/1000%10%2 == 0)? 1:0;
        even += (num/100%10%2 == 0)? 1:0;
        even += (num/10%10%2 == 0)? 1:0;
        even += (num%2 == 0)? 1:0;

        odd = 5-even;

        System.out.println("짝수의 개수: " + even);
        System.out.println("홀수의 개수: " + odd);

    }

}
