package C14Interface;

public class InterfaceMain {
    public static void main(String[] args) {
//
        DogImplements myDog = new DogImplements();
        myDog.makeSound(); // 멍멍
        CatImplements myCat = new CatImplements();
        myCat.makeSound(); // 야옹

        AnimalInterface1 myDog2 = new DogImplements();
        myDog.makeSound(); // 멍멍
        AnimalInterface1 myCat2 = new CatImplements();
        myCat.makeSound(); // 야옹

//        다형성 : 하나의 객체가 여러 개의 참조변수를 가질 수 있음을 의미

        DogMultiImplements myMultiDog = new DogMultiImplements();
        myMultiDog.makeSound(); // 멍멍
        System.out.println(myMultiDog.play("비숑", "이비")); // 비숑와 이비가 놉니다.
        CatMultiImplements myMultiCat = new CatMultiImplements();
        myMultiCat.makeSound(); // 야옹
        System.out.println(myMultiCat.play("코숏", "푸딩")); // 코숏와 푸딩가 놉니다.

//        AnimalInterface1 myMultiDog = new DogMultiImplements();
//        myMultiDog.makeSound(); // 멍멍
////        타입을 interface1로 선언하면 interface2에 정의된 메소드는 사용불가
//        System.out.println(myMultiDog.play("비숑", "이비")); // 비숑와 이비가 놉니다.
//        AnimalInterface2 myMultiCat = new CatMultiImplements();
////        타입을 interface2로 선언하면 interface1에 정의된 메소드는 사용불가
//        myMultiCat.makeSound(); // 야옹
//        System.out.println(myMultiCat.play("코숏", "푸딩")); // 코숏와 푸딩가 놉니다.

//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명 내부클래스 방식으로 사용가능
        AnimalInterface1 ai = new AnimalInterface1() {
            @Override
            public void makeSound() {

            }
        };



    }
}
