package codingtest.session01;

import java.util.Scanner;

public class Session_01_03case2 {
    //세션 1번의 3번 문제(문장 속 단어)
    // O

    public String solution(String str){
        String answer = "";

        String[] strArr = str.split(" ");
        int m = Integer.MIN_VALUE, pos;
        while ((pos=str.indexOf(" "))!=-1){
            String tmp = str.substring(0,pos);
            System.out.println(tmp);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            str=str.substring(pos+1);

        }

        return answer;
    }


    public static void main(String[] args) {
        Session_01_03case2 T = new Session_01_03case2();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        System.out.println(T.solution(str));





    }
}
