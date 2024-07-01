package codingtest.session06;

import java.util.Scanner;

public class Pt01 {
//세션 6번의 1번 문제(선택정렬)

    public int[] solution(int n,int[] arr) {
        for (int i = 0; i < n-1; i++) {
            //이게 생각이 안남
            int idx=i;

            for (int j = i+1; j<n; j++) {
                if(arr[j] <arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }


        public static void main (String[]args){
            Pt01 T = new Pt01();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }


            for (int x : T.solution(n, arr)) {
                System.out.print(x + " ");
            }


        }
    }


