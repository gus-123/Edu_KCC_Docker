package kosa.oop;

import java.util.Scanner;

public class PhonInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("전화번호부 :  이름, 전화번호, 생년월일, 한명의 전화내역을 출력");

		Scanner sc = new Scanner(System.in);
		int count = 1;

		while (count < 10) {
			System.out.println("1.추가 2.전체출력 3.검색 4.종료");
			System.out.print("메뉴 : ");
			int num = sc.nextInt();
			//int num = Integer.parseInt(sc.nextLine());
			
			PhonInfo phone = new PhonInfo();
			
			switch (num) {
			case 1: {				
				phone.addPhoneInfo(count);
				
				count++;
				
				System.out.println("전화번호가 등록 되었습니다.");
				break;
			}
			case 2: {
				phone.listPhoneInfo(count);
				break;
			}
			case 3: {
				phone.searchPheonInfo(count);
				break;
			}
			case 4: {
				System.out.println("종료");
				return;
			}
			default: {
				System.out.println("해당 하는 번호가 없습니다.");
				break;
			}
			}
		}
		System.out.printf("전화번호부 크기는 %d명으로 제한됩니다.", count);
	}

}
