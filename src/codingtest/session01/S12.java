package codingtest.session01;

import java.util.Scanner;

public class S12 {

    public String solution(int n, String s){
        String answer = "";
        int length = s.length()/n;


        for(int i=0; i<n;i++){
            String tmp = s.substring(0,length).replace('#','1').replace('*','0');
            char c = (char)Integer.parseInt(tmp,2);
            answer += c;
            System.out.println(tmp);
            s = s.substring(length);
        }




        return answer;

    }

    public static void main(String[] args) {
        S12 T = new S12();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();


        System.out.println(T.solution(n,s));

    }

}
