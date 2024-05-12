package test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer strInteger = Integer.valueOf(str);
        System.out.println("strInteger = "+ strInteger);

        int integerInt = strInteger;
        System.out.println("integerInt = "+ integerInt);

        Integer intInteger = integerInt;
        System.out.println("intInteger = "+ intInteger);

    }

}
