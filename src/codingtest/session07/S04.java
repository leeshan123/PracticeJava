package codingtest.session07;

import java.util.Scanner;

public class S04 {

    private int DFS(int n) {



        if(n == 1) return 1;
        else if(n == 2) return 1;
        else return DFS(n-2)+DFS(n-1);

        
    }


//    public int solution(int n){
//        int a = DFS(n);
//
//        return a;
//    }



    public static void main(String[] args) {
        S04 T = new S04();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(int i=1; i<=n; i++) System.out.print(T.DFS(i) +" ");





    }




}