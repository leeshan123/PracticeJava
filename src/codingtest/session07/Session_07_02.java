package codingtest.session07;



import java.util.Scanner;

public class Session_07_02 {
        //재귀함수를 이용한 이진수 출력
        //문제에 없음

        public void DFS(int n){

            if(n==0) return;
            else {
                DFS(n/2);
                System.out.print(n%2);
            }

        }


        public String solution(int n) {

            String answer = "";




            return answer;
        }


        public static void main(String[] args) {
            Session_07_02 T = new Session_07_02();
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            String s = "";
            T.DFS(n);

        }
    }


