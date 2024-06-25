package codingtest.session01;

import java.util.Scanner;

public class Session_01_03 {
    //세션 1번의 3번 문제(문장 속 단어)
    // O

    public String solution(String str){
        String answer = "";

        String[] strArr = str.split(" ");
        int len = 0;

        for(String s : strArr){
           if(len < s.length()){
               answer = s;
               len = s.length();
           }

        }

        return answer;
    }


    public static void main(String[] args) {
        Session_01_03 T = new Session_01_03();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        System.out.println(T.solution(str));





    }
}
