package collection.map.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java","10000"},{"Spring","20000"},{"Jpa","30000"}};

        Map<String,String> map = new HashMap<>();
        for(int i=0; i<productArr.length; i++){
            map.put(productArr[i][0],productArr[i][1]);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("제품: " + key + ", 가격: "+ value);

        }

    }

}
