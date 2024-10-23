package codingtest.session02;

import java.util.Scanner;

public class S11 {

    public int solution(int[][] arr){

        int[] count = new int[arr.length];

        for(int i=0; i<arr[i].length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j][i] == arr[j][])
            }
        }




        return count[1];
    }

    public static void main(String[] args) {
        S11 T = new S11();
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