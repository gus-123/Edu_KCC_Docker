package kosa.stram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        // 리스트 생성 (MapStudent)
        List<MapStudent> students = Arrays.asList(
                new MapStudent("홍길동", 85),
                new MapStudent("박길동", 90),
                new MapStudent("김길동", 80)
        );

        //Student를 score 스트림으로 변환
        // 원하는 객체로 스트림 생성.받아줄 데이터 타입으로 mapToInt().forEach()를 이용한 출력.
        students.stream().mapToInt(s -> s.getScore()).forEach(System.out::println);
        
        // 번외
        int[] arr = {1, 2, 3, 4, 5};
        
        // 배열을 스트림으로 
        IntStream intStram = Arrays.stream(arr);
        // 출력을 위한 배열에서 형식 변환(정수 스트림 -> 실수 스트림)
        intStram.asDoubleStream().forEach(System.out::println);
        //intStram.asDoubleStream().forEach(d->System.out.println(d));
        
        System.out.println();
        
        //(기본 타입을 -> 래퍼 스트림)
        intStram = Arrays.stream(arr);
        intStram.boxed().forEach(obj -> System.out.println(obj.intValue()));
        
        
    }
}
