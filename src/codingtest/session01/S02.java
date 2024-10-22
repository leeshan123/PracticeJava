package codingtest.session01;

import java.util.Scanner;

public class S02 {

    public String solution(String str){
        String answer = "";

        char[] strArr = str.toCharArray();

        for (char c : strArr) {
            if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }


        return answer;
    }

    public static void main(String[] args) {
        S02 T = new S02();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));

    }

}
