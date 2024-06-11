package kosa.api;

import kosa.oop2.Dao;

public class Wrapper {
    public static void main(String[] args) {
        printDouble(new Double(123.45));  // 원래 이렇게 써야 하지만
        // 자동 Boxing을 하면
        printDouble(123.45);


        //자동 Unboxing
        Integer obj = new Integer("10");  // 문자형을 Integer로 박싱
        int sum = obj + 20; // 박싱된걸 unboxing
        System.out.println(sum);
    }

    public static void printDouble(Double obj) {
        System.out.println(obj);
    }
}
