package InterfaceEX;

public class Multiple_Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat(); // 상속 받은거랑 인터페이스랑 다 불러와야 되서 자신 참조

        dog.sound();
        dog.food();
        dog.attack();
        cat.sound();
        cat.food();
        cat.attack();
    }
}

//interface Animal {
//    void sound();
//}
//interface pet {
//    void food();
//}
//
//class Dog implements Animal, pet {
//    public void sound() {
//        System.out.println("멍멍");
//    }
//    public void food() {
//        System.out.println("개사료");
//    }
//}
//class Cat implements Animal, pet {
//    public void sound() {
//        System.out.println("야옹");
//    }
//    public void food() {
//        System.out.println("츄르");
//    }
//} // 다중 인터페이스 구현
abstract class Animal { // 추상 클래스로 변경
    void sound(){} // 추상 메소드로 변경
}
interface Pet {
    void food();
}
interface Attack {
    void attack();
}

class Dog extends Animal implements Pet, Attack {
    public void sound() {
        System.out.println("멍멍");
    }
    public void food() {
        System.out.println("개사료");
    }
    public void attack() {
        System.out.println("물기");
    }
}
class Cat extends Animal implements Pet, Attack {
    public void sound() {
        System.out.println("야옹");
    }
    public void food() {
        System.out.println("츄르");
    }
    public void attack() {
        System.out.println("할퀴기");
    }
} // 상속 + 인터페이스 + 인터페이스 구현