package codingtest.session05;


import java.util.Scanner;
import java.util.Stack;

public class Session_05_02 {
        //세션 5번의 1번 문제(2. 괄호문자제거)

        public String solution(String s){
            String answer = "";
            Stack<Character> stack = new Stack<>();

            for(char x : s.toCharArray()){
                if(x==')'){
                    while((stack.pop() != '(')){
                    }

                }else stack.push(x);
            }


            for(int i=0; i<stack.size(); i++){
                //get(i) 까먹지말기
                answer += stack.get(i);
            }



            return answer;

        }


        public static void main(String[] args) {
            Session_05_02 T = new Session_05_02();
            Scanner scan = new Scanner(System.in);
            String s = scan.next();

            System.out.println(T.solution(s));



        }
    }


