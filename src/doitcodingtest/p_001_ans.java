package doitcodingtest;

import java.util.Scanner;

public class p_001_ans {
    //숫자의 합 구하기
    public static void main(String[] args) {
        System.out.println("숫자의 갯수를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("공백없이 숫자를 입력하세요.");
        String n = sc.next();

        //여기서 char형으로 배열을 만듬
        char[] cNum = n.toCharArray();
        int sum = 0;
        for(int i=0; i< cNum.length; i++){
            sum += cNum[i] - '0'; // '0'이 더 직관적이다.
        }
        System.out.println(sum);



    }

}
