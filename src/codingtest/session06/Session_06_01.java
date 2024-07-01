package codingtest.session06;


import java.util.Scanner;
import java.util.Stack;

public class Session_06_01 {
        //세션 6번의 1번 문제(선택정렬)

        public int[] solution(int n,int[] arr){

            //i를 n-1로 j를 i+1로 하는 것만 인지하자.
            for(int i=0; i<n-1; i++){
                int idx = i;
                for(int j=i+1; j<n; j++){
                    if(arr[j]<arr[idx]) idx = j;
                }
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }


            return arr;

        }


        public static void main(String[] args) {
            Session_06_01 T = new Session_06_01();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }



            for(int x: T.solution(n,arr)){
                System.out.print(x +  " ");
            }



        }
    }


