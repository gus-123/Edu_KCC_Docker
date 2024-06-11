package kosa.dataa;

import java.util.*;

public class MapMission {
    public static void main(String[] args) {
        // 이름, 점수를 한쌍으로 Map 자료구조로 구현하시오. (예: 김자바:90, 박자바:60)
        // 1. 시험 응시자만 출력
        // 2. 총점, 평균, 최고점수, 최저점수 출력 (Collections => max(), min())

        // 내가 친 코드
//        Map<String, Integer> student = new HashMap<>();
//
//        student.put("김자바", 90);
//        student.put("박자바", 60);
//
//        // 1. 시험 응시자 출력
//        System.out.println("시험 응시자:");
//        for (String name : student.keySet()) {
//            System.out.println(name);
//        }
//
//        // 2. 총점, 평균, 최고점수, 최저점수 계산 및 출력
//        int total = 0;
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (Integer score : student.values()) {
//            total += score;
//
//            if (score > max) {
//                max = score;
//            }
//
//            if (score < min) {
//                min = score;
//            }
//        }
//
//        int avg = total / student.size();
//
//        System.out.println("\n총점: " + total);
//        System.out.println("평균: " + avg);
//        System.out.println("최고점수: " + max);
//        System.out.println("최저점수: " + min);

        Map<String, Integer> map = new HashMap<>();

        map.put("김자바", 50);
        map.put("박자바", 60);

        //map => key 추출
        Set<String> set = map.keySet();
        System.out.println("응시자 명단 : " + set);

        //map => value 추출
        Collection<Integer> values = map.values();
        Iterator<Integer> iter = values.iterator();
        
        int total = 0;
        while (iter.hasNext()) {
            total += iter.next();
        }
        
        System.out.println("총점:" + total);
        System.out.println("평균:" + map.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));

    }
}
