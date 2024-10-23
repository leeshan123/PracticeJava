package codingtest.session02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S01 {

    public List solution(int[] arr){

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for(int i=1; i< arr.length; i++){
            if(arr[i]>arr[i-1]){
                list.add(arr[i]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        S01 T = new S01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(arr));


    }

}