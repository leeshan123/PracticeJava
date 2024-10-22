package codingtest.session01;

import java.util.ArrayList;
import java.util.Scanner;

public class S04_02 {

    public ArrayList<String> solution(String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);

        }
        return answer;

    }

    public static void main(String[] args) {
        S04_02 T = new S04_02();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.next();
        }

        ArrayList<String> solution = T.solution(arr);
        for (String s : solution) {
            System.out.println(s);
        }

    }

}
