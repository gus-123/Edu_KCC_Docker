package kosa.board;

import java.util.Scanner;
//5.29
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager(); // Manager class 생성

		while (true) {
			System.out.println("1. 추가 2. 전체 출력 3. 수정 4. 삭제 5. 종료");
			System.out.println("메뉴 입력: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				m.insert();
				break;
			case "2":
				m.List();
				break;
			case "3":
				m.update();
				break;
			case "4":
				m.delete();
				break;
			case "5":
				System.out.println("종료");
				return;
			}
		}
	}

}
