package codingtest.session04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S01_2 {

    public char solution(int n,String s){
        char answer= ' ';
        HashMap<Character,Integer> map = new HashMap<>();

        char[] cArr = s.toCharArray();
        for (char c : cArr) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        S01_2 T = new S01_2();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();


        System.out.println(T.solution(n,s));


    }




}