package kosa.stram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

    public static void main(String[] args) {
        //Arrays.asList는 배열을 리스트로 변환 하여 객체를 생성할때 사용
        List<Student> list = Arrays.asList(
            new Student("홍길동", 10),
            new Student("박길동", 20),
            new Student("김길동", 30)
        );

        // 1번 방식
        //Student 스트림
        Stream<Student> stream = list.stream();

        //score 스트림 (mapToInt() 메소드는 객체를 int 값으로 매핑해서 IntStream으로 변환)
        IntStream scoreStream = stream.mapToInt(student -> student.getScore());

        //평규 계산
        double avg1 = scoreStream.average().getAsDouble();

        System.out.println("평균 점수 :" + avg1);

        // 2번 방식
        double avg2 = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println("평균 점수 : " + avg2);

        list.stream().mapToInt(student -> student.getScore()).forEach(score -> System.out.println(score));  // Score 뽑는
        //스트림 생성.원하는 필드 지정.foreachfh 값 출력
        list.stream().map(Student::getName).forEach(name-> System.out.println(name));  // name 뽑느
        //스트림 생성.fillter(원하는 값).foreach 값 출력
        list.stream().filter(s -> s.getName().startsWith("홍")).forEach(s -> System.out.println(s.getName()));  // 필터링 "홍"

        // int를 list에 넣는 스트림
        List<Integer> list2 = IntStream.rangeClosed(1,10)
                        .boxed()// Integer를 int로 boxing
                        .collect(Collectors.toList());  // 리스트에 추가

        list2.stream().forEach(System.out::println);

        // IntStream.of
        IntStream.of(2,4,6,8,10).boxed().collect(Collectors.toList());

        //문자열 배열 => List, Stream 변환
        String arr3[] = {"bb","cc","aa"};

        // 1번 방식
        List<String> list3 = Arrays.asList(arr3);  // 리스트에 배열 넣기

        Stream<String> stream3 = list3.stream();  // 바로 스트림

        stream3.sorted().forEach(System.out::println);

        // 2번 방식
        Stream<String> stream4 = Arrays.stream(arr3);  // 배열을 스트림에 바로 넣기
        stream4.sorted().forEach(System.out::println);



    }
}
