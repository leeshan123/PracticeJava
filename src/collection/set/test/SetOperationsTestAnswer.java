package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTestAnswer {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        //합집합은 addAll메서드를 사용하자!
        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);

        //교집합은 retainAll메서드를 사용하자!
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        //차집합은 removeAll()메서드를 사용하자
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);


        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + difference);





    }


}
