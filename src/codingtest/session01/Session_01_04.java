package codingtest.session01;

import java.util.ArrayList;
import java.util.Scanner;

public class Session_01_04 {
    //세션 1번의 4번 문제(문장 속 단어)
    // X

    public ArrayList<String> solution(int n , String[] str){

        //이걸 생각 못함
        ArrayList<String> answer = new ArrayList<>();

        for(String s : str){
            //스트링 빌드의 reverse사용
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);

        }






        return answer;
    }


    public static void main(String[] args) {
        Session_01_04 T = new Session_01_04();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }
        for(String s : T.solution(n,str)){
            System.out.println(s);
        }

    }
}
