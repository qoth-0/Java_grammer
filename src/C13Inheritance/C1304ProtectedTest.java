package C13Inheritance;

public class C1304ProtectedTest {
    public static void main(String[] args) {
        C1304ProtectedClass pt = new C1304ProtectedClass();
        System.out.println(pt.st2); // default 접근가능
        System.out.println(pt.st3); // protected 접근가능
        System.out.println(pt.st4); // public 접근가능
    }
}
