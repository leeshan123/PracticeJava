package codingtest.session02;


import java.util.ArrayList;
import java.util.Scanner;

public class Session_02_03 {
        //세션 2번의 3번 문제(가위바위보)
        // O


        public ArrayList<String> solution(int n, int[] arrIntA, int[] arrIntB){
            int x = 0;
            ArrayList<String> arr = new ArrayList<>();


            for(int i=0; i<n; i++){
                if(arrIntA[i] == arrIntB[i]){
                    arr.add("D");
                }else if (arrIntA[i]-arrIntB[i] == -2 || arrIntA[i]-arrIntB[i] == 1){
                    arr.add("A");
                }else
                    arr.add("B");
            }




            return arr;
        }


        public static void main(String[] args) {
            Session_02_03 T = new Session_02_03();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arrIntA = new int[n];
            int[] arrIntB = new int[n];
            for(int i=0; i<n; i++){
                arrIntA[i] =scan.nextInt();
            }
            for(int i=0; i<n; i++){
                arrIntB[i] =scan.nextInt();
            }

            for(String s : T.solution(n,arrIntA,arrIntB)){
                System.out.println(s);
            }

        }
    }


