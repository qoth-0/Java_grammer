public class C1102StackFunction2 {

//    스택오버플로우 - Exception in thread "main" java.lang.StackOverflowError
    public static void main(String[] args) {
        System.out.println("메인함수 시작");
        System.out.println(function1(1)); // 4
        System.out.println("메인함수 끝");
    }
    static int function1(int a) {
        System.out.println("function1시작");
        System.out.println("function1끝");
        return  function1(a*2);   // 무한반복
    }
}
