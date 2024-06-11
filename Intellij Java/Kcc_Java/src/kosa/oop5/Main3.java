package kosa.oop5;

interface A {
    B abc();
}

class B {
    // return B;
    B() {
        System.out.println("B ??????");
    }
}

public class Main3 {
    public static void main(String[] args) {
        //1. ??? ???? ?????
        A a1 = new A() {
            @Override
            public B abc() {
                return new B();
            }
        };
        a1.abc();

        //2. ?????
        A a2 = () ->  new B();
        a2.abc();

        //3. ?????? ????
        A a3 = B::new;
        a3.abc();
    }
}
