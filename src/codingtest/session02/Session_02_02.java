package codingtest.session02;

import java.util.ArrayList;
import java.util.Scanner;

public class Session_02_02 {
        //세션 2번의 2번 문제(보이는 학생)
        // X

        public ArrayList<Integer> solution(int n, int[] arrInt){
            int x = 0;
            ArrayList<Integer> answer = new ArrayList<>();
            answer.add(arrInt[0]);

            for(int i=0; i<n-1; i++){
                if(arrInt[i] < arrInt[i+1])
                    answer.add(arrInt[i+1]);
            }




            return answer;
        }


        public static void main(String[] args) {
            Session_02_02 T = new Session_02_02();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arrInt = new int[n];
            for(int i=0; i<n; i++){
                arrInt[i] =scan.nextInt();
            }
            for(int x : T.solution(n,arrInt)){
                System.out.print(x+" ");
            }


        }
    }


