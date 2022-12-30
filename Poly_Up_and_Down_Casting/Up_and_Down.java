package Poly_Up_and_Down_Casting;

public class Up_and_Down {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = (Vehicle) car; // 상위 클래스 Vehicle 타입으로 변환 (생략가능)
        Car car1 = (Car) vehicle; // 하위 클래스 Car 타입으로 변환(생략 불가능)
//        Bike bike = (Bike) car; // 서로 상속관계가 아니므로 타입변경 불가능 ~> 에러
    }// Vehicle 상위 -> Car 하위로 타입 변환 가능 , 괄호 생략가능
}    // Car 히위 -> Vehicle 상위 변경 가능 ~> 대신 괄호 생략불가
     // 하위끼리? 되겠냐고 ㅋㅋ
class Vehicle {
    String model;
    String color;
    
    void start() {
        System.out.println("출발");
    }
    void accel() {
        System.out.println("속도 상승");
    }
    void stop() {
        System.out.println("멈춤");
    }
}
class Car extends Vehicle {
    void shareRide() {
        System.out.println("카풀");
    }
}
class Bike extends Vehicle {
    void perform() {
        System.out.println("묘기");
    }
}