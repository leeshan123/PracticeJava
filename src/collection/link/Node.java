package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item){
        this.item = item;
    }

    //IDE 생성 toString()
//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }
//    A -> B -> C로 하고 싶음
    @Override
    public String toString() {
        //반복문 안에서 문자를 더하기 때문에 스트링 빌더를 사용
        StringBuilder sb = new StringBuilder();
        Node x = this; //일단 자기자신넣음
        sb.append("[");
        while(x !=null){
            sb.append(x.item);
            if(x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");

        return sb.toString();
    }
}
