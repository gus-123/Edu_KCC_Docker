package kosa.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        Random random = new Random();
        
        List<Integer> scores = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            scores.add(random.nextInt(101));
        }
        
        double avg = 0.0;
        long starTime = 0;
        long endTime = 0;
        long time = 0;
        
        Stream<Integer> stream = scores.stream();
        starTime = System.nanoTime();
        avg = stream.mapToInt(i -> i).average().getAsDouble();
        endTime = System.nanoTime();
        time = endTime - starTime;
        System.out.println("Avg: " + avg + ", 일반 스트림 처리 시간: " + time + "ns");
        
        Stream <Integer> parallelStream = scores.parallelStream();
        starTime = System.nanoTime();
        avg = parallelStream.mapToInt(i -> i.intValue()).average().getAsDouble();
        endTime = System.nanoTime();
        time = endTime - starTime;
        System.out.println("Avg: " + avg + ", 병렬 스트림 처리 시간: " + time + "ns");
    }
}
