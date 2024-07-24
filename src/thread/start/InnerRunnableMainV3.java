package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV3 {

    public static void main(String[] args) {
        log(":main() start");

        //변수를 바로 넣어버림
        //바로 직접 넣어버리는 것

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        });
        thread.start();

        

        log(":main() end");
    }



}
