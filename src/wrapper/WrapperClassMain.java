package wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //언제 삭제될지 모름.
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " +intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = "+ longValue);

        System.out.println("비교");
        System.out.println("==: " +(newInteger == integerObj));
        System.out.println("equlas: " +(newInteger.equals(integerObj)));
    }
}
