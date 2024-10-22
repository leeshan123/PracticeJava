package codingtest.session01;

import java.util.Scanner;

public class S05 {

    public String solution(String s){
        String answer = "";

        char[] charArray = s.toCharArray();
        int num;

        if(charArray.length %2 == 0) {
            num = charArray.length/2;
        } else {
            num = charArray.length/2+1;
        }


        for(int i=0; i<num; i++){
            if(Character.isAlphabetic(charArray[i])){
                char temp = charArray[i];
                charArray[i] = charArray[charArray.length-1-i];
                charArray[charArray.length-1-i] = temp;
                System.out.println(temp);
            }
        }

        answer = new String(charArray);


        return answer;

    }

    public static void main(String[] args) {
        S05 T = new S05();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();


        System.out.println(T.solution(s));

    }

}
