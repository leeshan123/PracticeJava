package codingtest.session03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S02 {

    public int[] solution(int n,int m,int[] arrN,int[] arrM){
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(arrN[i] == arrM[j]){
                    list.add(arrN[i]);
                }
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        S02 T = new S02();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arrN = new int[n];
        for(int i=0; i<n; i++){
            arrN[i] = scan.nextInt();;
        }
        int m = scan.nextInt();
        int[] arrM = new int[m];
        for(int i=0; i<m; i++){
            arrM[i] = scan.nextInt();;
        }

        System.out.println(Arrays.toString(T.solution(n,m,arrN,arrM)));


    }




}