package string.problemsolve;

public class TestString9 {

    public static void main(String[] args) {

        String email = "hello@example.com";
        String[] strArr = email.split("@");

        for(String s : strArr){
            System.out.println(s);
        }
    }

}
