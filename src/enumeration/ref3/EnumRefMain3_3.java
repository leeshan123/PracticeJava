package enumeration.ref3;




public class EnumRefMain3_3 {

    public static void main(String[] args) {
        int price = 10000;

        printDisocunt(Grade.BASIC, price);
        printDisocunt(Grade.GOLD, price);
        printDisocunt(Grade.DIAMOND, price);


    }
    private static void printDisocunt(Grade grade, int price){
        System.out.println(grade.name()+" 등급의 할인 금액: "+ grade.discount(price));
    }
}
