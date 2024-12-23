package codingtest.session02;

import java.util.Scanner;

public class S12 {

    public int solution(int n, int m,int[][] arr){
        int answer = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int count=0;
                for(int k=0; k<m; k++){
                    int pi=0, pj=0;
                    for(int s=0; s<n; s++){
                        if(arr[k][s] == i) pi=s;
                        if(arr[k][s] == j) pj=s;
                    }
                    if(pi<pj) count++;
                }
                if(count == m){
                    answer++;
                }
            }
        }




        return answer;
    }

    public static void main(String[] args) {
        S12 T = new S12();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[m][n];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = scan.nextInt();
            }
        }



        System.out.println(T.solution(n, m,arr));


    }




}