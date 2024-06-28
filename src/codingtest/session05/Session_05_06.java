package codingtest.session05;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Session_05_06 {
        //queue 문제
        //세션 5번의 6번 문제(6. 공주구하기)
        //FIFO Q.poll() -> 맨 앞에꺼 꺼냄
        //Q.offer() -> 맨 뒤로 넣음
        //peek나 contains 알아두기

        public int solution(int n, int k){
            int answer = 0;

            //이거 기억 안날듯
            Queue<Integer> Q = new LinkedList<>();
            for(int i=1; i<=n; i++) Q.offer(i);
            while(!Q.isEmpty()){
                for(int i=1; i<k; i++){
                    //꺼냈다가 다시 넣어준다
                    Q.offer(Q.poll());
                }
                Q.poll();
                if(Q.size()==1)
                    answer = Q.poll();

            }
            return answer;

        }


        public static void main(String[] args) {
            Session_05_06 T = new Session_05_06();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int k = scan.nextInt();

            System.out.println(T.solution(n,k));



        }
    }


