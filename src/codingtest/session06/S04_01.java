package codingtest.session06;

import java.util.Arrays;
import java.util.Scanner;

public class S04_01 {

    public int[] solution(int cacheSize,int n,int[] arr){
        int[] cache = new int[cacheSize];

        for(int x : arr){
            int pos = -1;
            for(int i=0; i<cacheSize;i++){
                if(x == cache[i]) pos = i;
            }
            if(pos == -1){
                for(int i=cacheSize-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }else {
                for(int i=pos; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;

        }


        return cache;
    }

    public static void main(String[] args) {
        S04_01 T = new S04_01();
        Scanner scan = new Scanner(System.in);

        int cacheSize = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(T.solution(cacheSize,n,arr)));


    }




}