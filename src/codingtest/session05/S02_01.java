package codingtest.session05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class S02_01 {

    public int solution(int n, int[][] arr, int m, int[] moves){

        int answer = 0;





        return answer;
    }

    public static void main(String[] args) {
        S02_01 T = new S02_01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int m = scan.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] = scan.nextInt();
        }


        System.out.println(T.solution(n, arr , m, moves));


    }




}