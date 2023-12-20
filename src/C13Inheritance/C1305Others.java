package C13Inheritance;

// util 하위의 모든 클래스/인터페이스 파일 import 가능
import java.util.*;
//import java.*; // 에러발생 - 특정 패키지의 하위 패키지의 모든 파일까지 import하는 것은 불가능


// final클래스는 상속불가
//public class C1305Others extends FinalClass{
public class C1305Others{
    public static void main(String[] args) {
        C1305Dog dog = new C1305Dog();
        dog.makeSound1(); // dog가 오버라이딩한 makeSound1
        dog.makeSound2(); // 부모(Amimal)의 madeSound2

        C1305Animal animal = new C1305Animal() {
            @Override
            void makeSound1() { // 오버라이딩 강제

            }
        };
        System.out.println(dog.getClass()); // class C13Inheritance.C1305Dog
        System.out.println(animal.getClass()); // class C13Inheritance.C1305Others$1 -> animal클래스는  원래 불가능한 객체 생성을 강제 오버라이드를 통해 생성해서 이름을 잃어버림 - 익명 클래스
    }

}

final class FinalClass {

}
abstract class C1305Animal {
//    final void makeSound() {
//        System.out.println("동물은 소리를 냅니다.");
//    }
    abstract void makeSound1();
    void makeSound2() {
        System.out.println("makesound2");
    }
}

class C1305Dog extends C1305Animal{
    @Override
    void makeSound1() {

    }
//    @Override
//    void makeSound() { // final 메소드는 오버라이딩 불가
//        System.out.println("멍멍");
//    }

}
