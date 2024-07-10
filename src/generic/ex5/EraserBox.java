package generic.ex5;

public class EraserBox<T> {
    //왜 컴파일 오류가 나냐?
    //실행 시점에 T는 다 없어지고 오브젝트로 바뀌어 버리기 떄문에 안된다.
    //항상 참이 나와버림

    public boolean instanceCheck(Object param){
//        return param instanceof T;
        return false;
    }

    public void create(){
//        return new T();
    }
}
