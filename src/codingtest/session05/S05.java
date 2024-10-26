package codingtest.session05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class S05 {

    public int solution(String s){

        int answer = 0;
        Deque<Character> stack = new ArrayDeque<>();
        char[] sArr = s.toCharArray();

        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] =='('){
                stack.push(sArr[i]);
            }else {
                stack.pop();
                if(sArr[i-1] == '('){
                    answer += stack.size();
                }else { // 막대기의 끝인 경우
                    answer += 1;
                }
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        S05 T = new S05();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        System.out.println(T.solution(s));


    }




}