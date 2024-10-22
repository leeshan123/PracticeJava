package codingtest.session01;

import java.util.Scanner;

public class S01 {

    public int solution(String str, char c){
        int answer =0;

        char[] cArr = str.toLowerCase().toCharArray();
        c = Character.toLowerCase(c);

        for (char c1 : cArr) {
            if(c1 == c) answer++;
        }



        return answer;
    }

    public static void main(String[] args) {
        Session_01_01 T = new Session_01_01();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);

        System.out.println(T.solution(str,c));

    }

}
