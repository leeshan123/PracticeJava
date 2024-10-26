package codingtest.session05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class S02_02 {

    public String solution(String s){

        String answer="";
        Stack<Character> stack=new Stack<>();
        for(char x : s.toCharArray()){
            if(x==')'){
                while(stack.pop()!='(');
            }
            else stack.push(x);
        }
        for(int i=0; i<stack.size(); i++) answer+=stack.get(i);
        return answer;
    }

    public static void main(String[] args) {
        S02_02 T = new S02_02();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));


    }




}