package codingtest.session01;

import java.util.Scanner;

public class Session_01_02 {
    //세션 1번의 2번 문제(대소문자 변환)
    //O

    public String solution(String str){
        String answer ="";

        for(char x : str.toCharArray()){

           if(x>=97 && x<=122) answer +=(char)(x-32);
           else answer += (char)(x+32);

        }

        return answer;
    }


    public static void main(String[] args) {
        Session_01_02 T = new Session_01_02();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();


        System.out.println(T.solution(str));





    }
}
