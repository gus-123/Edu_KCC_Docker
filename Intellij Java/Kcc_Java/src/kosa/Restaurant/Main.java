package kosa.Restaurant;

public class Main {

    public static void main(String arg[]) {

        // 객체 생성
        Order o = new Order();

        while(true) {
            System.out.println("[ 원하는 기능의 번호를 입력해주세요 ! ]");
            System.out.println("1.추가 2. 전체출력 3. 검색 4. 수정, 5. 삭제 6. 총매출 합계 7. 종료");
            System.out.print("번호 :");
            String num = DataInput.sc.nextLine();

            switch (num) {
                case "1" :
                    System.out.println("1. 에피타이저, 2. 기본");
                    String check = DataInput.sc.nextLine();
                    o.addOrder(check);
                    break;
                case "2" :
                    o.listOrder();
                    break;
                case "3" :
                    o.searchOrder();
                    break;
                case "4" :
                    o.updateOrder();
                    break;
                case "5" :
                    o.deleteOrder();
                    break;
                case "6" :
                    o.sales();
                    break;
                case "7" :
                    System.out.println("프로그램 종료");
                    return;
                default :
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!");
                    break;
            }
        }

    }

}
