package string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        //x001.add(1).add(2).add(3).getValue();
        //x001.add(2).add(3).getValue();
        //x001.add(3).getValue();
        //x001.getValue(); //value = 6
        int result = adder.add(1).add(2).add(3).getValue();


        System.out.println("result = " + result);
        System.out.println("result = " + adder);

    }
}
