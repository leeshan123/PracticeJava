package doitcodingtest;

import java.util.Scanner;

public class p_005 {
    //평균 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("데이터의 갯수 , 질의 갯수를 입력하시오.");
        int n = sc.nextInt();
        int quizn = sc.nextInt();
        int[] arr = new int[n];
//        int[] sumArr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] quizArr = new int[quizn];

        //퀴즈 나옴
        System.out.println("퀴즈 시작");


        for(int i=0; i<quizArr.length; i++){
            int sum = 0;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            for(int j= num1-1; j<num2; j++){
                sum += arr[j];
            }
            System.out.println(sum);
        }




    }

}
