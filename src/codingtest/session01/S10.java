package codingtest.session01;

import java.util.Arrays;
import java.util.Scanner;

public class S10 {

    public int[] solution(String s,char t){
        int[] answer = new int[s.length()];

        char[] sArr = s.toCharArray();
        int p = 1000;


        for(int i=0; i<sArr.length; i++){
            if(sArr[i] == t){
                p = 0;
                answer[i] =p;
            }else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;

        for(int i=sArr.length-1; i>=0; i--){
            if(sArr[i] == t){
                p = 0;
                answer[i] =p;
            }else {

                p++;
                if(answer[i] > p) answer[i] = p;
            }
        }






        return answer;

    }

    public static void main(String[] args) {
        S10 T = new S10();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char t = scan.next().charAt(0);


        System.out.println(Arrays.toString(T.solution(s,t)));

    }

}
