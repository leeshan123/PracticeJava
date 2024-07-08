package designpatton.sington;

public class YunhaSync {
    //멀티 쓰레드일때 환경을 고려해야한다.
    //synchronized을 넣어줘야한다.
    private static String yunha = "오르트구름";

    public static void main(String[] args) {
        YunhaSync a = new YunhaSync();
        new Thread(() -> {
            for (int i=0; i< 10; i++){
                a.say("사건의 지평선");
            }
        }).start();

        new Thread(() -> {
            for (int i=0; i< 10; i++){
                a.say("오르트 구름");
            }
        }).start();

    }

    public synchronized void say(String song){
        yunha = song;
        try {
            long sleep = (long) (Math.random() * 100);
            Thread.sleep(sleep);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        if(!yunha.equals(song)){
            System.out.println(song +" | "+ yunha);
        }

    }
}


