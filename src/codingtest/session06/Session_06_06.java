package codingtest.session06;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Session_06_06 {
        //세션 6번의 6번 문제(장난꾸러기)
        //O


        public ArrayList<Integer> solution(int n,int[] arr) {
            ArrayList<Integer> answer = new ArrayList<>();

//            int[] arr2 = new int[n];
//
//            for(int i=0; i<n; i++){
//                arr2[i] = arr[i];
//            }
            int[] arr2 = arr.clone(); //깊은 복사
            Arrays.sort(arr2);

            for(int i=0; i<n; i++) {
                if(arr2[i] != arr[i]) {
                    answer.add(i+1);
                }
            }

            return answer;
        }


        public static void main(String[] args) {
            Session_06_06 T = new Session_06_06();
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }

            for(int x: T.solution(n,arr)){
                System.out.print(x+" ");
            }

        }
    }


