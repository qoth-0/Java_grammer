package C13Inheritance;

//  상속
public class C1301Inheritance extends Parent{ // extends : 상속 관계를 표현
    int c = 30; // 객체변수..?

    public static void main(String[] args) {
        C1301Inheritance main = new C1301Inheritance();
        System.out.println(main.c); // 30
        System.out.println(main.a); // 10
////        자식클래스라 하더라도 private변수는 상속 및 접근이 불가
//        System.out.println(main.b); // 에러

        main.parentMethod(); // 부모클래스가 아니라 자식클래스입니다. - 오버라이딩한 자식메소드를 실행
        main.childMethod(); // 자식 클래스입니다.


    }
    void childMethod() {
        System.out.println("자식 클래스입니다.");
    }
    @Override // 써주는 게 좋음(최적화)
    void parentMethod() { // 부모클래스의 메소드명을 동일하게 사용하여 메소드 오버라이딩(덮어쓰기)했다.
        System.out.println("부모클래스가 아니라 자식클래스입니다.");
    }
}
class Parent {
    int a = 10;
    private int b = 20;
    void parentMethod() {
        System.out.println("부모 클래스입니다.");
    }

}
