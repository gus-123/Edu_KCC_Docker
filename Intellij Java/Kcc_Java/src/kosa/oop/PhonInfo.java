package kosa.oop;

import java.util.Scanner;

public class PhonInfo {

	//필드
	String name, phoneNo, birth;
	// 객체를 넣기 위한 배열
	static PhonInfo arr[] = new PhonInfo[10];

	// 생성자
	public PhonInfo() {  //default 생성자

	}

	public PhonInfo(String name, String phoneNo, String birth) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	// 전화번호부  추가 메서드
	public static void addPhoneInfo(int count) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("전화번호 :");
		String phonNo = sc.nextLine();
		System.out.print("생년월인 :");
		String birth = sc.nextLine();
		
		// 한명의 정보 객체를 배열에 넣어주는 코드
		arr[count] = new PhonInfo(name, phonNo, birth);
	}

	// 전화번호부 출력 메서드
	public static void listPhoneInfo(int count) {
		for (int i = 0; i<count; i++) {
			//PhonInfo 식별자 infomation에 arr[i]의 값을 꺼내옴.
			PhonInfo infomation = arr[i];
			if (infomation != null) { 
                System.out.printf("이름: %s\n", infomation.name);
                System.out.printf("전화번호: %s\n", infomation.phoneNo);
                System.out.printf("생년월일: %s\n", infomation.birth);
            }
		}
	}

	// 전화번호부 검색 메서드
	public static void searchPheonInfo(int count) {
		Scanner sc = new Scanner(System.in);

        System.out.print("검색할 이름: ");
        String searchName = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < count; i++) {
        	// imformation 생성자 생성
            PhonInfo infomation = arr[i];
            if (infomation != null && infomation.name.equals(searchName)) {
                System.out.printf("이름: %s\n", infomation.name);
                System.out.printf("전화번호: %s\n", infomation.phoneNo);
                System.out.printf("생년월일: %s\n", infomation.birth);
                found = true;
                break; 
            }
        }

        if (!found) {
            System.out.println("검색 결과 없음");
        }
	}
}
