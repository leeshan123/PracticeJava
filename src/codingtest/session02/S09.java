package codingtest.session02;

import java.util.Arrays;
import java.util.Scanner;

public class S09 {

    public int solution(int[][] arr){

        int answer = 0;
        int max =0;


        for(int i=0; i<arr.length; i++){
            max = 0;
            for(int j=0; j<arr[i].length; j++){
                max += arr[i][j];
            }
            if(max > answer){
                answer = max;
            }
        }

        for(int i=0; i<arr[0].length; i++){
            max = 0;
            for(int j=0; j<arr.length; j++){
                max += arr[j][i];
            }
            if(max > answer){
                answer = max;
            }
        }

        max = 0;

        for(int i=0; i<arr.length; i++){
            max += arr[i][i];
        }
        if(max > answer){
            answer = max;
        }

        max = 0;

        for(int i=0; i<arr.length; i++){
            max += arr[4-i][i];
        }

        if(max > answer){
            answer = max;
        }


        System.out.println(answer);




        return answer;
    }

    public static void main(String[] args) {
        S09 T = new S09();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = scan.nextInt();
            }
        }


        System.out.println(T.solution(arr));


    }

}