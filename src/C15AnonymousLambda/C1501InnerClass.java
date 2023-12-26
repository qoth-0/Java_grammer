package C15AnonymousLambda;

public class C1501InnerClass {

    public static void main(String[] args) {
        InnerClass.StaticInnerClass si = new InnerClass.StaticInnerClass();
        si.display();
    }
}

// 일반내부클래스
class InnerClass {

//    static 내부 클래스
//    InnerClass의 정적멤버처럼 활용
    static class StaticInnerClass { // static 붙으면 클래스 변수 -> C1501InnerClass.StaticInnerClass로 접근 가능
        private int data;
        void display() {
            System.out.println("data값은 " + data + "입니다.");
        }
    }
}

