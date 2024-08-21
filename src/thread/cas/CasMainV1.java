package thread.cas;

import java.sql.SQLOutput;
import java.util.concurrent.atomic.AtomicInteger;

public class CasMainV1 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = " + atomicInteger.get());

        //굉장히 특별한 연산
        boolean reuslt1 = atomicInteger.compareAndSet(0, 1);
        //1. if 기대하는 value 값이 0이면, 2. 값을 1로 변경해
        System.out.println("reuslt1 = " + reuslt1 +", value = "+ atomicInteger.get());

        boolean result2 = atomicInteger.compareAndSet(0, 1);
        System.out.println("reuslt2 = " + result2 +", value = "+ atomicInteger.get());
    }
}
