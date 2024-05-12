package system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        //현재시간을 가져온다(밀리)
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = "+ currentTimeMillis);

        //현재 시간을 가져온다(나노)
        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = "+ nanoTime);

        //환경 변수를 읽는다
        System.out.println("getenv = "+ System.getenv());

        //시스템 속성을 읽는다
        System.out.println("getProperties = "+ System.getProperties());
        System.out.println("java.version = "+ System.getProperty("java.version"));

        char[] originalArray = {'h','e','l','l','o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = "+ copiedArray);
        System.out.println("Arrays.toString(copiedArray) = "+ Arrays.toString(copiedArray));

        //프로그램 종료
        
    }

}
