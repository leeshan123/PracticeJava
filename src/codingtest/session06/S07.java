package codingtest.session06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S07 {

    public int[][] solution(int n, int[][] arr){


        for(int i=0; i<n-1; i++){
            for(int j=i+1;j<n; j++) {
                if(arr[i][0] > arr[j][0]){
                    int[] tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }else if(arr[i][0] == arr[j][0]){
                    if(arr[i][1] > arr[j][1]){
                        int[] tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        S07 T = new S07();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            for(int j=0;j<arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int[][] solution = T.solution(n, arr);


        for(int i=0; i<n; i++){
            for(int j=0;j<solution[i].length; j++) {
                System.out.print(solution[i][j]+" ");

            }
            System.out.println();
        }

    }




}