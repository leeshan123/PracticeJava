package time.test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {

        //내풀이
//        LocalDate startDate = LocalDate.of(2024,1,1);
//
//        System.out.println("날짜"+(1)+": "+ startDate);
//
//        for(int i=0; i<4; i++){
//            LocalDate nextDate = startDate.plusDays(14);
//            startDate = nextDate;
//
//            System.out.println("날짜"+(i+1)+": "+ nextDate);
//        }

        //선생님 풀이
        LocalDate startDate = LocalDate.of(2024,1,1);

        for(int i = 0; i<5; i++){
            LocalDate nextDate = startDate.plus(2*i, ChronoUnit.WEEKS);
            System.out.println("날짜 "+(i+1)+": "+ nextDate );

        }


    }


}
