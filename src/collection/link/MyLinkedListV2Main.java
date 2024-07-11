package collection.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        //데이터를 앞 쪽에 추가할 경우 링크드 리스트가 더 좋음.
        MyLinkedListV2 list = new MyLinkedListV2();

        //결국 찾기 위해서 O(n)이 된다.
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //첫 번째 항목에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0,"d"); //0(1)
        System.out.println(list);

        System.out.println("첫 번째 항목에 삭제");
        list.remove(0); //O(1)
        System.out.println(list);

        //중간 항목에 추가,삭제
        System.out.println("중간 항목에 추가");
        list.add(1,"e"); // O(n)
        System.out.println(list);

        System.out.println("중간 항목에 삭제");
        list.remove(1); // O(n)
        System.out.println(list);



    }

}
