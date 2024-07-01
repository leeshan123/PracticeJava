package codingtest.session06;



import java.util.Arrays;
import java.util.Scanner;

public class Session_06_05 {
        //세션 6번의 5번 문제(중복 확인)
        //O


        public char solution(int n,int[] arr){
            char answer = 'U';

//            Arrays.sort(arr);

            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    if(arr[i] == arr[j])
                        return 'D';
                }
            }

                return answer;
            }


        public static void main(String[] args) {
            Session_06_05 T = new Session_06_05();
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }

            System.out.println(T.solution(n,arr));

        }
    }


