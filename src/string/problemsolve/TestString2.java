package string.problemsolve;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello","java","jvm","spring","jpa"};
        int sum = 0;

        for(String i : arr){
            sum += i.length();
            System.out.println(i+":"+i.length());
        }

        System.out.println(sum);

    }
}
