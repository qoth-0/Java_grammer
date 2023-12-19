package C13Inheritance;

import java.util.List;

public class C1303MethodOverriding {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.sound();
        Cat cat = new Cat();
        cat.sound();
//        상속관계일 때 부모 클래스 타입을 자식클래스 객체의 타입으로 지정가능
        Animal dog = new Dog();
//        dog.sound2(); // 에러 - Animal클래스에 정의된 메서드만 사용가능하도록 제약 발생(오버라이드된 메소드까지만 허용)
        dog.sound(); // 멍멍
    }
}

class Animal {
    public void sound() {
        System.out.println("동물은 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    public void sound2() {
        System.out.println("sound2");
    }
}
class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
