package C14Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyImplements mi = new MyImplements();
        mi.methodA(); // my_constant는 접근 불가?

    }
}
interface MyInterface{
//    아래 변수는 컴파일 타임에 static final이 붙는다.(상수이자, 클래스변수)
    int my_constant = 100;
    void methodA();
}
class MyImplements implements MyInterface {

    @Override
    public void methodA() {
        System.out.println("methodA");
    }
}
