package codingtest.session07;




import java.sql.SQLOutput;
import java.util.Scanner;


public class Session_07_11 {
    //12. 경로탐색(DFS)
    //문제에 없음
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;



    public void DFS(int v) {
        if(v==n) answer++;
        else {
            for(int i=1; i<=n; i++){
                if(graph[v][i] == 1 && ch[i]==0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }





    public static void main(String[] args) {
        Session_07_11 T = new Session_07_11();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt(); //노드의 갯수
        m = scan.nextInt(); //간선의 갯수
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);

    }
}




