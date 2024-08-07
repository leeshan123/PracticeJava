package designpatton.factory;

    enum CoffeeType {
        LATTE,
        ESPRESSO
    }
    abstract class Coffee{
        protected  String name;

        public String getName(){
            return name;
        }
    }

    class Latte extends Coffee {
        public Latte() {
            name = "latte";
        }
    }

    class Espresso extends Coffee {
        public Espresso() {
            name = "Espresso";
        }
    }

    class CoffeeFactory{
        public static Coffee createCoffee(CoffeeType type){
            switch (type){
                case LATTE:
                    return new Latte();
                case ESPRESSO:
                    return new Espresso();
                default:
                    throw new IllegalArgumentException("커피가 아니다" + type);
            }
        }
    }

public class factory {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee(CoffeeType.LATTE);
        System.out.println(coffee.getName());
    }


    }



