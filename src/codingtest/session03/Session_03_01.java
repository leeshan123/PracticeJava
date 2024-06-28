package codingtest.session03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Session_03_01 {
        //세션 3번의 1번 문제(두 배열 합치기)
        // 한번만 카운팅



        public ArrayList<Integer> solution(int n,int m,int[] arr1,int[] arr2){
            ArrayList<Integer> answer = new ArrayList<>();
            int p1 = 0;
            int p2 = 0;

            while (p1<n && p2<m){
                if(arr1[p1]<arr2[p2]) answer.add(arr1[p1++]);
                else answer.add(arr2[p2++]);
            }
            while(p1<n) answer.add(arr1[p1++]);
            while(p2<m) answer.add(arr2[p2++]);

            return answer;
        }


        public static void main(String[] args) {
            Session_03_01 T = new Session_03_01();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr1 = new int[n];
            for(int i=0; i<n; i++){
                arr1[i] = scan.nextInt();
            }
            int m = scan.nextInt();
            int[] arr2 = new int[m];
            for(int i=0; i<m; i++){
                arr2[i] = scan.nextInt();
            }

            for(int x : T.solution(n,m,arr1,arr2)){
                System.out.print(x+ " ");
            }



        }
    }


