package designpatton.sington;

public class Singleton4 {

    //아예 처음부터 생성을 해버림.
    //아예 클래스를 만들어 불필요한 자원할당을 막음.


    private static class singleInstanceHolder{
        private static final Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance(){

        return singleInstanceHolder.instance;
    }


}
