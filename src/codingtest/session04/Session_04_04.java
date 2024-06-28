package codingtest.session04;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Session_04_04 {
        //세션 4번의 2번 문제( 아나그램(해쉬)))
        // 시간 초과

        public int solution(String a, String b){
            int answer = 0;
            HashMap<Character,Integer> am = new HashMap<>();
            HashMap<Character,Integer> bm = new HashMap<>();
            for(char key : b.toCharArray()){
                bm.put(key,bm.getOrDefault(key,0)+1);
            }
            int L = b.length()-1;

            for(int i=0; i<L; i++) am.put(a.charAt(i),am.getOrDefault(a.charAt(i),0)+1);
            int lt = 0;
            for(int rt=L; rt<a.length(); rt++){
                am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0)+1);
                if(am.equals(bm)) answer++;
                am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
                if(am.get(a.charAt(lt))==0)
                    am.remove(a.charAt(lt));
                lt++;
            }








            return answer;

        }


        public static void main(String[] args) {
            Session_04_04 T = new Session_04_04();
            Scanner scan = new Scanner(System.in);
            String s1 = scan.next();
            String s2 = scan.next();



            System.out.println(T.solution(s1,s2));



        }
    }


