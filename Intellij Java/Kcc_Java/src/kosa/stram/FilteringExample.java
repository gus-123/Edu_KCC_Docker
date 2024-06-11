package kosa.stram;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        // list 생성
        List<String> list = new ArrayList<String>();
        // 리스트 추가
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");

        // 중복 요소 제거
        list.stream().distinct().forEach(System.out::print);
        System.out.println();

        //신으로 시작하는 요소만 필터링
        list.stream().filter(x -> x.startsWith("D")).forEach(System.out::print);
        System.out.println();

        // 중복 요소를 제거하고 신으로 시작하는 요소만 필터링
        list.stream().distinct().filter(a -> a.startsWith("D")).forEach(System.out::print);
        System.out.println();
    }
}
