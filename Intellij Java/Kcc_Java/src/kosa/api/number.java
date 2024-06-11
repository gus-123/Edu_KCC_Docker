package kosa.api;

import java.util.Scanner;

public class number {

    public static void main(String[] args) {
        /* 내가 한거
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                System.out.print(str.charAt(i));
            }
        }*/

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }

    public static int solution (String str) {
        String answer ="";
        for (char x : str.toCharArray()) {
//            if(Character.isDigit(x)) {
//                answer += x;
//            }
            if(x>=48 && x<=57) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

}

