package InterfaceEX;

public interface Interface_Example {
    public static final int rock = 1; // 인터페이스 변수 정의
    final int scissors = 2; // 위의 public static 생략 가능
    static int paper = 3; // 위의 public 과 final 생략
    int any = 4; // 전부 생략 가능

    public abstract String getPlayNum();
    void call(); // public abstract 생략
}
class hello implements Interface_Example {
    @Override
    public String getPlayNum() {
        return "Let's";
    } // 인터페이스의 추상 메소드를 구현 해줘야함 안하면 오류남

    @Override
    public void call() {
        System.out.println("하이");
    } // 얘도 마찬가지로 인터페이스에 들어있던 추상 메소드
}
