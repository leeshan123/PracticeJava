package codingtest.session06;

import java.util.Arrays;
import java.util.Scanner;

public class S05_01 {

    public char solution(int n,int[] arr){

        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                return 'D';
            }
        }



        return 'U';
    }

    public static void main(String[] args) {
        S05_01 T = new S05_01();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,arr));


    }




}