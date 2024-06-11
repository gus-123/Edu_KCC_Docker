package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// 메뉴를 선택해서 해당 메뉴를 명령문을 실행해 보자.
		// 1. 추가, 2. 출력, 3. 검색 4. 종료
		
		int num =0, bread = 0 ;
		
		while (true) {
			System.out.println("메뉴를 선택해주세요 : 1. 추가, 2. 출력, 3. 검색, 4. 종료");
			
			Scanner sc =new Scanner(System.in);
			
			System.out.print("메뉴 번호 입력 : ");
			num = sc.nextInt();
		
			switch (num) {
				case 1 :
					System.out.println("빵 추가");
					bread++;
					break;
				case 2 :
					System.out.println("빵의 갯수 : " + bread);
					break;
				case 3 :
					System.out.println("1. 소금빵, 2. 베이글, 3. 샌드위치");
					break;
				case 4 :
					System.out.println("메뉴 선택이 종료 됩니다.");
					return;
				default:
					break;
			}
		}
	}
	
}
