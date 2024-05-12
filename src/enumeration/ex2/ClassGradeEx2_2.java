package enumeration.ex2;



public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountServie discountServie = new DiscountServie();

//        ClassGrade newclassGrade = new ClassGrade();
//        int result = discountServie.discount(newclassGrade, price);
//        System.out.println("newclassGrade등급의 할인 금액:" +result );

        int basic = discountServie.discount(ClassGrade.BASIC, price);
        int gold = discountServie.discount(ClassGrade.GOLD, price);
        int diamond = discountServie.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: "+ basic);
        System.out.println("GOLD 등급의 할인 금액: "+ gold);
        System.out.println("DIAMOND 등급의 할인 금액: "+ diamond);
    }
}
