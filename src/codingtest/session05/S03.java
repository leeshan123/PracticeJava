package codingtest.session05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class S03 {

    //만약 break가 없으면, 같은 열의 다음 줄에 있는 인형도 검사하게 되어,
    // 한 번의 move로 여러 인형을 뽑는 오류가 발생할 수 있습니다.

    public int solution(int n, int[][] board, int m, int[] moves){

        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1] !=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer+= 2;
                        stack.pop();
                    }else stack.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        S03 T = new S03();
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
        for(int i=0; i<m; i++){
            moves[i] = scan.nextInt();
        }


        System.out.println(T.solution(n, board , m, moves));


    }




}