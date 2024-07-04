package codingtest.session06;



import java.util.Arrays;
import java.util.Scanner;

public class Session_06_09 {
        //세션 6번의 8번 문제(뮤직비디오(결정알고리즘))
        //O


        public int solution(int n,int k,int[] arr) {
            int answer = 0;

            Arrays.sort(arr);
            int sum = 0;


            //내가한건 순차검색
            for(int i=0; i<n; i++){
                sum += arr[i];
            }

            double avg = (double)sum/k;


            int sumd = 0;

            for(int i=0; i<n; i++){

                sumd += arr[i];
                System.out.println(sumd);

                if(sumd >= (int)avg){
                    answer = sumd;
                    sumd =0;
                }
            }


            return answer;
        }


        public static void main(String[] args) {
            Session_06_09 T = new Session_06_09();
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


