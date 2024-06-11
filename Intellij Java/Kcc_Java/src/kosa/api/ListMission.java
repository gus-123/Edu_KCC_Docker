package kosa.api;

import java.util.*;

public class ListMission {
    // List자료구 조를 활용하여 키보드로 부터 문자열을 입력받아 처리하자.
    //1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력(for, Iterator), 4. 종료

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<String> list = new ArrayList<String>();
//
//        System.out.println("1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력, 4. 종료");
//
//        while (true) {
//            switch (sc.nextLine()) {
//                case "1":
//                    System.out.print("입력할 값 입력 : ");
//                    list.add(sc.nextLine());
//                    break;
//                case "2":
//                    System.out.print("삭제할 (값, 인덱스) 입력 : ");
//                    list.remove(sc.nextLine());
//                    break;
//                case "3":
//                    Collections.sort(list);
//                    System.out.println(list);
//                    break;
//                case "4":
//                    System.out.println("종료");
//                    return;
//                default:
//                    break;
//            }
//        }

        // 수정, 변경이 필요할때는 LinkeList가 좋음.
        List<String> list = new ArrayList<String>();
        while (true) {
            System.out.println("1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력, 4. 종료");
            System.out.println("메뉴: ");
            String menu = sc.nextLine();
            int idx = -1;

            switch (menu) {
                case "1":
                    System.out.println("추가 : ");
                    list.add(sc.nextLine());
                    break;
                case "2":
                    System.out.println("삭제:");
                    idx = list.indexOf(sc.nextLine());
                    if (idx != -1) {
                        list.remove(idx);
                    } else {
                        System.out.println("존재하지 않습니다.");
                    }
                    break;
                case "3":
                    // for 버전
//                    for (int i = 0; i < list.size(); i++) {
//                        System.out.println(list.get(i) + ",");
//                    }
                    // iterator
                    Iterator <String> iter = list.iterator();

                    while(iter.hasNext()) {
                        System.out.print(iter.next());
                    }
                    System.out.println();
                    break;
                case "4":
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }

}
