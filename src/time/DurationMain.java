package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {

    public static void main(String[] args) {

        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = "+ lt);

        //계산에 사용
        LocalTime plusTime = lt.plus(duration);
        System.out.println("더한 시간: "+plusTime);

        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        System.out.println("차이: "+ between.getSeconds()+"초");
        //부분을 줌 남은(60분이 1시간으로 갔으니까 0분)
        System.out.println("근무시간: "+ between.toHours()+"시간"+ between.toMinutesPart()+"분");
        //전체 시간을 줌 (60분)
        System.out.println("근무시간: "+ between.toHours()+"시간"+ between.toMinutes()+"분");



    }
}
