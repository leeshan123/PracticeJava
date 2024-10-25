package codingtest.session04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S03 {

    public ArrayList<Integer> solution(int n,int k, int[] arr){

        ArrayList<Integer> answer = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<k; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        answer.add(map.size());

        int lt=0;
        for(int rt=k; rt<n; rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);

            map.put(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
            answer.add(map.size());

        }

        return answer;
    }

    public static void main(String[] args) {
        S03 T = new S03();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n,k,arr));


    }




}