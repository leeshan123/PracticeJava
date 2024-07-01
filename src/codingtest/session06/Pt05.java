package codingtest.session06;



import java.util.Arrays;
import java.util.Scanner;

public class Pt05 {
        //세션 6번의 5번 문제(중복 확인)
        //O


        public char solution(int n,int[] arr){
            char answer = 'U';

            Arrays.sort(arr);

            for(int i=0; i<n-1; i++){
                if(arr[i] == arr[i+1])
                    return 'D';
            }

            return answer;

            }


        public static void main(String[] args) {
            Pt05 T = new Pt05();
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }

            System.out.println(T.solution(n,arr));

        }
    }


