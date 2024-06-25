package codingtest.session01;

import java.util.Scanner;

public class Session_01_06 {
    //세션 1번의 6번 문제(중복 문자 제거)
    // X

    public String solution(String str){
        String answer = "";

        for(int i =0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i)
                answer += str.charAt(i);
        }






        return answer;
    }


    public static void main(String[] args) {
        Session_01_06 T = new Session_01_06();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));


    }
}
