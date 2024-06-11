package kosa.api;

import java.net.StandardSocketOptions;
import java.util.Arrays;
import java.util.Scanner;

public class StringExam {

    public static void main(String[] args) {
        //1. String 객체 생성 방법과 차이점
        String str0 = "ABC";
        String str2 = "ABC";
        String str3 = new String("ABC");

        if (str0 == str2) {  // 처음에만 만들고 똑같은 게 있으면 주소값을 가져옴.
            System.out.println("같다.");
        } else {
            System.out.println("다르다");
        }

        if (str0 == str3) {  // new를 하게 되면 무조건 새로 만듦.
            System.out.println("같다.");
        } else {
            System.out.println("다르다");
        }

        //2. String 클래스 불변성 특징 => StringBuffer, StringBuilder (가변성)
        str0.concat("DEF");
        System.out.println(str0);  // 그 어떤 메소드라도 자기 자신을 변경할 수 없다. return해서 출력

        String str4 = str0.concat("DEF");
        System.out.println(str4);

        StringBuffer sb = new StringBuffer("ABC");
        sb.append("DEF");
        System.out.println(sb);

        // 연산자(+) 변경 가능
        String sql = "select * from board";
        int num = 10;


        if (num == 10) {
            sql += "where num = 10";
        }

        System.out.println(sql);

        // 해당 문자열의 위치를 파악 => indexOf("문자열") => 해당 문자열의 인덱스, 없으면 -1
        System.out.println(sql.indexOf("board"));
        System.out.println(sql.indexOf("$"));

        // 문자열 길이
        System.out.println(sql.length());

        for (int i = 0; i < sql.length(); i++) {
            System.out.print(sql.charAt(i));
        }

        System.out.println();
        // 문자열 부분 추출 : subString(5) - 인덱스로 6부터, subString(5, 10) - 인덱스로 6부터 9까지
        // 퀴즈 : sql 변수 :board"문자열만 출력
        System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board") + 5));

        // 퀴즈 >
        String fileName = "kosa.jpg";
        String head = "";
        String pattern = "";

        head = fileName.substring(0, fileName.lastIndexOf("."));
        pattern = fileName.substring(fileName.lastIndexOf(".") + 1);

        System.out.println(head + ":" + pattern);


        // qualsIgnoreCase 대,소문자 무시
        String id = "kosa";
        String m_id = "Kosa ";

        if(id.equalsIgnoreCase(m_id.trim())) {
            System.out.println("같다.");
        }
        else {
            System.out.println("다르다");
        }

        // 문자열 ==> String[] 변환
        String fruits = "사과,포도,수박,배";
        String arr[] = fruits.split(",");
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }

        // 문자열 ==> char[] 변환
        String str5 = "abcdef";
        char arr2[] = str5.toCharArray();
        System.out.println(Arrays.toString(arr2));

        //문자열 ==> byte[] 변환
        String str6 = "abcdef";
        byte arr3[] = str6.getBytes();
        System.out.println(Arrays.toString(arr3));

        //문자열 <==> 정수형
        String str7 = "100";
        int num1 = Integer.parseInt(str7);
        System.out.println(num1);

        int num3 = 10;
        //String str8 = String.valueOf(num3);
        String str8 = 10 + "";
        System.out.println(str8);

        // 문자 찾기
        // 나중 해결
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("한개의 문자열을 입력 : ");
//        String first = sc.nextLine();
//        System.out.print("특정 문자를 입력 : ");
//        String second = sc.nextLine();
//
//        int count = 0;
//
//        if(first.length() == 100) {
//            System.out.println("문자열의 길이가 100이 넘습니다.");
//        }
//        else if(first.equalsIgnoreCase(second.trim())) {
//            for (int i = 0; i < first.length(); i++) {
//                char c = first.charAt(i);
//                if (Character.toLowerCase(c) == second.toLowerCase().charAt(0)) {
//                    count ++;
//                }
//            }
//            System.out.println(count);
//        }

        // 단어처리
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("한개의 문자열을 입력 : ");
//        String str = sc.nextLine();
//        System.out.print("특정 문자를 입력 : ");
//        char c = sc.nextLine().charAt(0);  // char 받는 거임
//
//        System.out.println(solution(str, c));
        /*end */

        // 문장 속 단어
        Scanner sc = new Scanner(System.in);

        System.out.print("한개의 문자열을 입력 : ");
        String str1 = sc.nextLine();

        String ans = "";
        int maxLen = 0; // 문자열 중 가장 긴 길이를 저장할 변수

        String[] arr1 = str1.split(" ");

        for (int i = 0; i < arr1.length; i++) {
            int len = arr1[i].length(); // 현재 문자열 길이
            if (len > maxLen) { // 현재 문자열 길이가 최대 길이보다 크면 갱신
                maxLen = len;
            }
        }

        System.out.println("가장 긴 문자열의 길이는 " + maxLen + "입니다.");


    }

    public static int solution(String str, char c) {
        int ans = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        // 1번 방식
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                ans++;
            }
        }

        //2번 방식
        for (char x : str.toCharArray()) {
            if (x == c) {
                ans++;
            }
        }

        return ans;

        //문장 속 단어
//        String answer = "";
//        String arr[] = str.split(" ");
//        int m = 0;
//
//        for (String x : arr) {
//
//        }
    }
}
