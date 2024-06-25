package codingtest.session01;

import java.util.Scanner;

public class Session_01_08 {
    //세션 1번의 8번 문제(회문 문자열)
    // X

    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";



        return answer;
    }


    public static void main(String[] args) {
        Session_01_08 T = new Session_01_08();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));


    }
}
