package collection.deque;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        //벡터를 사용해서 별로 성능이 좋지 않음 Deque를 사용하는 것이 더 좋다.
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        //다음 꺼낼 요소 확인(찍먹)
        System.out.println("stack.peek()= "+ stack.peek());

        //스택 요소 뽑기
        System.out.println("stack.pop()= "+ stack.pop());
        System.out.println("stack.pop()= "+ stack.pop());
        System.out.println("stack.pop()= "+ stack.pop());
        System.out.println(stack);


    }

}
