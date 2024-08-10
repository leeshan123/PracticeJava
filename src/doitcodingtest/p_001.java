package doitcodingtest;

import java.util.Scanner;

public class p_001 {
    //숫자의 합 구하기
    public static void main(String[] args) {
        System.out.println("숫자의 갯수를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("공백없이 숫자를 입력하세요.");
        String n = sc.next();
        int sum = 0;

        for(int i=0; i< n.length(); i++){
            sum += n.charAt(i)-48;
        }

        System.out.println(sum);



    }

}
