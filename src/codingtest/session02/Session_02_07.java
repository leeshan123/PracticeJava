package codingtest.session02;


import java.util.Scanner;

public class Session_02_07 {
        //세션 2번의 7번 문제(점수계산)
        // 시간오버


        public int solution(int n,int[] arr){
            int sum = 0;
            int count = 0;


            for(int i=0; i<n; i++){
                if(arr[i] == 1){
                    count++;
                    sum += count;
                }
                else {
                    count = 0;

                }
            }

            return sum;
        }


        public static void main(String[] args) {
            Session_02_07 T = new Session_02_07();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];

            for(int i=0; i <n; i++)
                arr[i] = scan.nextInt();

            System.out.println(T.solution(n,arr));



        }
    }


