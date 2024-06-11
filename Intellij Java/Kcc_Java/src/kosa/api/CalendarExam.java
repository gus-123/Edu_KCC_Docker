package kosa.api;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

    public static void main(String[] args) {
        //GregorianCalendar gc = new GregorianCalendar();
        Calendar gc = Calendar.getInstance();  // 캘린더 객체

        //System.out.println(gc);

        String now = gc.get(Calendar.YEAR) + "년" + (gc.get(Calendar.MONTH) + 1) + "월"
                + gc.get(Calendar.DATE) + "일" + gc.get(Calendar.HOUR) + "시"
                + gc.get(Calendar.MINUTE) + "분";

        System.out.println(now);

        gc.add(Calendar.DATE, 100);

        String future = gc.get(Calendar.YEAR) + "년" + (gc.get(Calendar.MONTH) + 1) + "월"
                + gc.get(Calendar.DATE) + "일" + gc.get(Calendar.HOUR) + "시"
                + gc.get(Calendar.MINUTE) + "분";

        System.out.println("100일 후 : " + future);

        gc.set(2022,5, 4);
        gc.add(Calendar.DATE, 1000);

        // 내가 지정한 형식으로 포맷해줘
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String str = sdf.format(gc.getTime());

        System.out.println(str);

        //퀴즈 : 2024 ~ 2030년까지 자신의 생일이 무슨 요일?
        //Calendar.DAY_OF_WEEK => 요일 <일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)>
        /* 내가 한것
        gc.set(2024,1,23);
        while (true) {
            do {
                int a = gc.get(Calendar.DAY_OF_WEEK);

                if (a == 1) {
                    System.out.println("월요일");
                } else if (a == 2) {
                    System.out.println("화요일");
                } else if (a == 3) {
                    System.out.println("수요일");
                } else if (a == 4) {
                    System.out.println("목요일");
                } else if (a == 5) {
                    System.out.println("금요일");
                } else if (a == 6) {
                    System.out.println("토요일");
                } else {
                    System.out.println("일요일");
                }

                // 윤년 여부 확인 및 윤년이면 1일 추가
                if ((gc.get(Calendar.YEAR) % 4 == 0  && (gc.get(Calendar.YEAR) % 100 == 0))) {
                    gc.add(Calendar.DATE, 1);
                }

                gc.add(Calendar.DATE, 365);
            } while (gc.get(Calendar.YEAR) == 2030);
        }*/

        char week[] = {'일', '월', '화', '수', '목','금'};

        for (int i = 2024; i < 2030; i++) {
            gc.set(i,5,4); // 6월 4일
            char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
            System.out.println(i + "년의 생일은 " + c + "요일 입니다.");
        }

    }
}
