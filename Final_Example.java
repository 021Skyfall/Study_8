final class Final_Example { // 확장 & 상속 안됨
    final int x = 1; // 변경 불가 상수
    final int getNum() { // 오버라이딩 불가 메소드
        final int localVal = x; // 상수
        return x;
    }
}
