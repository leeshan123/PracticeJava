package codingtest.session04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S02 {

    public String solution(String s1,String s2){


        Map<Character,Integer> map = new HashMap<>();

        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : s2.toCharArray()){
            if(!map.containsKey(c) || map.get(c) ==0) return "NO";
            map.put(c,map.get(c)-1);
        }



        return "YES";
    }

    public static void main(String[] args) {
        S02 T = new S02();
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();


        System.out.println(T.solution(s1,s2));


    }




}