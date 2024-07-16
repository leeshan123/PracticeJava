package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        //합집합
        Set<Integer> unionSet = new HashSet<>();
        for (Integer e : set1) {
            unionSet.add(e);

        }
        for (Integer e : set2) {
            unionSet.add(e);

        }
        System.out.println("합집합: " + unionSet);

        //교집합
        Set<Integer> kyoSet = new HashSet<>();
        for (Integer e : set1) {
            if(set2.contains(e)){
                kyoSet.add(e);
            }

        }
        System.out.println("교집합: " + kyoSet);


        //차집합
        Set<Integer> carSet = new HashSet<>();
        for (Integer e : set1) {
            if(!set2.contains(e)){
                carSet.add(e);
            }
        }

        System.out.println("차집합: " + carSet);





    }


}
