package codingtest.session08;



import java.util.Arrays;
import java.util.Scanner;

public class Session_08_05 {
        //세션 6번의 8번 문제(이분검색)
        //O


        public int solution(int n,int k,int[] arr) {
            int answer = 0;

            Arrays.sort(arr);


            //이분검색
            int lt = 0;
            int rt = n-1;

            //와일문의 조건식을 잘못함.
            while(lt<=rt){

                int mid = (rt+lt)/2;

                if(arr[mid] > k){
                    rt = mid-1;
                }else if (arr[mid] < k){
                    lt = mid+1;
                }else {
                    answer = mid+1;
                    break;
                }


            }



            return answer;
        }


        public static void main(String[] args) {
            Session_08_05 T = new Session_08_05();
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


