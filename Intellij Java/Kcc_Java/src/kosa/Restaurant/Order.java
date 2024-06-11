package kosa.Restaurant;

public class Order {
    // 필드
    private MenuItem menu[];

    private int menuNum;

    private int sales;

    // 생성자
    public Order() {
        menu = new MenuItem[10];
    }
    public Order(int menuNum, int sales) {
        this.menuNum = menuNum;
        this.sales = sales;
    }

    // 메서드

    // 주문 추가 (기본용)
//    public void addOrder() {
//        System.out.print("메뉴 이름 :");
//        String name = DataInput.sc.nextLine();
//        System.out.print("메뉴 가격 : ");
//        int price = DataInput.sc.nextInt();
//        DataInput.sc.nextLine();
//        System.out.print("메뉴 설명 : ");
//        String description = DataInput.sc.nextLine();
//        menu[menuNum++] = new MenuItem(name, price, description);  // MenuItem의 객체 저장
//    }

    // 주문 추가 (전체용)
    public void addOrder(String num) {
        // 공통 내용
        System.out.print("메뉴 이름 :");
        String name = DataInput.sc.nextLine();
        System.out.print("메뉴 가격 : ");
        int price = DataInput.sc.nextInt();
        DataInput.sc.nextLine();
        System.out.print("메뉴 설명 : ");
        String description = DataInput.sc.nextLine();
        System.out.print("소지금 : ");
        int balance = DataInput.sc.nextInt();

        if ("1".equals(num)) {  // Appetizer 객체 생성
            DataInput.sc.nextLine();
            System.out.print("글루텐 유무 :");
            String gluten = DataInput.sc.nextLine();

            menu[menuNum++] = new Appetizer(name, price, description, balance, gluten);
        }
        else {  // MenuItem 객체 생성
            menu[menuNum++] = new MenuItem(name, price, description, balance);
        }

    }

    // 주문 출력 (기본용)
//    public void listOrder() {
//        for (int i = 0; i < menuNum; i++) {
//            menu[i].printMenuItem();
//        }
//    }

    // 주문 출력 (전체용)
    public void listOrder() {
        System.out.println("1. 에피타이저, 2. 기본, 3. 전체 출력");
        String num = DataInput.sc.nextLine();

        switch (num) {
            case "1" :  // Appetizer 객체 일시
                for (int i = 0; i < menuNum; i++){
                    if (menu[i] instanceof Appetizer) {
                        System.out.print("잔액 업데이트 (y/n) ? ");
                        String update = DataInput.sc.nextLine();
                        if ("y".equalsIgnoreCase(update)) {
                            withdraw(menu[i].getPrice());
                        }
                        menu[i].printMenuItem();
                    }
                }
                break;
            case "2" :  // MenuItem 객체 일시
                for (int i = 0; i < menuNum; i++){
                    if (!(menu[i] instanceof Appetizer)) {
                        System.out.print("잔액 업데이트 (y/n) ? ");
                        String update = DataInput.sc.nextLine();
                        if ("y".equalsIgnoreCase(update)) {
                            withdraw(menu[i].getPrice());
                        }
                        menu[i].printMenuItem();
                    }
                }
                break;
            default :  // 전체 출력
                for (int i = 0; i < menuNum; i++){
                    System.out.print("잔액 업데이트 (y/n) ? ");
                    String update = DataInput.sc.nextLine();
                    if ("y".equalsIgnoreCase(update)) {
                        withdraw(menu[i].getPrice());
                    }
                    menu[i].printMenuItem();
                }
                break;
        }
    }

    // 주문 검색
    public void searchOrder() {
        System.out.println("주문한 음식을 입력하세요! : ");
        String searchMenu = DataInput.sc.nextLine();
        int idx = -1;

        // 검색이 가능할 시
        for (int i = 0; i < menuNum; i++) {
            if(menu[i].getName().equals(searchMenu)) {
                menu[i].printMenuItem();
                idx = i;
                break;
            }
        }

        // 검색이 불가능할 시
        if (idx == -1) {
            System.out.println("찾으시는 검색 결과가 없습니다.");
        }
    }

    // 주문 수정
    public void updateOrder() {
        System.out.println("주문을 수정할 음식을 입력하세요! : ");
        String searchMenu = DataInput.sc.nextLine();
        int idx = -1;

        // 검색이 가능할 시
        for (int i = 0; i < menuNum; i++) {
            if(menu[i].getName().equals(searchMenu)) {
                System.out.println("메뉴 가격 : ");
                int price = DataInput.sc.nextInt();

                menu[i].setPrice(price);

                idx = i;
                break;
            }
        }

        // 검색이 불가능할 시
        if (idx == -1) {
            System.out.println("찾으시는 검색 결과가 없습니다.");
        }
    }

    // 주문 삭제
    public void deleteOrder() {
        System.out.println("주문을 취소할 음식을 입력하세요! : ");
        String searchMenu = DataInput.sc.nextLine();
        int idx = -1;

        // 검색이 가능할 시
        for (int i = 0; i < menuNum; i++) {
            if(menu[i].getName().equals(searchMenu)) {
                idx = i;
            }
        }

        // 검색이 불가능할 시
        if (idx == -1) {
            System.out.println("찾으시는 검색 결과가 없습니다.");
        }
        else {  // 검색 후에 배열의 인덱스 값을 이동
            for (int i = idx; i < menuNum; i++) {
                if(i == menu.length - 1) {  //인덱스 번호가 배열의 마지막일 경우
                    menu[i] = null;
                }
                else {  // 인덱스 번호가 배열의 마지막이 아닌 경우
                    menu[i] = menu[i+1];  // 뒤의 값을 앞으로 넣기
                }
            }
            menuNum--;
        }
    }

    // 주문 결제
    //(입금)
//    public boolean deposit (int amount) {
//        balance += price;
//
//        return true;
//    }
    //(출금)
    public boolean withdraw (int price) {
        for (int i =0; i < menuNum; i++) {
            if (menu[i].getBalance() < price) {
                return false;
            }
            menu[i].setBalance(menu[i].getBalance()-price);
        }

        return true;
    }

    // 총 매출 합계
    public void sales() {
        for (int i = 0; i < menuNum; i++) {
            sales += menu[i].getPrice();
        }

        System.out.println("총 매출 합계는 " + sales + "원 입니다.");
    }

    public MenuItem[] getMenu() {
        return menu;
    }

    public void setMenu(MenuItem[] menu) {
        this.menu = menu;
    }

    public int getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(int menuNum) {
        this.menuNum = menuNum;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
