package codingtest.session03;

import java.util.Scanner;

public class S06 {

    public int solution(int n,int k, int[] arr){
        int answer = 0;
        int count =0;
        int lt=0;

        for(int rt=0; rt<n; rt++){
            if(arr[rt] ==0) count++;
            while(count > k){
                if(arr[lt]==0) count--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }





        return answer;
    }

    public static void main(String[] args) {
        S06 T = new S06();
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