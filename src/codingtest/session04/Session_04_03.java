package codingtest.session04;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Session_04_03 {
        //세션 4번의 2번 문제( 아나그램(해쉬)))
        // 시간 초과

        public ArrayList<Integer> solution(int n, int k, int[] arr){
            ArrayList<Integer> answer = new ArrayList<>();
            HashMap<Integer, Integer> HM = new HashMap<>();

            for(int i=0; i<k-1; i++){
                HM.put(arr[i],HM.getOrDefault(arr[i],0)+1);
            }
            int lt =0;
            for(int rt=k-1; rt<n; rt++){
                HM.put(arr[rt],HM.getOrDefault(arr[rt],0)+1);
                answer.add(HM.size());
                HM.put(arr[lt],HM.get(arr[lt])-1);
                if(HM.get(arr[lt])==0){
                    HM.remove(arr[lt]);
                }
                lt++;
            }

            return answer;

        }


        public static void main(String[] args) {
            Session_04_03 T = new Session_04_03();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }

            for(int x : T.solution(n,k,arr))
                System.out.print(x+" ");



        }
    }


