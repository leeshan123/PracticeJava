package codingtest.session05;


import java.util.Scanner;
import java.util.Stack;

public class Session_05_05 {
        //세션 5번의 4번 문제(4. 후위식 연산(postfix))

        public int solution(String s){
            int answer = 0;
            Stack<Character> stack = new Stack<>();
            for(int i=0; i<s.length();i++){
                if(s.charAt(i) == '(') stack.push('(');
                else{
                    stack.pop();
                    //레이져면 스택의 사이즈를 세줌
                    if(s.charAt(i-1) =='(') answer += stack.size();
                    //레이져가 아니면 answer을 하나만 증가시켜줌
                    else answer++;
                }
            }



            return answer;

        }


        public static void main(String[] args) {
            Session_05_05 T = new Session_05_05();
            Scanner scan = new Scanner(System.in);
            String s = scan.next();

            System.out.println(T.solution(s));



        }
    }


