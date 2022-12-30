package Polymorphism;

class Human {
    public void human() {
        System.out.println("나는 휴먼입니다.");
    }
}
class Man extends Human {
    public void human() { // 상위 클래스 메소드 오버라이드
        System.out.println("나는 남자입니다.");
    }
}
class Woman extends Human {
    public void human() { // 상위 클래스 메소드 오버라이드
        System.out.println("나는 여자입니다.");
    }
}

public class Person {
    public static void main(String[] args) {
//      참조_변수_타입 참조변수이름 = new 객체_타입()
        Human human = new Human(); // 객체 타입과 참조변수 타입의 일치
        Human man = new Man();
        Human woman = new Woman(); // 객체 타입과 참조변수 타입 불일치 ~> 근데 오류가 안남
        //이건 전에 상속 관계였을 때도 객체 타입이랑 참조변수 타입 불일치해도 돌아갔던게
        // 어차피 상속관계인 하위 클래스는 상위 클래스가 가진 멤버 수와 같고 추가적으로 하위 클래스 자신의
        // 멤버도 포함하는 거기 때문에 참조변수 타입은 상위, 하위 뭘해도 오류가 안남
        // 왜냐면 멤버수가 상위 <= 하위 일거잖음, 그럼 생성될 인스턴스의 기능을 줄이기만 하는거라
        // 가능함 혹은 걍 상위랑 하위랑 멤버수가 같아도 ㄱㅊ고
        // 근데 반대로 생성될 객체의 타입을 바꾸면? 참조하려는 변수의 멤버 수가 더 많아서
        // 오류나는 것임 만약 멤버수가 같아도 오류남 참조 불가라고 ~> 이거는 근데
//        Woman woman1 = new Human();
        // 간단하게 하위 클래스 자신으로 인스턴스 생성? O ~> 원래하던 방식
        // 상위클래스를 참조해서 하위클래스 인스턴스 생성? O ~> 상속관계라 어차피 참조할 멤버랑 자기랑 가지고있는 멤버가 무조건 같기 때문
        // 하위클래스를 참조해서 상위클래스 인스턴스 생성? X ~> 위와 같은 명제가 다를 수 있기 때문

        human.human();
        man.human();
        woman.human();

    }
}