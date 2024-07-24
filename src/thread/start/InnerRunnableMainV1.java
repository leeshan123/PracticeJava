package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV1 {

    public static void main(String[] args) {
        log(":main() start");

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();


        thread.start();

        log(":main() end");
    }
    //여러 군데에서 안쓸 것 같고 이 클래스 안에서만 사용할 것 같아서 중첩클래스로 만듬
    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            log("run()");
        }
    }

}
