package designpatton.sington;

public class Singleton2 {

    //아예 처음부터 생성을 해버림.
    //그래서 뱉을때 if문을 안거치게 해버림
    //but 자원낭비
    private final static Singleton2 instance = new Singleton2();

    private Singleton2(){

    }

    public static Singleton2 getInstance(){

        return instance;
    }


}
