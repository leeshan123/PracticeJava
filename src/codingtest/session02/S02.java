package codingtest.session02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S02 {

    public int solution(int[] arr){

        int count = 1;
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                count++;
                max = arr[i];
            }
        }



        return count;
    }

    public static void main(String[] args) {
        S02 T = new S02();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(arr));


    }

}
