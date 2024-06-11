package kosa.phone;

import kosa.stram.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

//5.29
// 전화 번호 관리 전반적인 기능 (객체 담기)
public class Manager {

    List<PhoneInfo> list = new ArrayList<PhoneInfo>();

    private int count;

    public Manager() {
        //arr = new PhoneInfo[10];
    }

    public void addPhoneInfo() {
        System.out.print("이름: ");
        String name = DataInput.sc.nextLine();
        System.out.print("전화번호: ");
        String phoneNo = DataInput.sc.nextLine();
        System.out.print("생년월일: ");
        String birth = DataInput.sc.nextLine();

        list.add(new PhoneInfo(name, phoneNo, birth));
    }

    public void listPhoneInfo() {
//        Iterator<PhoneInfo> it = list.iterator();
//
//        if (!list.isEmpty()) {
//            System.out.println("=== 연락처 목록 ===");
//            while (it.hasNext()) {
//                //1번
//               PhoneInfo info = it.next();
//                System.out.println("이름: " + info.getName());
//                System.out.println("전화번호: " + info.getPhonNo());
//                System.out.println("생년월일: " + info.getBirth());
//                System.out.println();
//                //2번
////                it.next().show();
//            }
//        } else {
//            System.out.println("등록된 연락처가 없습니다.");
//        }


        //Stream<PhoneInfo> stream = list.stream();
        if (!list.isEmpty()) {
            list.forEach(p-> {
                System.out.print(p.getName());
                System.out.print(p.getPhonNo());
                System.out.print(p.getBirth());
            });
        }
        else {
            System.out.println("등록된 연락처가 없습니다.");
        }
    }

    public void searchPhoneInfo() {
//        // 검색하고자하는 이름 1개의 PhoneInfo() 객체의 내용을 출력한다.
//        System.out.print("이름: ");
//        String name = DataInput.sc.nextLine();
//
//        // 검색 결과를 저장할 PhoneInfo 객체
//        PhoneInfo foundInfo = null;
//
//        // Iterator를 사용하여 목록 순회
//        Iterator<PhoneInfo> it = list.iterator();
//        while (it.hasNext()) {
//            PhoneInfo phoneInfo = it.next();
//            if (name.equals(phoneInfo.getName())) {
//                foundInfo = phoneInfo;
//                break; // 검색 종료
//            }
//        }
//
//        // 검색 결과 출력
//        if (foundInfo != null) {
//            System.out.println("연락처 정보:");
//            foundInfo.show();
//        } else {
//            System.out.println("해당 이름의 연락처를 찾을 수 없습니다.");
//        }

        // 입력한 name으로 시작 하는 값을 출력
        System.out.print("이름: ");
        String name = DataInput.sc.nextLine();

        list.stream().filter(p -> p.getName().startsWith(name)).forEach(p -> p.show());

    }


    public void updatePhoneInfo() {
//        System.out.print("이름: ");
//        String name = DataInput.sc.nextLine();
//
//        // 검색 결과를 저장할 PhoneInfo 객체
//        PhoneInfo foundInfo = null;
//
//        // Iterator를 사용하여 목록 순회
//        Iterator<PhoneInfo> it = list.iterator();
//        while (it.hasNext()) {
//            PhoneInfo phoneInfo = it.next();
//            if (name.equals(phoneInfo.getName())) {
//                foundInfo = phoneInfo;
//                break; // 검색 종료
//            }
//        }
//
//        // 검색 결과 처리
//        if (foundInfo != null) {
//            System.out.print("새로운 전화번호: ");
//            String newPhoneNo = DataInput.sc.nextLine();
//            foundInfo.setPhonNo(newPhoneNo);
//            System.out.println("연락처 정보가 업데이트되었습니다.");
//        } else {
//            System.out.println("해당 이름의 연락처를 찾을 수 없습니다.");
//        }
        System.out.println("이름 : ");
        String name = DataInput.sc.nextLine();

        System.out.println("새로운 전화 번호 :");
        String newPhoneNo = DataInput.sc.nextLine();

        list.stream().filter(p -> p.getName().equals(name)).forEach(p -> p.setPhonNo(newPhoneNo));
    }


    public void deletePhoneInfo() {
//        System.out.print("이름: ");
//        String name = DataInput.sc.nextLine();
//
//        // 검색 결과를 저장할 PhoneInfo 객체
//        PhoneInfo foundInfo = null;
//
//        // Iterator를 사용하여 목록 순회
//        Iterator<PhoneInfo> it = list.iterator();
//        while (it.hasNext()) {
//            PhoneInfo phoneInfo = it.next();
//            if (name.equals(phoneInfo.getName())) {
//                foundInfo = phoneInfo;
//                it.remove(); // 목록에서 직접 삭제
//                break; // 검색 종료
//            }
//        }
//
//        // 삭제 결과 처리
//        if (foundInfo != null) {
//            System.out.println("연락처 정보가 삭제되었습니다.");
//        } else {
//            System.out.println("해당 이름의 연락처를 찾을 수 없습니다.");
//        }
        System.out.println("이름 : ");
        String name = DataInput.sc.nextLine();

        list.stream().filter(p -> p.getName().equals(name)).forEach(p -> list.remove(p));  // PhoneInfo에 맞는 객체를 지우기
    }

    public void sortPhoneInfo() {
        Collections.sort(list);
    }

}
