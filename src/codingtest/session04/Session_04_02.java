package codingtest.session04;


import java.util.HashMap;
import java.util.Scanner;

public class Session_04_02 {
        //세션 4번의 2번 문제( 아나그램(해쉬)))
        // 시간 초과

        public String solution(String s1,String s2){
            String answer = "YES";
            HashMap<Character,Integer> map = new HashMap<>();


            for(char key : s1.toCharArray()){
                map.put(key, map.getOrDefault(key,0)+1);
            }

            //이게 핵심
            for( char key : s2.toCharArray()){
                if(!map.containsKey(key) || map.get(key) ==0){
                    return "NO";
                }else
                    map.put(key,map.get(key)-1);
            }

            return answer;

        }


        public static void main(String[] args) {
            Session_04_02 T = new Session_04_02();
            Scanner scan = new Scanner(System.in);
            String s1 = scan.next();
            String s2 = scan.next();



            System.out.println(T.solution(s1,s2));


        }
    }


