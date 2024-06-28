package codingtest.session03;


import java.util.Scanner;

public class Session_03_05 {
        //세션 3번의 5번 문제(최대 길이 연속부분수열)
        // 시간 초과

        public int solution(int n,int k, int[] arr){
            int answer =0;
            int count = 0;
            int lt =0;
            for(int rt=0; rt<n; rt++){
                if(arr[rt]==0) count++;
                while(count > k){
                    if(arr[lt]==0) count--;
                    lt++;
                }
                answer = Math.max(answer, rt-lt+1);
            }



            return answer;

        }


        public static void main(String[] args) {
            Session_03_05 T = new Session_03_05();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }



            System.out.println(T.solution(n,k,arr));


        }
    }


