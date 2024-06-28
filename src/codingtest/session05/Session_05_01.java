package codingtest.session05;


import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Session_05_01 {
        //세션 5번의 1번 문제(올바른 괄호)

        public String solution(String s){
            String answer = "YES";
            Stack<Character> stack = new Stack<>();

            for(char x : s.toCharArray()){
                if( x == '(') stack.push(x);
                else {
                    if(stack.isEmpty())
                        return "NO";
                    stack.pop();
                }
            }

            //여는 괄호가 많을때
            if(!stack.isEmpty()){
                return "NO";
            }

            return answer;

        }


        public static void main(String[] args) {
            Session_05_01 T = new Session_05_01();
            Scanner scan = new Scanner(System.in);
            String s = scan.next();

            System.out.println(T.solution(s));



        }
    }


