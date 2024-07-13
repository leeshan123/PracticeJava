package codingtest.session07;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Session_07_07 {
        //이진트리 레벨탐색(BFS : Breadth-First Search)
        //문제에 없음

    static class Node{
        int data;
        Node lt, rt;
        public Node(int val){
            data = val;
            lt=rt=null;
        }
    }

    Node root;
        public void DFS(Node root){
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            int L = 0;
            while(!Q.isEmpty()){
                int len = Q.size();
                System.out.print(L+" : ");
                for(int i=0; i<len; i++){
                    Node cur = Q.poll();
                    System.out.print(cur.data+" ");
                    if(cur.lt != null) Q.offer(cur.lt);
                    if(cur.rt != null) Q.offer(cur.rt);
                }
                L++;
                System.out.println();
            }


        }


    public int[] solution(int n) {

            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 1;


            for(int i=0; i<n-2; i++){
                arr[i+2] = arr[i] + arr[i+1];
            }




            return arr;
        }


        public static void main(String[] args) {
            Session_07_07 tree = new Session_07_07();
            Scanner scan = new Scanner(System.in);

            tree.root = new Node(1);
            tree.root.lt = new Node(2);
            tree.root.rt = new Node(3);
            tree.root.lt.lt = new Node(4);
            tree.root.lt.rt = new Node(5);
            tree.root.rt.lt = new Node(6);
            tree.root.rt.rt = new Node(7);



            tree.DFS(tree.root);

        }
    }


