package codingtest.session06;


import java.util.Scanner;

public class Pt02 {
        //세션 6번의 2번 문제(버블 정렬)

        public int[] solution(int n,int[] arr){

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
            Pt02 T = new Pt02();
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


