package codingtest.session03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S03 {

    public int solution(int n,int k,int[] arr){
        int answer = 0;
        int sum = 0;

        for(int i=0; i<k; i++) sum += arr[i];
        answer = sum;

        for(int i=k; i<n; i++){
            sum += arr[i] - arr[i-k];
            answer = Math.max(answer,sum);
        }


        return answer;
    }

    public static void main(String[] args) {
        S03 T = new S03();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();;
        }


        System.out.println(T.solution(n,k,arr));


    }




}