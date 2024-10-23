package codingtest.session02;

import java.util.Arrays;
import java.util.Scanner;

public class S08 {

    public int[] solution(int[] arr){

        int[] answer =new int[arr.length];

        for(int i=0; i<arr.length;i++){
            int cnt=1;

            for(int j=0; j<arr.length;j++){
                if(arr[i] > arr[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }





        return answer;
    }

    public static void main(String[] args) {
        S08 T = new S08();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }


        System.out.println(Arrays.toString(T.solution(arr)));


    }

}