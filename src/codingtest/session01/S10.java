package codingtest.session01;

import java.util.Scanner;

public class S10 {

    public int[] solution(String s,String t){
        int[] answer = new int[s.length()];

        char[] sArr = s.toCharArray();




        return answer;

    }

    public static void main(String[] args) {
        S10 T = new S10();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();


        System.out.println(T.solution(s,t));

    }

}
