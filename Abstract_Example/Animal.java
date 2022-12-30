package Abstract_Example;

abstract class Animal {
    public String kind;
    public abstract void sound();
    // 추상 메소드가 있으면 하위 클래스에서 해당 메소드를 정의하는 것이 강제됨
}
class Dog extends Animal {
    public Dog() { // 생성자
        this.kind = "포유류";
    }
    public void sound() { // 메소드 오버라이딩으로 상위 클래스의 추상 메소드를 구현했음
        System.out.println("멍멍");
    }
}
class Cat extends Animal {
    public Cat() {
        this.kind = "포유류";
    }
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
class Output {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        cat.sound();
    }
}
// 아 그러니까 상위 클래스 멤버인 kind 와 sound() 는 하위 클래스들이 공통으로 가짐
// ~> 근데 sound() 메소드는 공통으로 무조건 가지는 건 맞는데 출력되어야 하는 값이 다 달라야함
// ~> 그럼 ? 상위 클래스를 통해 sound() 메소드를 강제하고 출력되는 값을 다르게 하고 싶음
// ~> 그래서 상위 클래스를 추상 클래스로 하고 추상 메소드로 sound() 메소드를 집어넣음
// 결과 : 강제 + 다른 값 출력