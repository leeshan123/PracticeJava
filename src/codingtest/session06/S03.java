package codingtest.session06;

import java.util.Arrays;
import java.util.Scanner;

public class S03 {

    public int[] solution(int n,int[] arr){

        for(int i=1; i<n;i++){
            int tmp =arr[i],j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;

        }

        return arr;
    }

    public static void main(String[] args) {
        S03 T = new S03();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(T.solution(n,arr)));


    }




}