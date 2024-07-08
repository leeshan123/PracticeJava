package designpatton.sington;

public class Singleton5 {

    //5번째 방법
    //volatile

    private volatile Singleton5 instance;

    private Singleton5(){

    }

    public  Singleton5 getInstance(){

        if(instance == null){
            synchronized (Singleton5.class){
                if(instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }


}
