package codingtest.session06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S06_01 {

    public List solution(int n, int[] arr){

        ArrayList<Integer> answer=new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for(int i=0; i<n; i++){
            if(arr[i] != tmp[i]){
                answer.add(i+1);
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        S06_01 T = new S06_01();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,arr));


    }




}