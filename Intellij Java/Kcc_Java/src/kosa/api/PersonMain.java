package kosa.api;

public class PersonMain {

    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 30);  // new는 새로운 메모리공간을 할당 받는다.
        Person p2 = new Person("홍길동", 20);

        if (p1.equals(p2)) {  // 주소값을 비교 (p1 == p2)  // object의 p1.equals(p2)여서 주소값 비교 (왜냐 Person에 equals가 없기때문에)

            System.out.println("같다");
        }
        else {
            System.out.println("다르다");
        }

        System.out.println(p1);  // 여기에 객체를 넣으면 자동으로 p1.toString()을 호출해줌.
    }
}
