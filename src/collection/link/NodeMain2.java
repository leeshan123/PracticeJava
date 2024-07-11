package collection.link;

public class NodeMain2 {

    public static void main(String[] args) {
        //노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A"); //x01
        first.next = new Node("B"); //x02
        first.next.next = new Node("C"); //x03

        //구슬꿰기 느낌이라고 생각하자
        System.out.println("모든 노드 탐색하기");
        System.out.println(first);
        System.out.println(first.next);


    }

}
