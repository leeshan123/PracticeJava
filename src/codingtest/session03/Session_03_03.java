package codingtest.session03;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Session_03_03 {
        //세션 3번의 3번 문제(최대매출)
        // 시간 초과

        public int solution(int n,int m,int[] arr){
            int answer, sum=0;
            for (int i=0; i<m; i++) sum += arr[i];
            answer=sum;
            for(int i=m; i<n;i++){
                sum += (arr[i]-arr[i-m]);
                answer = Math.max(answer, sum);
            }



            return answer;

        }


        public static void main(String[] args) {
            Session_03_03 T = new Session_03_03();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }


            System.out.println(T.solution(n,m,arr));


        }
    }


