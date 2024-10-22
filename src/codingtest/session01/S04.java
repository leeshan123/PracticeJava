package codingtest.session01;

import java.util.Scanner;

public class S04 {

    public String[] solution(String[] str){
        String[] answer = new String[str.length];

        for(int i=0; i<str.length; i++){
            answer[i] = "";
            for(int j=str[i].length()-1; j>=0; j--){
                answer[i] += str[i].charAt(j);
            }
        }


        return answer;

    }

    public static void main(String[] args) {
        S04 T = new S04();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.next();
        }

        String[] solution = T.solution(arr);
        for (String s : solution) {
            System.out.println(s);
        }

    }

}
