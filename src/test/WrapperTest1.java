package test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));

    }

}
