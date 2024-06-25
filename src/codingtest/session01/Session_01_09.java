package codingtest.session01;

import java.util.Scanner;

public class Session_01_09 {
    //세션 1번의 9번 문제(숫자만 추출)
    // X

    public int solution(String str){
        int x = 0;

        for(char c : str.toCharArray()){
            if(c >= '0' && c <= '9') {
                x = x*10 + Integer.parseInt(String.valueOf(c));
            }
        }


        return x;
    }


    public static void main(String[] args) {
        Session_01_09 T = new Session_01_09();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));


    }
}
