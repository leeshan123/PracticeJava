package codingtest.session06;

import java.util.Arrays;
import java.util.Scanner;

public class S02 {

    public int[] solution(int n,int[] arr){

        for(int i=0; i<n-1;i++){

            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

        }



        return arr;
    }

    public static void main(String[] args) {
        S02 T = new S02();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(T.solution(n,arr)));


    }




}