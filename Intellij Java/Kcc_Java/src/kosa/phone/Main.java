package kosa.phone;

import kosa.dataa.Person;

import java.util.Comparator;
import java.util.Scanner;

//5.29
public class Main {  // 메인 기능 구현

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Scanner sc = new Scanner(System.in);

        Manager m = new Manager();  // Manager class 생성
        Company company = new Company(); // Company class 생성
        Universe universe = new Universe();  // Universe class 생성

        //PhoneInfo[] arr = {
        //        new PhoneInfo(),
        //        new Company(),
        //        new Universe()
        //};

        while (true) {
            System.out.println("1.추가 2. 출력 3. 검색 4. 수정 5. 삭제 6. Sort 7. 저장 8. 불러오기 9. 종료");
            System.out.println("메뉴 입력: ");
            String menu = DataInput.sc.nextLine();

            switch (menu) {
                case "1":
                    System.out.println("1. 일반, 2. 회사, 3. 동창");
                    switch (DataInput.sc.nextLine()) {
                        case "1":
                            m.addPhoneInfo();
                            break;
                        case "2":
                            company.addCompany();
                            break;
                        case "3":
                            universe.addUniverse();
                            break;
                    }
                    break;
                case "2":
                    System.out.println("1. 일반, 2. 회사, 3. 동창, 4. 전체 출력");
                    switch (DataInput.sc.nextLine()) {
                        case "1":
                            m.listPhoneInfo();
                            break;
                        case "2":
                            company.listPhoneInfo();
                            break;
                        case "3":
                            universe.listPhoneInfo();
                            break;
                        case "4":
                            m.listPhoneInfo();
                            System.out.println("=======================");
                            company.listPhoneInfo();
                            System.out.println("=======================");
                            universe.listPhoneInfo();
                            break;
                    }
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
                    m.sortPhoneInfo();
                    break;
                case "7":
                    m.savePhoneInfo();
                    break;
                case "8":
                    m.loadPhoneInfo();
                    break;
                case "9":
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }

}
