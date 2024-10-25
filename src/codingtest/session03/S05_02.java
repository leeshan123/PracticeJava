package codingtest.session03;

import java.util.Scanner;

public class S05_02 {

    public int solution(int n){
        int answer = 0, count=1;
        n--;
        while(n>0){
            count++;
            n -= count;
            if(n%count==0){
                answer++;
            }

        }





        return answer;
    }

    public static void main(String[] args) {
        S05_02 T = new S05_02();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();



        System.out.println(T.solution(n));


    }




}