package collection.utils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); //자바5
        List<Integer> list4 = List.of(); // 자바9

        System.out.println("list3 = " + list3.getClass()); //Collections$EmptyList
        System.out.println("list4 = " + list4.getClass()); //ImmutableCollections$ListN

        Integer[] arr = {1,2,3,4,5};
        List<Integer> arrList = Arrays.asList(arr);
        List<Integer> arr1 = List.of(arr); //얘는 새로운 배열 자체를 만들어버림

        arrList.set(0,100); // arr과 arrList 둘다 같이 바뀜.
        System.out.println("arr = " + Arrays.toString(arr)); //[100, 2, 3, 4, 5]
        System.out.println("arrList = " + arrList); //[100, 2, 3, 4, 5]
        System.out.println("arr1 = " + arr1); //[1, 2, 3, 4, 5]


    }

}
