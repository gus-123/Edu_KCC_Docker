package kosa.stram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static int sum;  // 숫자 범위로 부터 스트림 얻기용

    public static void main(String[] args) {
        //List 컬렉션 생성
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            //Product 객체 생성
            Product product = new Product(i, "상품"+i, "멋진 회사 ", (int) (Math.random() * 1000));

            list.add(product);
        }

        // 객체 스트림 얻는 방법
        Stream<Product> stream = list.stream();
        stream.forEach(p -> System.out.println(p));


        //배열로 부터 스트림 얻기
        // 1. 배열 생성
        String[] arr = { "홍길동", "신용권", "김미나"};
        // 2. Stream 생성 (문자 버전)
        Stream<String> stream1 = Arrays.stream(arr);
        // 3. 출력
        stream1.forEach(item -> System.out.println(item + ","));


        int[]  arr1 = {1,2,2,3,4,5};
        // 정수 버전
        IntStream intStream = Arrays.stream(arr1);
        
        intStream.forEach(item -> System.out.print(item + " "));


        // 숫자 범위로부터 스트림 얻기
        IntStream intStream1 = IntStream.rangeClosed(1, 10);  // rangeClosed(시작점, 끝점)

        intStream1.forEach(a -> sum += a);

        System.out.println(sum);




    }
}
