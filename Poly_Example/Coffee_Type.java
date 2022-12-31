package Poly_Example;

public class Coffee_Type {
    int price; // 필드 멤버

    public Coffee_Type(int price) {
        this.price = price;
    }
}
// 이거 하위에 super 메소드 없으면 기본 생성자 생성해야함

class Americano extends Coffee_Type {
    public Americano() {
        super(6000);
    }
    public String toString() { // Object 클래스의 toString() 메소드로 오버라이드
        return "아메리카노";
    };
};
class Latte extends Coffee_Type {
    public Latte() {
        super(7000);
    }
    public String toString() {
        return "라떼";
    };
};

class Customer {
    int money = 50000;
    
//    void buyCoffee (Americano americano) {
//        money -= americano.price;
//    }
//    void buyCoffee (Latte latte) {
//        money -= latte.price;
//    }
    // 메소드 생성 후 매개 변수로 커피 종류 별 객체 연결
    // 근데 이거 종류가 수백 수천 가지가 된다면? 매번 추가해야됨
    // 해결하기 위한 방법 중 하나로 다형성
    // ↓
    void  buyCoffee (Coffee_Type coffeeType) { // 이게 = new Americano() 이거 까진 알겠는데 Customer에서 생성되는건지 메인 메소드에서 생성되는건지는 모르겟ㅅ다;
        if ( money < coffeeType.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        } else {
            money -= coffeeType.price;
            System.out.println(coffeeType + "를 구입했습니다.");
        }
    }
    // 다형성의 특성을 이용해 각각 개별적인 커피 타입을 넣어주는게 아닌 상위 클래스의
    // Coffee_Type의 타입을 매개 변수로 전달 받으면, 해당 상위 타입의
    // 하위 참조 변수면 어떤 거가 됐든 매개변수로 전달되고
    // 그래서 매번 안 바꿔줘도됨
}
