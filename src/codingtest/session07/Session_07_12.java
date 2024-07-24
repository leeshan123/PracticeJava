package codingtest.session07;




import java.util.ArrayList;
import java.util.Scanner;


public class Session_07_12 {
    //12. 경로탐색(DFS)
    //문제에 없음
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;



    public void DFS(int v) {
        if(v==n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv]=0;
                }
            }
        }


    }





    public static void main(String[] args) {
        Session_07_12 T = new Session_07_12();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt(); //노드의 갯수
        m = scan.nextInt(); //간선의 갯수
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<m; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);

    }
}




