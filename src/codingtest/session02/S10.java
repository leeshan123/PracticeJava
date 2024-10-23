package codingtest.session02;

import java.util.Scanner;

public class S10 {

    public int solution(int[][] arr){

        int answer = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(up(arr,i,j) && down(arr,i,j) && left(arr,i,j) && right(arr,i,j)){
                    answer++;
                }
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        S10 T = new S10();
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

    static boolean up(int[][] arr, int i, int j){
        if(i == 0){
            return true;
        }else {
            if(arr[i][j] > arr[i-1][j]){
                return true;
            }else return false;
        }
    }
    static boolean down(int[][] arr, int i, int j){
        if(i == arr.length-1){
            return true;
        }else {
            if(arr[i][j] > arr[i+1][j]){
                return true;
            }else return false;
        }
    }
    static boolean left(int[][] arr, int i, int j){
        if(j == 0){
            return true;
        }else {
            if(arr[i][j] > arr[i][j-1]){
                return true;
            }else return false;
        }
    }

    static boolean right(int[][] arr, int i, int j){
        if(j == arr[i].length-1){
            return true;
        }else {
            if(arr[i][j] > arr[i][j+1]){
                return true;
            }else return false;
        }
    }


}