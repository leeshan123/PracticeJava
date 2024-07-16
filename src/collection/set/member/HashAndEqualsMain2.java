package collection.set.member;

import collection.set.MyHashSetV2;

import java.sql.SQLOutput;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        //중복 등록(Set의 장점이 사라짐)
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //자바가 기본으로 제공하는 equals는 ==비교다.

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        int ref1 = System.identityHashCode(m1);
        System.out.println("ref1 = " + ref1);
        int ref2 = System.identityHashCode(m2);
        System.out.println("ref2 = " + ref2);


        //검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contain = set.contains(searchValue);
        System.out.println("contain = " + contain);
    }


}
