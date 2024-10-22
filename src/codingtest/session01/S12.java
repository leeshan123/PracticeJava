package codingtest.session01;

import java.util.Scanner;

public class S12 {

    public String solution(int n, String s){
        String answer = "";
        int length = s.length()/n;
        String[] arr = new String[n];
        int num =0;

        for(int i=0; i<arr.length;i++){
            arr[i] = s.substring(i*length,(i+1)*length);
            char[] charArr = arr[i].toCharArray();
            for(int j=0; j<charArr.length; j++){
                if(charArr[i] == '#'){
                    num += (int)Math.pow(2,charArr.length-j-2);
                }
            }
            System.out.println(num);
            answer += (char)num;
            num = 0;

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
