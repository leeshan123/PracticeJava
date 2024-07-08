package codingtest.session07;



import java.util.Scanner;

public class Session_07_03 {
        //재귀함수를 이용한 펙토리얼
        //문제에 없음

        public int DFS(int n){
            if(n==1) return 1;
            else return n*DFS(n-1);
        }


        public String solution(int n) {

            String answer = "";




            return answer;
        }


        public static void main(String[] args) {
            Session_07_03 T = new Session_07_03();
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();

            System.out.println(T.DFS(n));

        }
    }


