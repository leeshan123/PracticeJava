package codingtest.session07;

import java.util.Scanner;

public class S02 {

    private void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }


    public void solution(int n){
        DFS(n);

    }



    public static void main(String[] args) {
        S02 T = new S02();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();


        T.solution(n);




    }




}