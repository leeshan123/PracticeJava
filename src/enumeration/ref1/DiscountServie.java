package enumeration.ref1;



public class DiscountServie {

        public int discount(ClassGrade classGrade, int price){
            int discountPercent = classGrade.getDiscountPercent();

            //10000 * (20 / 100)
           return price * discountPercent /100;
        }

    }


