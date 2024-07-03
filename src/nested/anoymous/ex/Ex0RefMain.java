package nested.anoymous.ex;

public class Ex0RefMain {

    public static void hello(String s){
        System.out.println("프로그램 시작");
        System.out.println("Hello "+ s); //변하는 부분
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }
}
