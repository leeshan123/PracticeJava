package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while (true){
            System.out.println("영어 단어를 입력하세요 (종료는 'q'):");
            String key = scan.next();
            if(key.equals("q")) break;
            System.out.println("한글 뜻을 입력하세요:");
            String value = scan.next();
            if(value.equals("q")) break;

            map.put(key,value);


        }
        System.out.println("==단어 입력 단계==");
        while(true){
            System.out.println("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String key = scan.next();
            if(key.equals("q")) break;
            else if (map.containsKey(key)){
                System.out.println(key+"의 뜻: " + map.get(key));
            }else {
                System.out.println(key+"은(는) 사전에 없는 단어입니다.");
            }
        }

    }

}
