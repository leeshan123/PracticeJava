package codingtest.session04;


import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Session_04_05 {
        //세션 4번의 2번 문제( 아나그램(해쉬)))
        // 시간 초과

        public int solution(int[] arr, int n, int k){
            int answer = -1;
            //내림차순 만들라고 함 Collections.reverseOrder()
            TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    for(int l =j+1; l<n; l++){
                        Tset.add(arr[i]+arr[j]+arr[l]);
                    }
                }
            }
            int count =0;
//            Tset.remove(143);
//            System.out.println(Tset.size());
            System.out.println(Tset.first());

            for( int x: Tset){
                count++;
                if(count == k)
                return x;
            }


            return answer;

        }


        public static void main(String[] args) {
            Session_04_05 T = new Session_04_05();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }


            System.out.println(T.solution(arr,n,k));



        }
    }


