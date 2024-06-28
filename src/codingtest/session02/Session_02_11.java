package codingtest.session02;


import java.util.Scanner;

public class Session_02_11 {
        //세션 2번의 11번 문제(임시반장)
        // 한번만 카운팅



        public int solution(int n,int[][] arr){
            int answer = 0;
            int max = Integer.MIN_VALUE;

            for(int i=1; i<=n; i++){
                int count =0;
                for(int j=1; j<=n; j++){
                    for(int k=1; k<=5; k++){
                        if(arr[i][k] == arr[j][k]) {
                            count++;
                            break;
                        }
                    }
                }
                if (count > max){
                    max = count;
                    answer = i;
                }
            }

            return answer;
        }


        public static void main(String[] args) {
            Session_02_11 T = new Session_02_11();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[][] arr = new int[n+1][6];

            for(int i=1; i <=n; i++)
                for(int j=1; j <=n; j++)
                    arr[i][j] = scan.nextInt();

            System.out.println(T.solution(n,arr));



        }
    }


