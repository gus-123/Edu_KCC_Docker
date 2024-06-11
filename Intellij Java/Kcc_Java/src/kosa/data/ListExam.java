package kosa.data;

import java.util.*;

public class ListExam {

    public static void main(String[] args) {
        // 1~45 중복되지 않는 로또번호 6개 출력하자

        // 내가 한거
//        int arr[] = new int[6];
//
//        arr[0] = (int)(Math.random() % 9) + 1;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            do {
//                arr[1] = (int)(Math.random() * 9) + 1;
//            } while (arr[1] == arr[0]);
//            do {
//                arr[2] = (int)(Math.random() * 9) + 1;
//            } while (arr[0] == arr[2] || arr[1] == arr[2]);
//            do {
//                arr[3] = (int)(Math.random() * 9) + 1;
//            } while (arr[0] == arr[3] || arr[1] == arr[3] || arr[2] == arr[3]);
//            do {
//                arr[4] = (int)(Math.random() * 9) + 1;
//        } while (arr[0] == arr[4] || arr[1] == arr[4] || arr[2] == arr[4] || arr[3] == arr[4]);
//            do {
//                arr[5] = (int)(Math.random() * 9) + 1;
//            } while (arr[0] == arr[5] || arr[1] == arr[5] || arr[2] == arr[5] || arr[3] == arr[5]);
//
//            System.out.println(arr[i]);
//        }


        Random rand = new Random();

        //1. 배열로 구현

//        int arr[] = new int[6];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rand.nextInt(45) + 1;
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    i = i-1;
//                }
//            }
//        }
//
//        Arrays.sort(arr);  // sort
//        System.out.println(Arrays.toString(arr));

        //2. List 구현
        //List<데이터 타입> list = new ArrayList<Integer>();
//        List<Integer> list = new ArrayList<Integer>();  // 리스트 생성
//
//        while(true) {
//            int n = rand.nextInt(45) + 1;
//            if (list.contains(n)) {  // contains로 n이 있는지 확인(리스트에서)
//                continue;
//            } else {
//                list.add(n);  // 리스트에 데이터 추가
//            }
//            if (list.size() == 6) break;
//        }
//
//        Collections.sort(list);  // list sorting
//        System.out.println(list);

        // 3. Set 구현 (TreeSet) ==> 중복 허용x
        Set<Integer> set = new TreeSet<Integer>();

        for (int i = 0; set.size() < 6; i++) {
            set.add(rand.nextInt(45) + 1);
        }

        System.out.println(set);



    }
}
