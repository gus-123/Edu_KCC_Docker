package kosa.phone;

import java.util.Scanner;
//5.29
public class Main {  // 메인 기능 구현

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();  // Manager class 생성

		while (true) {
			System.out.println("1.추가 2. 전체출력 3. 검색 4. 수정 5. 삭제 6. 종료");
			System.out.println("메뉴 입력: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhoneInfo();
				break;
			case "4":
				m.updatePhoneInfo();
				break;
			case "5":
				m.deletePhoneInfo();
				break;
			case "6":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

}
