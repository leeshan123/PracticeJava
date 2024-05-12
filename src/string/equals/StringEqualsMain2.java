package string.equals;

public class StringEqualsMain2 {

    //문자열의 비교는 항상 equals 비교로
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1 :" + isSam(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2 :" + isSam(str3, str4));
    }

    private static boolean isSam(String x, String y){
        return x ==y;
    }
}
