package codingtest.session01;

import java.util.Scanner;

public class Session_01_13 {
    //세션 1번의 1번 문제(문자찾기)
    //O

    public int solution(String str, char c){
        int answer =0;

        str = str.toUpperCase();
        //이거 생각안남
        c = Character.toUpperCase(c);

//        for(int i=0; i<str.length(); i++){
//            char strC = str.charAt(i);
//
//            if(strC == c){
//                answer++;
//            }
//
//        }

        //이거 생각안남
        for(char x : str.toCharArray()){
            if(x==c) answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Session_01_13 T = new Session_01_13();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);

        System.out.println(T.solution(str,c));





    }
}
