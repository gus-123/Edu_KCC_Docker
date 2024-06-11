package kosa.dataa;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueueExam {

    public static void main(String[] args) {
        //stack
//        Stack<Integer> stack = new Stack<Integer>();  // stack 자료구조
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println("--- stack ---");
//        while (!stack.empty()) {
//            System.out.println(stack.pop());
//        }
        //queue
        LinkedList<Integer> queue = new LinkedList<>();
        
        queue.offer(1);   // 데이터 값 넣기
        queue.offer(2);
        queue.offer(3);
        
        System.out.println("--- Queue ---");
        
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());  // 데이터 값 빼기
        }

    }
}
