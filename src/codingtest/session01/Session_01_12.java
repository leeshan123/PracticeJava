package codingtest.session01;

import java.util.Scanner;

public class Session_01_12 {
    //세션 1번의 12번 문제(암호)
    // O

    public String solution(int n , String str){
        String answer = "";

        String[] strings = new String[n];

        for(int i=0; i<n; i++){
            strings[i] = str.substring(i*7,(i+1)*7).replace("#","1").replace("*","0");
        }

        for(String s : strings){
            char x = (char)Integer.parseInt(s,2);
            answer += x;
        }




        return answer;
    }


    public static void main(String[] args) {
        Session_01_12 T = new Session_01_12();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        System.out.println(T.solution(n,str));

    }
}
