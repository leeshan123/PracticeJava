package codingtest.session01;

import java.util.Scanner;

public class S07 {

    public String solution(String s){
        String answer = "";

        s = s.toLowerCase();
        String reverse = new StringBuilder(s).reverse().toString();

        if(s.equals(reverse)){
            answer = "YES";
        }else answer = "NO";


        return answer;

    }

    public static void main(String[] args) {
        S07 T = new S07();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));

    }

}
