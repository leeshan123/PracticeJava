package nested.anoymous;

import nested.local.Printer;

public class AnoymousOuter {
    //인터페이스도 구현할 수 있다.

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;


        Printer printer = new Printer() {
            @Override
            public void print() {

                int value = 0;
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };
        //생성해서 바로 호출 가능
        printer.print();
        System.out.println("printer.class= " + printer.getClass());


    }

    public static void main (String[]args){
        AnoymousOuter main = new AnoymousOuter();
        main.process(2);

    }
}
