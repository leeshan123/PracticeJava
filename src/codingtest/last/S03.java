package codingtest.last;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//섹션9 : 11. 미로의 최단거리 통로(BFS)
public class S03 {
    static class Point{
        public int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] board,dis;



    private void BFS(int x,int y) {
        Queue<Point> Q =new LinkedList<>();
        Q.offer(new Point(x,y));
        board[x][y] =1;
        while (!Q.isEmpty()){
            Point tmp = Q.poll();
            for(int i=0; i<4; i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if(nx>=1 && nx<=7 && ny>=1 && ny <=7 && board[nx][ny]==0){
                    board[nx][ny] = 1;
                    Q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }




    }


    public static void main(String[] args) {
        S03 T = new S03();
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j] = sc.nextInt();
            }
        }

        T.BFS(1,1);
        if(dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);



    }




}