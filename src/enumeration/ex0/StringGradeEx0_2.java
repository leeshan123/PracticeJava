package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountServie discountServie = new DiscountServie();

        //존재하지 않는 등급
        int vip = discountServie.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        int diamondd = discountServie.discount("DIAMONDD",price);
        System.out.println("DIAMOND 등급의 할인 금액: "+ diamondd);

        int basic = discountServie.discount("BASIC",price);
        int gold = discountServie.discount("GOLD",price);
        int diamond = discountServie.discount("DIAMOND",price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: "+ diamond);
    }

}
