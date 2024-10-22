package codingtest.session01;

import java.util.Scanner;

public class S08 {

    public String solution(String s){
        String answer = "";
        s = s.toLowerCase().replaceAll("[^a-z]","");

        if(s.equals(new StringBuilder(s).reverse().toString())){
            answer = "YES";
        }else answer = "NO";




        return answer;

    }

    public static void main(String[] args) {
        S08 T = new S08();
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        System.out.println(T.solution(s));

    }

}
