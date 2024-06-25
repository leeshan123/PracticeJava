package codingtest.session01;

import java.util.Scanner;

public class Session_01_07 {
    //세션 1번의 7번 문제(회문 문자열)
    // O

    public String solution(String str){

        String reverseStr = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(reverseStr)){
            return "YES";
        }else return "NO";



    }


    public static void main(String[] args) {
        Session_01_07 T = new Session_01_07();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));


    }
}
