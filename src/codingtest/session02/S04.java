package codingtest.session02;

import java.util.Scanner;

public class S04 {

    public int[] solution(int n){
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;

        for(int i=2; i<n;i++){
            answer[i] = answer[i-1]+answer[i-2];
        }






        return answer;
    }

    public static void main(String[] args) {
        S04 T = new S04();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        int[] solution = T.solution(n);

        for (int answer : solution) {
            System.out.println(answer

            );
        }


    }

}