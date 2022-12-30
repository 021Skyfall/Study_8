package InterfaceEX;
/*
1. 카페 운영자 있음
2. 손님들은 매일 마시는 음료가 정해져있음
3. 손님 A는 항상 아메리카노만 먹음
4. 손님 B는 항상 라떼만 먹음
*/
// 1. 카페 운영자 todo
class CafeOwner {

    public void giveItem(Customer customer) {
        System.out.println(customer.name()+"에게 "+customer.getOrder()+"를 줌");
    }
}
//손님
interface Customer {
    String getOrder();
    String name();
}
class ccA implements Customer{
    String name = "A";
    @Override
    public String getOrder() {
        return  "아메리카노";
    }

    @Override
    public String name() {
        return this.name;
    }
}
class ccB implements Customer{
    String name = "B";
    @Override
    public String getOrder() {
        return "라떼";
    }

    @Override
    public String name() {
        return this.name;
    }
}
//class ccC extends CafeCustomer{} ... 이런식으로 계속 증식하면?
// 얘말고도 CafeOwner 클래스의 로직도 계속해서 바꿔줘야함
// 이럴때 쓰는게 interface
class ccC implements Customer {
    String name = "C";

    @Override
    public String getOrder() {
        return "녹차";
    }

    @Override
    public String name() {
        return this.name;
    }
}
// 이런식으로 계속 생겨나는 하위 클래스에 메소드만 정의 해주면 쭊쭊 생김 1000개 2000개 있어도 ㄱㅊ



public class Scenario {
    public static void main(String[] args) {
        CafeOwner cafeOwner = new CafeOwner();
        cafeOwner.giveItem(new ccA());
        cafeOwner.giveItem(new ccB());
        cafeOwner.giveItem(new ccC());
    }
}
// 이거 딱 다형성 + 추상화 + 인터페이스 내용 총집합임 ㄹㅇ ㅋㅋ
// 뿌듯하다
