package codingtest.session07;




import java.util.Scanner;


public class Session_07_09 {
        //9. Tree 말단노드까지의 까장 짧은 경로(DFS)
        //문제에 없음


        Node root;

        public int DFS(int L, Node root){
            if(root.lt == null && root.rt ==null){
                return L;
            }else {
                return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
            }


        }



        public static void main(String[] args) {
            Session_07_09 tree = new Session_07_09();
            Scanner scan = new Scanner(System.in);

            tree.root = new Node(1);
            tree.root.lt = new Node(2);
            tree.root.rt = new Node(3);
            tree.root.lt.lt = new Node(4);
            tree.root.lt.rt = new Node(5);
            System.out.println(tree.DFS(0,tree.root));


        }

    static class Node{
        int data;
        Node lt, rt;
        public Node(int val){
            data = val;
            lt=rt=null;
        }
    }


}



