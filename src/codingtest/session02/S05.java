package codingtest.session02;

import java.util.Scanner;

public class S05 {

    public int solution(int n){

        int answer = 0;
        int[] arr = new int[n+1];

        for(int i=2; i<arr.length; i++){
            if(arr[i]==0){
                answer++;
                for(int j=i; j<arr.length; j=j+i){
                    arr[j] = 1;
                }

            }
        }





        return answer;
    }

    public static void main(String[] args) {
        S05 T = new S05();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(T.solution(n));


    }

}