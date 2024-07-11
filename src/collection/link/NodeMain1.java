package collection.link;

public class NodeMain1 {

    public static void main(String[] args) {
        //노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        //구슬꿰기 느낌이라고 생각하자
        System.out.println("모든 노드 탐색하기");
        System.out.println("first.item = " + first.item);
        System.out.println("first.next.item = " + first.next.item);
        System.out.println("first.next.next.item = " + first.next.next.item);

        //while문으로 바꾼거
        Node x = first;
        while (x != null){
            System.out.println(x.item);
            x = x.next;
        }

    }

}
