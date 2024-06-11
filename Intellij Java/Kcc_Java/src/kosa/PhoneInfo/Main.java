package kosa.PhoneInfo;

// 메인 담당

public class Main {
    
    public static void main(String arg[]) {

        // 객체 생성
        Manager m = new Manager();

        while(true) {
            System.out.println("[ 원하는 기능의 번호를 입력해주세요 ! ]");
            System.out.println("1.추가 2. 전체출력 3. 검색 4. 수정, 5. 삭제 6. 종료");
            System.out.print("번호 :");
            String num = DataInput.sc.nextLine();
            
            switch (num) {
                case "1" :
                    System.out.println("1. 회사, 2. 학교, 3. 기본");
                    String check = DataInput.sc.nextLine();
                    m.addPhoneInfo(check);
                    break;
                case "2" :
                    m.listPhoneInfo();
                    break;
                case "3" :
                    m.searchPhoneInfo();
                    break;
                case "4" :
                    m.updatePhoneInfo();
                    break;
                case "5" :
                    m.deletePhoneInfo();
                    break;
                case "6" :
                    System.out.println("프로그램 종료");
                    return;
                default :
                    break;
            }
        }
        
    }
}
