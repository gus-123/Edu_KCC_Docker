package kosa.PhoneInfo;

// 기능 담당
public class Manager {

    // 필드
    private PhoneInfo manager[];  // 객체 넣기 위한 배열(데이터 타입은 만들 객체의 클래스이름을 따라가야 함.)
    private int count;

    // 생성자

    // default 생성자
    public Manager () {
        manager = new PhoneInfo[10];  // 배열의 크기 생성
    }

    // 메서드
    // 추가 (기본용)
//    public void addPhoneInfo() {
//        System.out.println("이름 :");
//        String name = DataInput.sc.nextLine();
//        System.out.println("번호 :");
//        String phoneNo = DataInput.sc.nextLine();
//          System.out.println("생일 :");
//        String birth = DataInput.sc.nextLine();

//        manager[count++] = new PhoneInfo(name, phoneNo, birth);
//    }

    // 추가 (전체용)  - 객체를 새로 만드는 경우 기능 추가 오버라이딩
    public void addPhoneInfo(String num) {
        // 공통 내용
        System.out.print("이름 :");
        String name = DataInput.sc.nextLine();
        System.out.print("번호 :");
        String phoneNo = DataInput.sc.nextLine();
        System.out.print("생일 :");
        String birth = DataInput.sc.nextLine();

        if ("1".equals(num)) {  // Company 객체 생성
            System.out.print("부서 :");
            String dept = DataInput.sc.nextLine();
            System.out.print("직위 :");
            String position = DataInput.sc.nextLine();

            manager[count++] = new Company(name, phoneNo, birth, dept, position);
        }
        else if ("2".equals(num)) { // Universe 객체 생성
            System.out.print("전공 :");
            String major = DataInput.sc.nextLine();
            System.out.print("학번 :");
            String year = DataInput.sc.nextLine();

            manager[count++] = new Universe(name, phoneNo, birth, major, year);
        }
        else {  // PhoneInfo 객체 생성
            manager[count++] = new PhoneInfo(name, phoneNo, birth);
        }
    }

    // 출력 (기본용)
//    public void listPhoneInfo () {
//        for (int i = 0; i < count; i++) {
//            manager[i].show();
//        }
//    }

    // 출력 (전체용)
    public void listPhoneInfo() {

        System.out.println("1. 회사, 2. 학교, 3. 기본, 4. 전체 출력");
        String num = DataInput.sc.nextLine();

        switch (num) {
            case "1" :  // Company 객체 일시
                for (int i = 0; i < count; i++){
                    if (manager[i] instanceof Company) {  
                        manager[i].show();
                    }
                }
                break;
            case "2" : // Universe 객체 일시
                for (int i = 0; i < count; i++){
                    if (manager[i] instanceof Universe) {
                        manager[i].show();
                    }
                }
                break;
            case "3" : // PhoneInfo 객체 일시
                for (int i = 0; i < count; i++){
                    if (!(manager[i] instanceof Company) && !(manager[i] instanceof Universe)) {
                        manager[i].show();
                    }
                }
                break;
            default :  // 전체 출력
                for (int i = 0; i < count; i++){
                    manager[i].show();
                }
                break;
        }
    }

    // 검색
    public void searchPhoneInfo () {
        System.out.println("검색할 이름");
        String searchName = DataInput.sc.nextLine();
        int idx = -1;

        for (int i =0; i < count; i++) {
            // 검색한 이름이 있으면 데이터를 출력
            if (manager[i].getName().equals(searchName)) {
                manager[i].show();
                idx = i;
            }
        }

        // 검색 결과 없을시
        if (idx == -1) {
            System.out.println("검색 결과가 없습니다.");
        }
        
    }

    // 수정
    public void updatePhoneInfo() {
        System.out.print("검색할 이름 :");
        String searchName = DataInput.sc.nextLine();
        int idx = -1;

        for (int i = 0; i < count; i++) {
            // 이름 검색 시 수정
            if (manager[i].getName().equals(searchName)) {
                System.out.println("번호 : ");
                String phoneNo = DataInput.sc.nextLine();
                System.out.println("생일 :");
                String birth = DataInput.sc.nextLine();

                // 변경 후 배열에 넣기
                manager[i].setPhoneNo(phoneNo);
                manager[i].setBirth(birth);
            }
        }

        // 검색 결과 없을시
        if (idx == -1) {
            System.out.println("검색 결과가 없습니다.");
        }

    }

    // 삭제
    public void deletePhoneInfo() {
        System.out.print("검색할 이름 :");
        String searchName = DataInput.sc.nextLine();
        int idx = -1;

        for (int i = 0; i < count; i++) {
            // 이름 검색 시 인덱스 저장
            if (manager[i].getName().equals(searchName)) {
                idx = i;
            }
        }

        // 검색 결과 없을시
        if (idx == -1) {
            System.out.println("검색 결과가 없습니다.");
        }
        else {  // 인덱스를 찾은 후 배열 앞으로 땡기기
            for (int i = idx; i < count; i++) {
                // 인덱스가 배열의 끝일 경우
                if (i == manager.length - 1) {
                    manager[i] = null;
                }
                // 인덱스가 배열의 끝이 아닌 경우
                else {
                    manager[i] = manager[i+1];
                }
            }
            count --; // 배열의 끝에를 삭제
        }
    }

}
