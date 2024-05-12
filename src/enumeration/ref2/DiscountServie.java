package enumeration.ref2;




public class DiscountServie {

        public int discount(Grade grade, int price){
            int discountPercent =grade.getDiscountPercent();
            //10000 * (20 / 100)
           return price * discountPercent /100;
        }

    }


