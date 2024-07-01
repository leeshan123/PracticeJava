package codingtest.session06;


import java.util.Scanner;

public class Pt03 {
        //세션 6번의 3번 문제(삽입 정렬)
        //x
        //else로 브레이크하고 멈추는걸 안함

        public int[] solution(int n,int[] arr){

            for(int i=1; i<n; i++){
                int tmp = arr[i];
                int idx = i;
                for(int j=i-1; j>=0; j--){
                    if(arr[j] > tmp){
                        arr[j+1] = arr[j];
                        idx = j;
                    }else break;
                }
                arr[idx] = tmp;

            }


            return arr;

        }


        public static void main(String[] args) {
            Pt03 T = new Pt03();
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


