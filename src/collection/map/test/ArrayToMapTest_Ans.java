package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest_Ans {
    public static void main(String[] args) {
        String[][] productArr = {{"Java","10000"},{"Spring","20000"},{"Jpa","30000"}};

        Map<String,Integer> productMap = new HashMap<>();
        for(String[] product : productArr){
            String key = product[0];
            String value = product[1];
            //여기서 Integer형으로 형변환
            productMap.put(key,Integer.valueOf(value));
        }

        for(String key : productMap.keySet()){
            System.out.println("제품: " + key + ", 가격: " + productMap.get(key));
        }


    }

}
