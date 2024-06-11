package kosa.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
//병렬처리
public class StramExam1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("홍길동");
        list.add("김길동");
        list.add("박길동");

        Stream<String> parallelStream = list.parallelStream();

        parallelStream.forEach(name -> {
            System.out.println(name + ":" + Thread.currentThread().getName());
        });

    }
}
