package codingtest.session06;

import java.util.Arrays;
import java.util.Scanner;

public class S05 {

    public char solution(int n,int[] arr){

        for(int i=0; i<n-1; i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]) return 'D';
            }
        }



        return 'U';
    }

    public static void main(String[] args) {
        S05 T = new S05();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,arr));


    }




}