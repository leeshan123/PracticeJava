package collection.set;

import java.util.Arrays;

public class HashStart2 {

    public static void main(String[] args) {
        //입력: 1, 2, 5, 8
        //배열의 인덱스를 값으로 써버림
        //바로 가져올수있는 O(1)이 된다.

        Integer[] inputArray = new Integer[10];
        inputArray[0] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
    }
}
