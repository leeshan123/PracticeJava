package codingtest.session07;

import java.util.Scanner;

public class S03 {

    private int DFS(int n) {


        if(n == 1) return 1;
        else return n*DFS(n-1);

        
    }


    public int solution(int n){
        int a = DFS(n);

        return a;
    }



    public static void main(String[] args) {
        S03 T = new S03();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();


        System.out.println( T.solution(n));





    }




}