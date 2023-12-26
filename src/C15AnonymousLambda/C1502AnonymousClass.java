package C15AnonymousLambda;

public class C1502AnonymousClass {
    public static void main(String[] args) {
//        클래스명이 Animal이 아닌 이름없는 익명클래스와 객체를 동시에 생성
        Animal dog = new Animal() { // Dog클래스 없이 구현
            @Override
            public void makeSound(int n) {
                System.out.println("멍멍" + n);

            }
        };
        dog.makeSound(10);

//        익명객체에 구현메소드가 1개밖에 없을 경우에 람다표현식(화살표함수)로 표현 가능
//        ()부분에 매개변수 지정하여 구현체에서 활용, 변수의 개수가 많을때는 개수에 맞춰 지정
        Animal cat = (a) -> System.out.println("야옹" + a); // 매개변수 타입, 메소드명 등 형식적인 것 생략(메소드가 하나만 있기 때문)
    }

}

interface Animal{

    void makeSound(int n);

}

