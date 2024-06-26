package codingtest.session02;


import java.util.Scanner;

public class Session_02_05 {
        //세션 2번의 5번 문제(소수)
        // X


        public int[] solution(int n,int[] arr){
            int x = 0;

            arr[0] = 1;
            arr[1] = 1;

            for(int i=0; i<n-2; i++){
                arr[i+2] = arr[i]+arr[i+1];
            }






            return arr;
        }


        public static void main(String[] args) {
            Session_02_05 T = new Session_02_05();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];


            for(int x : T.solution(n,arr)){
                System.out.print(x +" ");
            }

        }
    }


