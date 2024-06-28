package codingtest.session02;


import java.util.Scanner;

public class Session_02_10 {
        //세션 2번의 10번 문제(봉우리)
        // 시간오버

        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};


        public int solution(int n,int[][] arr){
            int answer = 0;

            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; j++) {
                    boolean flag = true;
                    for(int k=0; k<4; k++){
                        int nx = i+dx[k];
                        int ny = j+dy[k];
                        if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) answer++;
                }
            }






            return answer;
        }


        public static void main(String[] args) {
            Session_02_10 T = new Session_02_10();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[][] arr = new int[n][n];

            for(int i=0; i <n; i++)
                for(int j=0; j <n; j++)
                    arr[i][j] = scan.nextInt();

            System.out.println(T.solution(n,arr));



        }
    }


