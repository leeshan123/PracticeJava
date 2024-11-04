package codingtest.last;

import java.util.Arrays;
import java.util.Scanner;

//섹션7 : 결정알고리즘, 9. 뮤직비디오
public class S05 {

    public int count(int[] arr , int capacity){
        int cnt = 1, sum = 0;
        for(int x : arr){
            if(sum+x > capacity){
                cnt++;
                sum = x;
            }
            else sum += x;
        }
        return cnt;
    }

    public int solution(int n,int m, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)<=m){
                answer = mid;
                rt = mid-1;
            }
            else lt = mid+1;
        }




        return answer;
    }

    public static void main(String[] args) {
        S05 T = new S05();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
                arr[i]= scan.nextInt();
        }

        System.out.println(T.solution(n,m, arr));




    }




}