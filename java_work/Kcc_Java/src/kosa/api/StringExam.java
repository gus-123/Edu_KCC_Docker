package kosa.api;

import java.util.Arrays;
import java.util.Scanner;

public class StringExam {
	public static void main(String args[]) {
		String str0 = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");
		
		if (str0 == str2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다");
		}
		
		//str0와 str2는 같음
		
		if (str2 == str3) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		// str3는 new로 생성해줬기때문에 무조건 메모리 할당을 새로 해주어서 다른다
		
		str0.concat("DEF");
		System.out.println(str0);
		
		// 객체의 불변성 때무에 바뀌지 않음
		// 허나 String에 리턴 값을 대입하면 변경됨.
		// 1번 리턴 값 대임
		String str4 = str0.concat("DEF");
		
		System.out.println(str4);
		
		//2. buffer를 생성하여 append로 추가
		StringBuffer sb = new StringBuffer("abc");
		
		sb.append("def");
		
		System.out.println(sb);
		
		//3.  (+)연산자를 이용하여 String 추가
		String sql = "select * from board";
		
		sql += "where a= 1";
		
		System.out.println(sql);
		
		//문자열의 위치를 파악하기
		System.out.println(sql.indexOf("select"));
		
		// 문자열의 길이
		System.out.println(sql.length());
		
		// 하나의 문자를 뽑는 방법
		for (int i = 0; i < sql.length(); i++) {
			System.out.println(sql.charAt(i));
		}
		
		// 문자열 부분 추출
		// 퀴즈 : sql 변수 : board 문자열만 출력
		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board")+5));
		
		String fileName = "kosa.jpg";
        String head = "";
        String pattern = "";
        
        head = fileName.substring(0, fileName.lastIndexOf("."));
        pattern = fileName.substring(fileName.lastIndexOf(".") + 1);
        
        System.out.println(head + ":" + pattern);
		
        
        // 대, 소문자 무시
        String id = "kosa";
        String m_id = "Kosa ";
        
        if(id.equalsIgnoreCase(m_id.trim())) {
        	System.out.println("같다.");
        }
        else {
        	System.out.println("다르다");
        }
		
		// 문자열 ==> Strin[] 변환
        String fruits = "사과,포도,수박,배";
        String arr[] = fruits.split(",");
        
        System.out.println(Arrays.toString(arr));
		
        // 문자열 =>char[]변환
        String str6 = "abcdef";
        byte[] arr3 = str6.getBytes();
        System.out.println(Arrays.toString(arr3));
        
        //문자열 => 정수형
        String str7 ="100";
        int num1 = Integer.parseInt(str7);
        System.out.println(num1);
        
        
        // 정수형 => 문자열
        int num3 = 200;
        String str8 = num3 + "";
        System.out.println(str8);
		
		// 단어 처리
        Scanner sc = new Scanner(System.in);
        int count = 0;
        
        String str = sc.nextLine();
        
        char ch = sc.nextLine().charAt(0);
        
        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);
        
        for (int i =0; i< str.length(); i ++ ) {
        	if (str.charAt(i)  == ch) {
        		count++;
        	}
        }
        
        System.out.println(count);
		
        
        // 문자열 중 가장 긴 길이를 정장
        String num12 = sc.nextLine();
        
        int answer = 0;
        
        int len = 0;
        
        
		
        
        
	}
}
