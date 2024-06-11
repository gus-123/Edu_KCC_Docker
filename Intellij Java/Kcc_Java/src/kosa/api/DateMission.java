package kosa.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateMission {
    public static void main(String[] args) throws ParseException {
        // 키보드 => 날짜 입력 2014/06/05
        //입사일을 입력 받아 => 몇년 몇개월 재직 중
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date: ");
        Date inDate = null;

        while (sc.hasNextLine()) {
            try {
                inDate = df.parse(sc.nextLine());  //parse는 예외를 발생 시킴
                break;
            }catch (Exception e) {
                System.out.println("다시 입력 하세요.");
            }
        }

        Calendar cal = Calendar.getInstance();  // 입사일
        cal.setTime(inDate); // 2014
        Calendar today = Calendar.getInstance();  // 오늘 날짜 2024
        
        // 총일수
        // getTimeInMillis() - 시간을 초로 나눔
        long day = (today.getTimeInMillis() - cal.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        System.out.println(day);

        int year = (int)(day / 365);
        long month = (day % (365 * year)) / 30;
        System.out.println("재직 기간: " + year + "년" + month + "개월 근속");


    }
}
