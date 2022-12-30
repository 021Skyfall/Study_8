package instanceOf;

public class InstanceOfEx {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal instanceof Animal); // true
        System.out.println(animal instanceof Object); // true
        System.out.println(animal instanceof Cat);
        // 상속 관계 중 하위클래스 타입을 참조해서 상위 클래스 타입으로 캐스팅 가능한가?
        // 즉, Cat animal = new Animal(); 되냐고
        // Dog과 마찬가지로 false 예상
        // 결과 = false

        Cat cat = new Cat();
        System.out.println(cat instanceof Object); // 최상위 상속자인 Object
        System.out.println(cat instanceof Animal); // 상위 클래스 타입을 참조해서 캐스팅 가능한가
        System.out.println(cat instanceof Cat); // 얜 위에 인스턴스 생성한 거를 물어보는거
//        System.out.println(cat instanceof Dog); // 얘는 아예 오류가 뜨네
        // 당연히 상속 관계 중 하위 클래스는 상위 클래스의 참조 타입으로 캐스팅 가능하고
        // 자바의 최상위 상속자인 Object로도 캐스팅 가능함
        // 자기자신은 말할 것도 없고 <~ 원래 우리가 인스턴스 생성하던 방식
        // 근데 이제 상속 관계 중 같은 하위 클래스 끼리도 캐스팅 되지 않는다는 것을 확인함
    }
}
class Animal {};
class Cat extends Animal{};
class Dog extends Animal{};