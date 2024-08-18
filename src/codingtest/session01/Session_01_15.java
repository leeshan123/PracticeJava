package codingtest.session01;

import java.util.Scanner;

public class Session_01_15 {
    //세션 1번의 10번 문제(가장 짧은 문자거리)
    // X

    public int[] solution(String str, char c){
        int[] answer = new int[str.length()];
        int p = 1000;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c){
               p =0;
               answer[i] = p;
            }
            else {
                p++;
                answer[i]=p;
            }

        }
        p = 1000;
        for(int i= str.length()-1; i>=0; i--){
            if(str.charAt(i)==c){
                p =0;
            }
            else{
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Session_01_15 T = new Session_01_15();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        for(int x : T.solution(str, c)){
            System.out.print(x+" ");
        }


    }
}
