package thread.start.test;

import org.jetbrains.annotations.NotNull;

import static util.MyLogger.log;

public class StartTest2Main {
    public static void main(String[] args) {
//        CounterRunnable runnable = new CounterRunnable();
//        Thread thread = new Thread(runnable);
//        thread.setName("counter");
        Thread thread = new Thread(new CounterRunnable(), "counter");
        thread.start();
    }

    static class CounterRunnable implements Runnable{

        @Override
        public void run() {
            for(int i=0; i<5; i++){
                log("value:"+ (i+1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
