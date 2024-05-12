package enumeration.ref3;




public class EnumRefMain3_4 {

    public static void main(String[] args) {
        int price = 10000;

        Grade[] grades = Grade.values();
        for(Grade grade : grades){
            printDisocunt(grade, price);
        }


    }
    private static void printDisocunt(Grade grade, int price){
        System.out.println(grade.name()+" 등급의 할인 금액: "+ grade.discount(price));
    }
}
