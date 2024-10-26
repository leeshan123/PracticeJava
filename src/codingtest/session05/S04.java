package codingtest.session05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class S04 {

    public int solution(String s){

        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(c-'0');
            }
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(c=='+') stack.push(lt+rt);
                else if(c=='-') stack.push(lt-rt);
                else if(c=='*') stack.push(lt*rt);
                else if(c=='/') stack.push(lt/rt);
            }
        }
        answer = stack.pop();


        return answer;
    }

    public static void main(String[] args) {
        S04 T = new S04();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();



        System.out.println(T.solution(s));


    }




}