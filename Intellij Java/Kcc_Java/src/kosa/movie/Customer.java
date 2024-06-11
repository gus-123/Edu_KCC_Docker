package kosa.movie;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int age;
    private List<Movie> movies;
    private List<Stand> stands;

    public Customer () {

    }

    public Customer (String name, int age) {
        this.name = name;
        this.age = age;
        movies = new ArrayList<Movie>();
        stands = new ArrayList<Stand>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        movie.addCustomer(this);
    }

    public void removeMovie(Movie movie) {
       if (movies.contains(movie)) {
           movies.remove(movie);
           movie.removeCustomer(this);
       }
    }

    public void addStand(Stand stand) {
        stands.add(stand);
        stand.addCustomer(this);
    }

    public void removeStand(Stand stand) {
        if (stands.contains(stand)) {
            stands.remove(stand);
            stand.removeCustomer(this);
        }
    }

    public void printMovies() {
        System.out.println("예매자 이름 :" + name);
        System.out.println("예매자 나이 :" + age);
        for (Movie movie : movies) {
            System.out.println("예매자가 예약한 영화제목 :  " + movie.getTitle());
            System.out.println("예매자가 예약한 영화장르 :  " + movie.getGenre());
            System.out.println("예매자가 예약한 영화시간 :  " + movie.getTime());
            System.out.println("예매자가 예약한 영화자리 :  " + movie.getSeat());
        }
    }

    public void printStands() {
        System.out.println("예매자 이름 :" + name);
        System.out.println("예매자 나이 :" + age);
        for (Stand stand : stands) {
            System.out.println("예매자가 주문한 스낵 :  " + stand.getSnack());
            System.out.println("예매자가 예약한 음료수 :  " + stand.getDrink());
            System.out.println("예매자가 예약한 굿즈 :  " + stand.getGoods());
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
