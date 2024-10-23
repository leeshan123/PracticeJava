package codingtest.session02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S06 {

    public List<Integer> solution(int[] arr){

        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            char[] cArr = String.valueOf(arr[i]).toCharArray();
            String s = "";
            for(int j=cArr.length-1; j>=0; j--){
                s += cArr[j];
            }
            arr[i] = Integer.parseInt(s);
        }

//        for (Integer integer : arr) {
//            System.out.println(integer);
//        }

        for(int i=0; i<arr.length; i++){
            int count = 0;

            for(int j=1; j<=arr[i];j++){
                if(arr[i]%j ==0){
                    count++;
                }
                if(count>= 3){
                    break;
                }
            }
            if(count == 2){
                answer.add(arr[i]);
            }
            count=0;
        }






        return answer;
    }

    public static void main(String[] args) {
        S06 T = new S06();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }


        System.out.println(T.solution(arr));


    }

}