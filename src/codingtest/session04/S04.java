package codingtest.session04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S04 {

    public int solution(String s, String t){

        int answer = 0;

        Map<Character, Integer> sm = new HashMap<>();
        Map<Character, Integer> tm = new HashMap<>();

        for(char c : t.toCharArray()){
            tm.put(c,tm.getOrDefault(c,0)+1);
        }
        int length = t.length()-1;
        for(int i=0; i<length; i++){
            sm.put(s.charAt(i),sm.getOrDefault(s.charAt(i),0)+1);
        }
        int lt = 0;
        for(int rt =length; rt<s.length(); rt++){
            sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt),0)+1);
            if(sm.equals(tm)) answer++;
            sm.put(s.charAt(lt),sm.get(s.charAt(lt))-1);
            if(sm.get(s.charAt(lt))==0) sm.remove(s.charAt(lt));
            lt++;
        }




        return answer;
    }

    public static void main(String[] args) {
        S04 T = new S04();
        Scanner scan = new Scanner(System.in);
        String  s = scan.next();
        String  t = scan.next();

        System.out.println(T.solution(s,t));


    }




}