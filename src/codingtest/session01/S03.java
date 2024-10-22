package codingtest.session01;

import java.util.Scanner;

public class S03 {

    public String solution(String str){
        String answer = "";

        String[] splitArr = str.split(" ");
        int max = splitArr[0].length();
        int num = 0;


        for(int i=1; i<splitArr.length; i++){
            if(max < splitArr[i].length()){
                max = splitArr[i].length();
                num = i;
            }
        }

        answer = splitArr[num];


        return answer;
    }

    public static void main(String[] args) {
        S03 T = new S03();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(T.solution(str));

    }

}
