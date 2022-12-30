package InterfaceEX;

public class Why_Interface {
    public static void main(String[] args) {
        User user = new User();
        user.callTypeNum(new Type1());
        user.callTypeNum(new Type2());
    }
}
interface Call {
    void call();
}
class User {
    public void callTypeNum(Call call) { // 이것이 다형성
        call.call();
    }
}
class Type1 implements Call{
    public void call() { // 인터페이스에 의해 추상화 된 메소드를 각 하위 클래스에서 정의해줘야함
        System.out.println("나는 Type1입니다.");
    }
}
class Type2 implements Call {
    public void call() {
        System.out.println("나는 Type2입니다.");
    }
}
// 인터페이스와 다형성을 사용함
// 내가 생각하고 있는게 다형성이 맞는지 확인햇다
// 걍 딱 하나의 클래스에서 나머지 클래스들 호출하는? 뭔가 그런 느낌이 다형성 맞는듯
// 지금 위에 User 클래스의 매개 변수 값을 각 클래스로 넣으면 그때마다 값이 달라지잖음
// interface 로 User 의 매개변수를 나머지 클래스로 통일되게 잡아주고
// call() 메소드를 앞서 추상화 시킴으로서 User 클래스를 제외한 하위 클래스들에 강제하도록 만들어서
// 오류 날일 없게 만들고 필요 불필요 선택 쉽게 해주고, 코드 변경도 쉬워진듯?