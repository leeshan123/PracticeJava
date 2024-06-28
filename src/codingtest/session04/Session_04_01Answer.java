package codingtest.session04;


import java.util.HashMap;
import java.util.Scanner;

public class Session_04_01Answer {
        //세션 4번의 1번 문제( 학급 회장(해쉬))
        // 시간 초과

        public char solution(int n,String s){
            char answer = ' ';
            HashMap<Character,Integer> map = new HashMap<>();
            for(char x : s.toCharArray()){
                map.put(x,map.getOrDefault(x,0)+1);

            }
            System.out.println(map.containsKey('F'));
            System.out.println(map.remove('A'));
            System.out.println(map.size());
            int max = Integer.MIN_VALUE;
            for(char key : map.keySet()){
//                System.out.println(x + " " + map.get(x));
                if(map.get(key)> max){
                    max = map.get(key);
                    answer = key;
                }
            }



            return answer;
        }


        public static void main(String[] args) {
            Session_04_01Answer T = new Session_04_01Answer();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            String s = scan.next();



            System.out.println(T.solution(n,s));


        }
    }


