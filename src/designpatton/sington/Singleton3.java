package designpatton.sington;

public class Singleton3 {

    //아예 처음부터 생성을 해버림.
    //정적 블록 할당
    private static Singleton3 instance = null;


    static {
        instance = new Singleton3();
    }

    private Singleton3(){

    }

    public static Singleton3 getInstance(){

        return instance;
    }


}
