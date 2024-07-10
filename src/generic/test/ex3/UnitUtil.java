package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;

public class UnitUtil {

    //바이오유닛으로 상한하기
    public static <T extends BioUnit> T maxHp(T t1, T t2){
        if(t1.getHp() > t2.getHp()){
            return t1;
        }else return t2;
    }
}
