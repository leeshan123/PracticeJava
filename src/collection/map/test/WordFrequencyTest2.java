package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] textArr = text.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String s : textArr) {
            Integer count = map.getOrDefault(s, 0);
            count++;
            map.put(s, count);

        }
        System.out.println(map);
    }

}
