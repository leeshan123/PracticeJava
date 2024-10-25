package codingtest.session03;

import java.util.Scanner;

public class S04 {

    public int solution(int n,int m,int[] arr){
        int answer = 0;
        int sum = 0;
        int lt =0;
        int rt = 0;
        while(rt < n){

            if(sum <m){
                sum += arr[rt];
                rt++;
            }else if (sum ==m){
                answer++;
                sum -= arr[lt];
                lt++;
                System.out.println("lt = " + lt +" rt = "+ rt);
            }else{
                sum -= arr[lt];
                lt++;
            }

        }




        return answer;
    }

    public static void main(String[] args) {
        S04 T = new S04();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();;
        }


        System.out.println(T.solution(n,m,arr));


    }




}