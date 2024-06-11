package kosa.dataa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam02 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person("홍길동", 80));
        list.add(new Person("박길동", 20));
        list.add(new Person("김길동", 50));
        list.add(new Person("서길동", 30));
        list.add(new Person("성길동", 60));


//        Collections.sort(list); => 이게 기본정렬 (Person의 Comparable 기준 만듦)
        Collections.sort(list, new Comparator<Person>() {  // Comparator로 새로 정렬기준 변경
            @Override
            public int compare(Person o1, Person o2) {
                // 이름을 오름 차순
                // String : 앞쪽 문자열.compareTo(뒷쪽 문자열)
                // 0 => 앞쪽(AAA) == 뒷쪽(AAA)
                // -1 => 앞쪽(AAA) < 뒷쪽(AAA)
                // 1 => 앞쪽(AAA) > 뒷쪽(AAA)
                //return o1.getName().compareTo(o2.getName());

                if(o1.getName().compareTo(o2.getName()) > 0) {
                    return 1;
                }
                else if(o1.getName().compareTo(o2.getName()) < 0) {
                    return -1;
                }
                return 0;

            }
        });  // 기본 정렬

        System.out.println(list);
    }
}
