package codingtest.session05;

import java.util.*;

public class S01 {

    public String solution(String s){

        String answer = "NO";

        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c ==')'){
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            return "YES";
        }


        return answer;
    }

    public static void main(String[] args) {
        S01 T = new S01();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));


    }




}