package kosa.Restaurant;

public class MenuItem {
    // 필드
    private String name;
    private int price;
    private String description;
    private int balance;

    // 생성자

    public MenuItem() {}

    public MenuItem(String name, int price, String description, int balance) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.balance = balance;
    }

    // 메서드

    // show 용
    public void printMenuItem() {
        System.out.println("메뉴 이름 :" + name);
        System.out.println("메뉴 가격 : " + price);
        System.out.println("메뉴 설명 : " + description);
        System.out.println("남은 잔액 : " + balance);
    }

    // getter / setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
