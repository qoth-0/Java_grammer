package C13Inheritance;

// public : 프로젝트 전체에서 접근가능
// protected : 패키지를 벗어나더라도 상속관계인 경우엔 접근가능
// default : 패키지 내에서만 접근가능
// private : 클래스 내에서만 접근가능

public class C1304ProtectedClass {
    private String st1 = "hello java1";
    String st2 = "hello java2";
    protected String st3 = "hello java3";
    public String st4 = "hello java4";
}
