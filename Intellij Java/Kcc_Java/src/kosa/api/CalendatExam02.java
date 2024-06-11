package kosa.api;

import java.net.StandardSocketOptions;
import java.util.Calendar;

public class CalendatExam02 {
    public static void main(String[] args) {
        // 2024 6월 달력 만들기
        // < 2024년 6월>
        // 일 월 화 수 목 금 토
        //                 1
        // 2  3  4 5 6 7   8

        Calendar gc = Calendar.getInstance();
        int n = gc.getActualMaximum(Calendar.DATE);

        //System.out.println(n);

        /* 내가 한거
        int[][] arr = new int[6][7];

        System.out.println("   2024년 6월 달력 만들기");
        System.out.println("\t" + "  < 2024년 6월 >");
        System.out.println("일" + "\t" + "월" + "\t" + "화" + "\t" + "수" + "\t" +"목" + "\t" + "금" + "\t" + "토" + "\t");

        n = n - 28;

        arr[0][5] = n-1;
        System.out.printf("\t\t\t\t\t %5d",arr[0][5]);
        System.out.println();
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = n++;

                System.out.printf("%2d \t", arr[i][j]);
            }
            System.out.println();
        }

        arr[5][0] = n;
        System.out.println(arr[5][0]);*/

        gc.set(2024, 5, 1);
        int week = gc.get(Calendar.DAY_OF_WEEK);  // 1~7 => 7

        System.out.println("\t" + "  < 2024년 6월 >");
        System.out.println("일" + "\t" + "월" + "\t" + "화" + "\t" + "수" + "\t" +"목" + "\t" + "금" + "\t" + "토" + "\t");

        for (int i = 1; i < week; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
            if ((week + i - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
