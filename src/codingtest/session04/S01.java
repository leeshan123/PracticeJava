package codingtest.session04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S01 {

    public char solution(int n,String s){
        char answer= ' ';

        char[] cArr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(!map.containsKey(cArr[i])){
                map.put(cArr[i],1);
            }else map.put(cArr[i], map.get(cArr[i])+1);

        }

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(map.get(key)> max){
                max = map.get(key);
                answer = key;
            }

        }



        return answer;
    }

    public static void main(String[] args) {
        S01 T = new S01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();


        System.out.println(T.solution(n,s));


    }




}