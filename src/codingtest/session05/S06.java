package codingtest.session05;

import java.util.*;

public class S06 {

    public int solution(int n, int k){

        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }

        while (!queue.isEmpty()){
            for(int i=1; i<k; i++) queue.offer(queue.poll());
            queue.poll();
            if(queue.size()==1) answer = queue.poll();


        }






        return answer;
    }

    public static void main(String[] args) {
        S06 T = new S06();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(T.solution(n,k));


    }




}