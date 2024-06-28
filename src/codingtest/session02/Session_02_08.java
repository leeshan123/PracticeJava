package codingtest.session02;


import java.util.ArrayList;
import java.util.Scanner;

public class Session_02_08 {
        //세션 2번의 8번 문제(등수구하기)
        // 시간오버


        public int[] solution(int n,int[] arr){
            int[] answer = new int[n];

            for(int i=0; i<n; i++){
                int count = 1;
                for(int j=0; j<n; j++){
                    if(arr[j] > arr[i])
                        count++;
                }
                answer[i] = count;

            }



            return answer;
        }


        public static void main(String[] args) {
            Session_02_08 T = new Session_02_08();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];

            for(int i=0; i <n; i++)
                arr[i] = scan.nextInt();

            for(int x : T.solution(n,arr)){
                System.out.print(x+" ");
            }



        }
    }


