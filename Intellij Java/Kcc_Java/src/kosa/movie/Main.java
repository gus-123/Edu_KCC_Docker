package kosa.movie;

import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Movie M1 = new Movie( 1, "설계자", "범죄, 드라마", "2024.05.30 17:00", "X1");
        Movie M2 = new Movie(2, "퓨리오사", "액션", "2024.05.30 18:00", "L1");
        Movie M3 = new Movie(3, "원더랜드", "드라마", "2024.05.30 19:00", "A1");

        Stand S1 = new Stand(1, "카라멜 팝콘", "콜라", "키링");
        Stand S2 = new Stand(2, "일반 팝콘", "사이다", "해당 없음");
        Stand S3 = new Stand(1, "치킨", "맥주", "해당 없음");

        Customer C1 = new Customer("너구리", 20);
        Customer C2 = new Customer("오리", 10);

        C1.addMovie(M1);
        C1.addMovie(M2);

        C2.addMovie(M3);
        C2.addStand(S1);
        C2.addStand(S3);

        C1.removeMovie(M1);

        System.out.println("C1의 영화 예매 정보 입니다.");
        C1.printMovies();
        System.out.println();
        System.out.println("C2의 영화 예매 정보 입니다.");
        C2.printMovies();
        System.out.println("======================================");

        System.out.println("C1의 음식 주문 정보 입니다.");
        C1.printStands();
        System.out.println("C2의 음식 주문 정보 입니다.");
        C2.printStands();
        System.out.println("======================================");

        M3.printCustomer();
        System.out.println();
        S3.printCustomer();


    }
}
