package codingtest.session02;

import java.util.Scanner;

public class S03 {

    public void solution(int[] arrA,int[] arrB){

        //1:가위 2: 바위 3:보
        for(int i=0; i<arrA.length; i++){

            if(arrA[i] ==1 && arrB[i] == 3 || arrA[i] ==2 && arrB[i] == 1 || arrA[i] ==3 && arrB[i] == 2){
                System.out.println("A");
            }else if(arrA[i] == arrB[i]){
                System.out.println("D");
            }else System.out.println("B");


        }



    }

    public static void main(String[] args) {
        S03 T = new S03();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for(int i=0; i<n; i++){
            arrA[i] = scan.nextInt();
        }

        for(int i=0; i<n; i++){
            arrB[i] = scan.nextInt();
        }

        T.solution(arrA,arrB);


    }

}