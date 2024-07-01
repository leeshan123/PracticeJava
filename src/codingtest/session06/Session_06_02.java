package codingtest.session06;


import java.util.Scanner;

public class Session_06_02 {
        //세션 6번의 2번 문제(버블 정렬)

        public int[] solution(int n,int[] arr){

            //i를 n-1로 j를 n-i-1로 하는 것만 인지하자.
            for(int i=0; i<n-1; i++){
                for(int j=0; j<n-i-1; j++){
                    if(arr[j] > arr[j+1]){
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }

            }


            return arr;

        }


        public static void main(String[] args) {
            Session_06_02 T = new Session_06_02();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }



            for(int x: T.solution(n,arr)){
                System.out.print(x +  " ");
            }



        }
    }


