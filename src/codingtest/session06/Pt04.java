package codingtest.session06;


import java.util.Scanner;

public class Pt04 {
        //세션 6번의 4번 문제(Least Recently Used)
        //x


        public int[] solution(int size, int n,int[] arr){
            int[] cache = new int[size];

            for(int x : arr) {
                int pos = -1;
                for (int i = 0; i < size; i++)
                    if (x == cache[i]) pos = i;
                if (pos == -1) {
                    for (int i = size - 1; i >= 1; i--) {
                        cache[i] = cache[i - 1];
                    }
                } else {
                    for (int i = pos; i >= 1; i--) {
                        cache[i] = cache[i - 1];
                    }
                }
                cache[0] = x;
            }

                return  cache;
            }


        public static void main(String[] args) {
            Pt04 T = new Pt04();
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int n = scan.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }



            for(int x: T.solution(size,n,arr)){
                System.out.print(x +  " ");
            }



        }
    }


