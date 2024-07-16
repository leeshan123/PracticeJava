package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product, int count) {
        if(!cartMap.containsKey(product)){
            cartMap.put(product,count);
        }else {
            int oldValue = cartMap.get(product);
            cartMap.put(product,oldValue+count);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: "+ product +" 수량: "+ cartMap.get(product));
        }
    }

    public void minus(Product product, int count) {
        if(!cartMap.containsKey(product)){
            cartMap.put(product,count);
        }else {
            int oldValue = cartMap.get(product);
            cartMap.put(product,oldValue-count);
        }
    }
}
