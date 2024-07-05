package codingtest.session06;



import java.util.Arrays;
import java.util.Scanner;

public class Session_06_10 {
        //세션 6번의 10번 문제(마구간 정하기(결정알고리즘))
        //X

        public int count(int[] arr, int dist){
            int count = 1;
            int ep = arr[0];

            for(int i=1; i<arr.length; i++){
                if(arr[i]-ep > dist){
                    count++;
                    ep = arr[i];
                }
            }
            return count;

        }


        public int solution(int n,int m,int[] arr) {
            int answer = 0;

            Arrays.sort(arr);
            int lt = 1;
            int rt = arr[n-1];
            while(lt<=rt){
                int mid = (lt+rt)/2;
                if(count(arr,mid)>=m){
                    answer=mid;
                    lt = mid+1;
                }else rt = mid-1;
            }







            return answer;
        }


        public static void main(String[] args) {
            Session_06_10 T = new Session_06_10();
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


