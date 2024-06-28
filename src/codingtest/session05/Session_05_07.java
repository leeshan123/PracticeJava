package codingtest.session05;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Session_05_07 {
        //queue 문제
        //세션 5번의 7번 문제(7. 교육과정 설계기)
        //FIFO Q.poll() -> 맨 앞에꺼 꺼냄
        //Q.offer() -> 맨 뒤로 넣음
        //peek나 contains 알아두기

        public String solution(String need, String plan){
            String answer = "YES";

            Queue<Character> Q = new LinkedList<>();
            //큐에 필수 과목 넣기
            for(char x : need.toCharArray()) Q.offer(x);

            //검증
            for(char x : plan.toCharArray()){
                if(Q.contains(x)) {
                    if (x != Q.poll()) return "NO";

                    }
                }

            //필수과목이 남아있어도 안되니까
            if(!Q.isEmpty()) return "NO";







            return answer;

        }


        public static void main(String[] args) {
            Session_05_07 T = new Session_05_07();
            Scanner scan = new Scanner(System.in);
            String s1 = scan.next();
            String s2 = scan.next();

            System.out.println(T.solution(s1,s2));



        }
    }


