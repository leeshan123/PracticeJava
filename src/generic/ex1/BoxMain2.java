package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {

        //다형성으로 문제 해결

        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stirngBox = new ObjectBox();
        stirngBox.set("hello");
        String str = (String) stirngBox.get();
        System.out.println("String = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }




}
