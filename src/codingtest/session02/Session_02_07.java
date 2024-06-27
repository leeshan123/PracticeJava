package codingtest.session02;


import java.util.Scanner;

public class Session_02_07 {
        //세션 2번의 7번 문제(점수계산)
        // 시간오버


        public int solution(int n){
            int answer = 0;
            int[] ch = new int[n+1];
            for(int i=2; i<=n; i++){
                if(ch[i]==0){
                    answer++;
                    //배수에 대해서 다 1을 넣어줌.
                    for(int j=i; j<=n; j=j+i) ch[j]=1;
                }
            }


            return answer;
        }


        public static void main(String[] args) {
            Session_02_07 T = new Session_02_07();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            System.out.println(T.solution(n));

        }
    }


