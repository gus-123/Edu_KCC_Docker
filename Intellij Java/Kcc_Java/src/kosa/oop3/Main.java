package kosa.oop3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        //Student student = new Student();
        work work = new work(); // 내가 생성하고 싶은 객체

        // 객체 생성하는 방식
//       Person person = new Person(name, work);

        // 익명 클래스 만드는 방법
        Person person = new Person(name, new Role() {  // new Role() 역할을 익명 내부 클래스로 생성
            @Override
            public void doing() {
                System.out.println("드라이빙 역할");
            }
        });

        person.doIt();
    }
}
