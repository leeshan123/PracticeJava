package collection.set.test;

import java.util.HashSet;

public class UniqueNameTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        HashSet<Integer> set = new HashSet<>();
        for (Integer element : inputArr) {
            set.add(element);

        }
        for (Integer element : set) {
            System.out.println(element);
        }


    }

}
