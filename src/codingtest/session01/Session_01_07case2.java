package codingtest.session01;

import java.util.Scanner;

public class Session_01_07case2 {
    //세션 1번의 7번 문제(회문 문자열)
    // X

    public String solution(String str){
        String answer = "YES";
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";

            return answer;
        }

        return answer;
    }


    public static void main(String[] args) {
        Session_01_07case2 T = new Session_01_07case2();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));


    }
}
