package codingtest.session07;

import java.util.Arrays;
import java.util.Scanner;

public class S01 {

    private void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n+" ");
        }
    }


    public void solution(int n){
        DFS(n);

    }



    public static void main(String[] args) {
        S01 T = new S01();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();


        T.solution(n);




    }




}