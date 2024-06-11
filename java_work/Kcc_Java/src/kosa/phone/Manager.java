package kosa.phone;

import java.util.Scanner;

//5.29
// 전화 번호 관리 전반적인 기능 (객체 담기)
public class Manager {
	// private PhoneInfo arr[] = new PhoneInfo[10]; // 1번 방식

	// 2번 방식
	private PhoneInfo arr[];
	private Scanner sc;
	private int count; // 필드는 초기화를 안해도 됨

	public Manager() {
		arr = new PhoneInfo[10];
		sc = new Scanner(System.in);
	}

	public void addPhoneInfo() { // 메서드는 static 안씀
		// 키보드로부터 이름, 전화번호, 생년월일을 입력 받아
		// PhoneInfo객체를 생성해서 배열에 추가하는 것
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();

//		PhoneInfo p = new PhoneInfo(name, phoneNo, birth);
//		arr[count++] = p; // 밑에 꺼를 줄인거

		arr[count++] = new PhoneInfo(name, phoneNo, birth);
	}

	public void listPhoneInfo() {
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

	public void searchPhoneInfo() {
		// 검색하고자하는 이름 1개의 PhoneInfo() 객체의 내용을 출력한다.
		System.out.print("이름 : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				arr[i].show();
				idx = i;
			}
		}

		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}

	}

	public void updatePhoneInfo() {
		// 이름을 입력 => 해당 phonInfo 추출 => 수정 전화번호 입력 => 전화번호 수정이 완료
//		System.out.println("수정할 이름을 입력하시오 :");
//		String SearchName = sc.nextLine();
//				
//		boolean check = false;
//		for (int i = 0; i<count; i++) {
//			if (SearchName.equals(arr[i].getName())) {
//				System.out.println("이름: " + arr[i].getName());
//				System.out.println("전화번호: ");
//				String phoneNo = sc.nextLine();
//				System.out.println("생년월일: ");
//				String birth = sc.nextLine();
//				
//				arr[i] = new PhoneInfo(arr[i].getName(), phoneNo, birth);
//			}
//			
//		}
//		
//		if(!check) {
//			System.out.println("해당 하는 이름이 없습니다.");
//		}
		System.out.print("이름 : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (arr[i].getName().equals(name)) {
				//내가 짠거
//				System.out.println("이름: " + arr[i].getName());
//				System.out.println("전화번호: ");
//				String phoneNo = sc.nextLine();
//				System.out.println("생년월일: ");
//				String birth = sc.nextLine();
//
//				arr[i] = new PhoneInfo(arr[i].getName(), phoneNo, birth);
				System.out.println("전화번호: ");
				String phoneNo = sc.nextLine();
				arr[i].setPhonNo(phoneNo);
				idx = i;
			}
		}

		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}
	}

	public void deletePhoneInfo() {
		// 이름 입력 => 대상 객체 검색 => 인덱스 찾기 => 해당 객체 삭제
		//내가 짠거
//		System.out.println("수정할 이름을 입력하시오 :");
//		String SearchName = sc.nextLine();
//
//		boolean check = false;
//		for (int i = 0; i < count; i++) {
//			if (SearchName.equals(arr[i].getName())) {
//				System.out.println("해당 객체의 인덱스 번호 : " + i);
//
//				arr[i] = arr[i + 1]; // 검색 번호 를 찾으면 i 그
//				
//				if (i == count) {
//					arr[count] = null;
//				}
//				else {
//					for (int j = i; j<count-1; j ++) {
//						if (j == count-1) {
//							arr[count-1] = null;
//						}
//						else {
//							arr[j] = arr[j+1];
//						}
//					}
//					count--;
//				}
//
//			}
//
//			check = true;
//			break;
//		}
//
//		if (!check) {
//			System.out.println("검색 결과 없음");
//		}
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		int idx = -1;
		
		for (int i = 0; i < count; i++) {
			if (arr[i].getName().equals(name)) {
				idx = i;
			}
		}
		
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}
		else {
			for (int i = idx; i <count; i++) {
				if (i == arr.length -1) {  // 배열의 마지막 번째
					arr[i] = null;
				} else {
					arr[i] = arr[i+1];
				}
			}
			count-- ;
		}
	}

}
