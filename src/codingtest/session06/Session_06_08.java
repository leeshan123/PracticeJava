package codingtest.session06;



import java.util.Arrays;
import java.util.Scanner;

public class Session_06_08 {
        //세션 6번의 8번 문제(이분검색)
        //O


        public int solution(int n,int k,int[] arr) {
            int answer = 0;

            Arrays.sort(arr);


            //내가한건 순차검색
            for(int i=0; i<n; i++){
                if(arr[i] == k)
                    answer = i+1;
            }



            return answer;
        }


        public static void main(String[] args) {
            Session_06_08 T = new Session_06_08();
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


