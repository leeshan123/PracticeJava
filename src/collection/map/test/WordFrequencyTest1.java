package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] textArr = text.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String s : textArr) {
            if(!map.containsKey(s)){
                map.put(s,1);
            } else {
                map.put(s,map.get(s)+1);
            }

        }
        for (String key : map.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + map.get(key));
        }
    }

}
