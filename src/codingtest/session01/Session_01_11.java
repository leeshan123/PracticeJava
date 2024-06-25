package codingtest.session01;

import java.util.Scanner;

public class Session_01_11 {
    //세션 1번의 11번 문제(문자열 압축)
    // X

    public String solution(String str){
        String answer = "";
        str = str+" ";
        int count = 1;

        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)) count++;
            else{
                answer += str.charAt(i);
                if(count > 1)
                    answer += String.valueOf(count);
                count = 1;
            }

        }



        return answer;
    }


    public static void main(String[] args) {
        Session_01_11 T = new Session_01_11();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(T.solution(str));


    }
}
