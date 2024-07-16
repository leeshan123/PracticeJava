package collection.set.test;

import java.util.*;

public class UniqueNameTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Set<Integer> set  = new LinkedHashSet<>(List.of(inputArr));

        //둘이 거의 똑같은 기능을 하고 있다고 생각하면 됨
        //T ...a 는 배열로 변한다.
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = List.of(1,2,3);

        for (Integer element : inputArr) {
            set.add(element);

        }
        for (Integer element : set) {
            System.out.println(element);
        }


    }

}
