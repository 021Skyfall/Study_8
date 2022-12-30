package Poly_Example;

public class Coffee_Output {
    public static void main(String[] args) {
        Customer customer = new Customer();
//        customer.money = 2000; // 잔액 부족 출력
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new Latte());
//      buyCoffee 의 매개변수로 상위 클래스인 Coffee_Type 을 넣었고
//      그 클래스의 하위 클래스인 Americano 와 Latte 클래스의 메소드 생성 & 호출 한것
//       왜? 다형성의 특성을 이용해 상위 클래스의 참조변수를 하위 클래스 객체로 잡은것
//       즉, 위 코드를 풀어서 쓰면
//        Coffee_Type coffeeType = new Americano();
//        Coffee_Type coffeeType1 = new Latte();
//        coffeeType.price;
//        coffeeType.이름; ... 따로 불러오고
//        출력 값 역시 다시 부르고 등등 코드가 엄청 길어짐
//       그런데 위 방법은 상위 클래스를 매개 변수로 넣고 하위 클래스들이 값을 리턴하게 끔 작성하고서
//       메인 메소드에 인스턴스 생성할 때 상위 클래스를 참조해서 하위 클래스 인스턴스를 생성한 것
//        >> 이러면 하위 클래스의 기능들이 각각 실행됨

//      추가로 호출할 때마다 각 하위 클래스에 super()을 사용하여 그때 그때 상위 클래스의
//      필드 변수가 변경되게 해줌


        System.out.println("현재 잔액은 "+customer.money+"원 입니다.");

    }
}
