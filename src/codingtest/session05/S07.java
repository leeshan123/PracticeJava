package codingtest.session05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S07 {

    public String solution(String n, String k){

        String answer = "YES";

        Queue<Character> Q = new LinkedList<>();
        for(char c : n.toCharArray()){
            Q.offer(c);
        }

        for(char c : k.toCharArray()){
            if(Q.contains(c)){
                if(Q.poll()==c){
                    continue;
                }else return "NO";
            }
        }

        if(!(Q.isEmpty())){
            return "NO";
        }






        return answer;
    }

    public static void main(String[] args) {
        S07 T = new S07();
        Scanner scan = new Scanner(System.in);
        String order = scan.next();
        String lecture = scan.next();

        System.out.println(T.solution(order,lecture));


    }




}