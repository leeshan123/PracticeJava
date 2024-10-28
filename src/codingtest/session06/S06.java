package codingtest.session06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S06 {

    public List solution(int n, int[] arr){

        List<Integer> list = new ArrayList<>();
        int target = 0;

        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                list.add(i+1);
                target = i+1;
                break;
            }
        }

        for(int i=target; i<n; i++){
            if(arr[target] > arr[i]){
                list.add(i+1);
            }
        }


        return list;
    }

    public static void main(String[] args) {
        S06 T = new S06();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,arr));


    }




}