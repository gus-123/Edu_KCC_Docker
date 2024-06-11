package kosa.movie;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    // 필드
    private int id;
    private String title;
    private String genre;
    private String time;
    private String seat;
    private List<Customer> customers;

    public Movie() {

    }

    public Movie(int id, String title, String genre, String time, String seat) {
        super();
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.time = time;
        this.seat = seat;
        customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void printCustomer() {
        System.out.println("주문 번호 : " + id);
        System.out.println("영화 제목 : " + title);
        System.out.println("영화 장르 : " + genre);
        System.out.println("영화 시간 : " + time);
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
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getSeat() {
        return seat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }

}
