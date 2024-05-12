package string.Immutable1;

public class StringImmutable1 {
    public static void main(String[] args) {
        //문자가 합쳐지지않음.
        String str = "hello";
        str.concat(" java");
        System.out.println("str= "+ str);
    }
}
