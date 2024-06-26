package codingtest.session02;


import java.util.Scanner;

public class Session_02_02 {
        //세션 2번의 2번 문제(보이는 학생)
        // O

        public int solution(int n, int[] arrInt){
            int count = 1;
            int max = arrInt[0];


            for(int i=0; i<n; i++){
                if(arrInt[i] > max) {
                    max = arrInt[i];
                    count++;
                }
            }




            return count;
        }


        public static void main(String[] args) {
            Session_02_02 T = new Session_02_02();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arrInt = new int[n];
            for(int i=0; i<n; i++){
                arrInt[i] =scan.nextInt();
            }

            System.out.println(T.solution(n,arrInt));

        }
    }


