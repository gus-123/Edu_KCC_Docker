package kosa.oop5;

public class Main {

    public static void main(String[] args) {
        //MyType => 익명 내부 클래스로 구현해 보자.
        MyType my1 = new MyType() {
            @Override
            public void hello() {
                System.out.println("익명 클래스 형식 입니다.");
            }
        };

        my1.hello();

        //람다식으로 구현
        MyType my2 = () -> {
            System.out.println("람다식 형식 입니다.");
        };

        my2.hello();

        //람다형식2
        MyType my3 = () ->  System.out.println("람다식 형식2 입니다.");  // 괄호는 람다식의 파라미터 목록을 표현

        my3.hello();


        // 파라미터가 있을때
        YoutType you = (String message) -> {
            System.out.println("메시지: " + message);
        };

        you.talk("안녕");

        YoutType you2 = message -> System.out.println("메시지2 : " + message);

        you.talk("Hello World");

        // MyNumber 추상 메서드 구현(람다식) 실습 예제
        MyNumber myNumber = (num1, num2) -> {
            if (num1 > num2) {
                System.out.println("큰 수 : " + num1);
                return num1;
            }
            else {
                System.out.println("큰 수 : " + num2);
                return num2;
            }
            // (num1 > num2)? x: y;
        };

        myNumber.getMax(1,2);
        //System.out.println("큰수 : " + myNumber.getMax(1,2));

        // 람다식으로 스레드 실행하기
        Runnable  r = () -> {
            for (int i = 1; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                System.out.println(i);
            }
        };

        Thread thread = new Thread(r);
        thread.start();

    }
}
