package codingtest.session06;

import java.util.Arrays;
import java.util.Scanner;

public class S04 {

    public int[] solution(int casheSize,int n,int[] arr){

        int[] cashe = new int[casheSize];
        int pos;

        for(int x : arr){
            pos = -1;

            for(int i=0; i<casheSize; i++) if(x == cashe[i]) pos = i;
            if(pos == -1){
                for(int i=casheSize-1; i>=1; i++){
                    cashe[i] = cashe[i-1];
                }
            }
            else {
                for(int i=pos; i>=1; i--){
                    cashe[i] =  cashe[i-1];
                }
            }
            cashe[0] = x;
        }






        return arr;
    }

    public static void main(String[] args) {
        S04 T = new S04();
        Scanner scan = new Scanner(System.in);

        int casheSize = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(T.solution(casheSize,n,arr)));


    }




}