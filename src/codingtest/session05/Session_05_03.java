package codingtest.session05;


import java.util.Scanner;
import java.util.Stack;

public class Session_05_03 {
        //세션 5번의 1번 문제(레인 인형뽑기(카카오))
        //peek() 사용 pop()은 꺼내서 값을 확인

        public int solution(int[][] board, int[] moves){
            int answer =0;
            Stack<Integer> stack = new Stack<>();
            for(int pos : moves){
                for(int i=0; i<board.length; i++){
                    if(board[i][pos-1]!=0){
                        int tmp = board[i][pos-1];
                        board[i][pos-1] =0;
                        if(!stack.isEmpty() && tmp==stack.peek()){
                            answer+=2;
                            stack.pop();
                        }
                        else stack.push(tmp);
                        break;
                    }
                }
            }


            return answer;

        }


        public static void main(String[] args) {
            Session_05_03 T = new Session_05_03();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[][] board = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    board[i][j] = scan.nextInt();
                }
            }
            int m = scan.nextInt();
            int[] moves = new int[m];
            for(int i=0; i<m; i++)
                moves[i] = scan.nextInt();

            System.out.println(T.solution(board,moves));


        }
    }


