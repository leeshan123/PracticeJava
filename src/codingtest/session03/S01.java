package codingtest.session03;

import java.util.Arrays;
import java.util.Scanner;

public class S01 {

    public int[] solution(int n,int m,int[] arrN,int[] arrM){
        int[] answer = new int[arrN.length+arrM.length];

        for(int i=0; i<n; i++){
            answer[i] = arrN[i];
        }

        for(int i=n; i<n+m; i++){
            answer[i] = arrM[i-n];
        }

        Arrays.sort(answer);


        return answer;
    }

    public static void main(String[] args) {
        S01 T = new S01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arrN = new int[n];
        for(int i=0; i<n; i++){
            arrN[i] = scan.nextInt();;
        }
        int m = scan.nextInt();
        int[] arrM = new int[m];
        for(int i=0; i<m; i++){
            arrM[i] = scan.nextInt();;
        }

        System.out.println(Arrays.toString(T.solution(n,m,arrN,arrM)));


    }




}