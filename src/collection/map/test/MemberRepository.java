package collection.map.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    Map<String,Member> map;

    public MemberRepository() {
        map = new HashMap<>();
    }

    public void save(Member member) {
        map.put(member.getId(),member);
    }

    public Member findById(String id) {
        Member member = map.get(id);
        return member;

    }

    public Member findByName(String name) {
//        for (String key : map.keySet()) {
//            if(map.get(key).getName().equals(name)){
//                return map.get(key);
//            }
//        }
        Collection<Member> values = map.values();
        for (Member member : values) {
            if(member.getName().equals(name)){
                return member;
            }
        }
        return null;

    }

    public void remove(String id) {
       map.remove(id);
    }
}
