package codingtest.session06;



import java.util.Arrays;
import java.util.Scanner;

public class Session_06_09 {
        //세션 6번의 8번 문제(뮤직비디오(결정알고리즘))
        //X

        public int count(int[] arr, int capacity){

            int count = 1;
            int sum = 0;

            for(int x : arr){
                if(sum+x > capacity){
                    count++;
                    sum = x;
                }
                else sum += x;
            }

            return count;
        }


        public int solution(int n,int m,int[] arr) {
            int answer = 0;

            //Arrays메서드 잘보자
            int lt = Arrays.stream(arr).max().getAsInt();
            int rt = Arrays.stream(arr).sum();

            while(lt<=rt){
                int mid = (lt+rt)/2;
                if(count(arr,mid)<=m){
                    answer = mid;
                    rt = mid-1;
                }
                else {
                    lt = mid +1;
                }
            }

            return answer;
        }


        public static void main(String[] args) {
            Session_06_09 T = new Session_06_09();
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


