package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        //형변환이 필요함
        Integer result = (Integer) GenericMethod.objMethod(10);

        //타입 인자 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        int x = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        String s = GenericMethod.<String>genericMethod("hello");
//        GenericMethod.<String>numberMethod("gd"); number가 아니라서 오류남

        //타입인자를 안줘도 자바의 컴파일러가 눈치껏 해준다.
        int x1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);


    }

}
