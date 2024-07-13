package collection.set;

import java.util.Arrays;

public class HashStart3 {

    public static void main(String[] args) {
        //입력: 1, 2, 5, 8 , 14, 99
        //배열의 인덱스를 값으로 써버림
        //바로 가져올수있는 O(1)이 된다.
        //BUT 메모리 낭비가 너무 심함..

        Integer[] inputArray = new Integer[100];
        inputArray[0] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
    }
}
