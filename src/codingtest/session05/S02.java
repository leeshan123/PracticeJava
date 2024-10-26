package codingtest.session05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class S02 {

    public String solution(String s){

        String answer = "";

        Deque<Character> stack = new ArrayDeque<>();
        char[] cArr = s.toCharArray();

        for(int i=0; i<cArr.length; i++){
            if(cArr[i] =='('){
                stack.push(cArr[i]);
            }else if (cArr[i]==')'){
                stack.pop();
            }

            if(stack.isEmpty() && cArr[i] != ')'){
                answer += cArr[i];
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        S02 T = new S02();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));


    }




}