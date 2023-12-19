package C13Inheritance;

public class C1302SuperChildClass extends SuperParent{
//    super() : 부모클래스의 생성자를 의미 , super키워드 : 부모클래스를 의미
    int b;
    int a;
    C1302SuperChildClass() {
        super(100);
        a = 30;
        b = 20;

    }
    void display() {
        System.out.println(a); // 30
        System.out.println(super.a); // 100 - 부모클래스의 a
        System.out.println(b); // 20
    }
    public static void main(String[] args) {
        C1302SuperChildClass main = new C1302SuperChildClass();
        main.display();
        System.out.println(main.a);
        System.out.println(main.b);


    }

}
class SuperParent {
    int a;
    SuperParent(int a) {
        this.a = a;
    }

}
