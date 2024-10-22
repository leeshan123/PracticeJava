package codingtest.session01;

import java.util.Scanner;

public class S11 {

    public String solution(String s){
        String answer = "";
        s = s+ " ";
        int count = 1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) count++;
            else{
                answer += s.charAt(i);
                if(count > 1) answer += String.valueOf(count);
                count = 1;
            }
        }


        return answer;

    }

    public static void main(String[] args) {
        S11 T = new S11();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));

    }

}
