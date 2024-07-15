package codingtest.session07;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Session_07_08 {
        //8. 송아지 찾기1(BFS)
        //문제에 없음
    int answer = 0;
    int[] dis = {1,-1,5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    private int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L =0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                int x = Q.poll();
                for(int j=0; j<3; j++){
                    int nx = x + dis[j];
                    if(x==e) return L;
                    if(nx>=1 && nx <=10000 && ch[nx]==0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }

        return -1;
    }





        public static void main(String[] args) {
            Session_07_08 T = new Session_07_08();
            Scanner scan = new Scanner(System.in);

            int s = scan.nextInt(); //나의 위치
            int e = scan.nextInt(); //송아지의 위치
            System.out.println(T.BFS(s,e));

        }


}


