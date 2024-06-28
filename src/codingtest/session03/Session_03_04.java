package codingtest.session03;


import java.util.Scanner;

public class Session_03_04 {
        //세션 3번의 4번 문제(연속 부분수열)
        // 시간 초과

        public int solution(int n,int m,int[] arr){
            int count =0;
            int sum =0;
            int lt = 0;

//            for(int i=0; i<n; i++){
//                int sum = 0;
//                for(int j=i; j<n; j++) {
//                    sum += arr[j];
//                    if (sum == m) {
//                        count++;
//                    }
//                    if (sum > m) {
//                        break;
//                    }
//                }
//
//            }
            for(int rt=0; rt<n; rt++){
                sum += arr[rt];
                if(sum ==m) count++;
                while(sum>=m){
                    sum -=arr[lt++];
                    if(sum == m) count++;
                }
            }



            return count;

        }


        public static void main(String[] args) {
            Session_03_04 T = new Session_03_04();
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


