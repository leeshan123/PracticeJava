package test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer strInteger = Integer.valueOf(str);
        System.out.println("strInteger = "+ strInteger);

        int integerInt = strInteger.intValue();
        System.out.println("integerInt = "+ integerInt);

        Integer intInteger = Integer.valueOf(integerInt);
        System.out.println("intInteger = "+ intInteger);

    }

}
