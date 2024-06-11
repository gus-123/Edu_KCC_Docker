package kosa.dataa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackMission {

    public static void main(String[] args) {
        //키보드부터 수학수식을 입력
        //((2+3)+10) => 괄호 일치 / 불일치 판단
        Stack<String> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("수학 수식을 입력 해주세요 : ");
        String expression = sc.nextLine();  // 입력하면 stack으로 들어가는 거임

        try {
            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);

                if (c == '(') {
                    stack.push(c + "");
                } else if (c == ')') {
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                System.out.println("괄호가 일치 합니다.");
            }
            else {
                System.out.println("괄호가 불일치 합니다.");
            }
        }catch (Exception e) {
            System.out.println("괄호가 불일치 합니다.");
        }
    }
}
