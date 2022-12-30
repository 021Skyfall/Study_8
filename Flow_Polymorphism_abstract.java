public class Flow_Polymorphism_abstract { // 다형성의 흐름을 이해하기 위해 작성함
    public static void main(String[] args) {
        Man man = new Man();
        man.callFriend(new Friend());
    }
}

class Man {
    public void callFriend(Friend friend) {
        friend.attack();
    }
}
class Friend {
    public void attack() {
        System.out.println("마! 니 짜씬 있나?");
    }
}
// 자 ~ Man 클래스와 Friend 클래스가 정의됨
// -> Man 클래스 메소드의 매개 변수인 friend 는 Friend 클래스를 참조함
// 즉, 해당 매개 변수로 불러올 값은 Friend 클래스에 있다는 뜻임 ㅇㅋ? ㅇㅋ
// -> 그럼 이제 callFriend 라는 메소드를 호출하게 되면
// friend 에 있는 attack 이라는 메소드를 실행 시킬거임~ ㅇㅋ? ㅇㅋ
// -> 근데 이제 friend 는 뭐냐~면 클래스인 Friend 를 참조하는 변수임
// 참조한다는게 뭐다? 위에 썻죠~? ㅇㅋ? ㅇㅋ
// -> 그럼 friend 에 연결된 Friend 클래스의 메소드인 attack() 을 불러온다는 뜻임 ㅇㅋ? ㅇㅋ
// 한 마디로 말하면 callFriend 메소드를 호출하면 Friend 클래스의 메소드를 실행 시킨다는 말임
// -> 그 후 메인 메소드에서 Man 클래스의 callFriend 메소드를 출력을 할거니까~
// 일단 Man man = new Man(); 으로 Man 클래스의 인스턴스(객체)를 생성함~ ㅇㅋ? ㅇㅋ
// 이제 Man 클래스를 참조하는 변수인 man 으로 Man 클래스의 메소드를 호출 할 것임~ ㅇㅋ? ㅇㅋ
// 그럼 man.callFriend 가 될건데 얘가 근데 매개변수가 있엇죠~
// 이 매개 변수는 결국 또 다른 클래스를 뜻하고 callFriend 라는 메소드는 그 클래스의 객체를 불러오는 거기 때문에
// 불러올 인스턴스 또 생성을 해주어 합니다~ ㅇㅋ? ㅇㅋ
// 근데! 여기서 귀찮지 않게~ 중복 되는거 없이~ 코드가 고장날일 없이~
// callFriend 의 매개 변수로 new Friend 를 넣으면~ 이게 이제
// Friend 객체를 생성한다는 뜻이고~ 이미 변수가 참조하는 값은 Man 클래스의 메소드에 매개 변수로
// 정의가 되어있어서 바로 흐름 타고 생성과 동시에 friend 변수를 스위치로 Friend 클래스로
// 진입하게 되고 해당 클래스의 attack() 메소드를 호출하는 것 ㅇㅋ? ㅇㅋ
// 이걸 상속 관계로 Man 을 상위 Friend, Friend1, Friend2 ... 등을 하위로
// 공통된 정의지만 다른 값을 출력해야 할 때 수정이 편하도록 상위 클래스의 매개변수에
// 하위 클래스로의 공통 매개 변수를 놓는걸? 다형성이라 한다. // 사실 다형성은 아직 감이 안옴
// 거기서 상위 클래스를 추상 클래스로 변경하고 공통된 정의를 추상 메소드로 바꾸고
// 하위 클래스 들에 강제적으로 추상 메소드를 정의하게 하게 하는게? 추상화다.
// 좀 복잡하게 썼지만 길게 풀어쓰면 이거임