package collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        //데이터를 앞 쪽에 추가할 경우 링크드 리스트가 더 좋음.
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();

        //결국 찾기 위해서 O(n)이 된다.
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println(string);

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(1);
        int a = intList.get(2);
        System.out.println(a);


    }

}
