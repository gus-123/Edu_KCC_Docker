package kosa.movie;

import java.util.ArrayList;
import java.util.List;

public class Stand {
    // 필드
    private int id;
    private String snack;
    private String drink;
    private String goods;
    private List<Customer> customers;

    public Stand() {

    }

    public Stand(int id, String snack, String drink, String goods) {
        this.id = id;
        this.snack = snack;
        this.drink = drink;
        this.goods = goods;
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void printCustomer() {
        System.out.println("주문 번호 : " + id);
        System.out.println("주문 음식 : " + snack);
        System.out.println("주문 음료수 : " + drink);
        System.out.println("주문 굿즈 : " + goods);
        for (Customer customer : customers) {
            System.out.println("예매자 이름 : " + customer.getName());
            System.out.println("예매자 나이 : " + customer.getAge());
        }
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSnack() {
        return snack;
    }
    public void setSnack(String snack) {
        this.snack = snack;
    }
    public String getDrink() {
        return drink;
    }
    public void setDrink(String drink) {
        this.drink = drink;
    }
    public String getGoods() {
        return goods;
    }
    public void setGoods(String goods) {
        this.goods = goods;
    }

}
