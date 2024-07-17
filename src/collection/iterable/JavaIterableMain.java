package collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        printAll(iterator);
        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer> setIter = set.iterator();
        printAll(setIter);
        foreach(set);



    }

    private static void printAll(Iterator<Integer> iterator){
        System.out.println("iterator = "+iterator.getClass());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static void foreach(Iterable<Integer> iterator){
        System.out.println("iteralbe = " + iterator.getClass());
        for (Integer i : iterator) {
            System.out.println(i);

        }
    }

}
