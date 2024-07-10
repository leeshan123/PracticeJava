package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    //제네릭 타입 <<<< 제네릭 메서드 우선순위 더 높음

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReurn(cat);
        //Integer도 들어간다
        Integer integer = hospital.printAndReurn(1);
        System.out.println("returnCat = "+ returnCat );
        System.out.println(integer);
    }
}
