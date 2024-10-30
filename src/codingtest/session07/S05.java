package codingtest.session07;

import java.util.Scanner;

public class S05 {
    Node1 root;

    private void DFS(Node1 root) {
        if(root ==null) return;

        else{
            DFS(root.lt);
            DFS(root.rt);
            System.out.print(root.data+" ");
        }


        
    }


    public static void main(String[] args) {
        S05 tree = new S05();
        tree.root = new Node1(1);
        tree.root.lt = new Node1(2);
        tree.root.rt = new Node1(3);
        tree.root.lt.lt = new Node1(4);
        tree.root.lt.rt = new Node1(5);
        tree.root.rt.lt = new Node1(6);
        tree.root.rt.rt = new Node1(7);
        tree.DFS(tree.root);

    }

}

class Node1{
    int data;
    Node1 lt, rt;

    public Node1(int data) {
        this.data = data;
        lt=rt=null;
    }
}