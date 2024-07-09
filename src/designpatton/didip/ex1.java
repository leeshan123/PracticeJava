package designpatton.didip;

public class ex1 {

    public static void main(String[] args) {
        new A().go();
    }


}

class B {
    public void go(){
        System.out.println("B의 go()함수");
    }
}

class A {
    public void go(){
        new B().go();
    }
}