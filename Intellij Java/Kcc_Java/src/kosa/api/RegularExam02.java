package kosa.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam02 {

    public static void main(String[] args) {

        // 원하는 단어 검색
//        String data[] = {
//                "bat", "bba", "bbg", "bonus",
//                "CA", "ca", "c232", "car",
//                "date", "dic", "diraaa"
//        };
//
//        Pattern p = Pattern.compile("c[a-z]\\w");  //  정규 표현식에 해당하는 것들만 출력
//
//        for (int i = 0; i < data.length; i++) {
//            Matcher m = p.matcher(data[i]);  // 문자열을 설정
//            if (m.matches()) {  // 매칭됬는지 여부 파악
//                System.out.println(data[i]);
//            }
//        }

        // 그룹 뽑기
//        String source = "ab?cd?ef?gh?";
//        String reg = "(\\w*)";
//
//        Pattern pattern = Pattern.compile(reg);
//
//        Matcher m = pattern.matcher(source);
//
//        while (m.find()) {  // 찾기
//            System.out.println(m.group());  // 그룹 뽑기
//        }

        String source ="HP: 010-111-1111, HOME: 02-222-2222";
        String reg = "(\\d{2,3}-\\d{3,4}-\\d{4})"; // 공통성을 찾기

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(source);

        while (m.find()) {
            System.out.println(m.group());
        }



    }
}
