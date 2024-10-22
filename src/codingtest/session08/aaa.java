package codingtest.session08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class aaa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열를 입력하세요.");
        String s = sc.nextLine();
        System.out.println("문자를 입력하세요");
        char c = sc.nextLine().charAt(0);

        int count =0;
        char[] cArr = s.toLowerCase().toCharArray();
        for (char c1 : cArr) {
            if(c1 == c){
                count++;
            }
        }

        System.out.println(count);




    }
}



