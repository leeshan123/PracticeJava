package doitcodingtest;

import java.util.Arrays;
import java.util.Scanner;

public class p_002 {
    //평균 구하기
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("시험을 본 과목의 개수를 입력하시오: ");
        int num = sc.nextInt();

        System.out.println("각 과목의 시험 성적을 입력하시오: ");
        int[] arr = new int[num];
        int max = 0;
        int sum = 0;

        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            if(max < arr[i])
                max = arr[i];
        }

        double avg = sum * 100 / max /arr.length;
        System.out.println(avg);



    }

}
