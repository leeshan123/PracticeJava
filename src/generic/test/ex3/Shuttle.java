package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    private T unit;


    public void in(T t) {
        unit = t;
    }

    public T out() {
        return unit;
    }


    public void showInfo() {
        //상한을 걸어야 getName을 호출 할 수 있음.
        System.out.println("이름: " + unit.getName()+", HP: " + unit.getHp());
    }
}
