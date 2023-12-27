package C16EtcClass;

public class C1605EnumMain {
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("bae");
        EnumStudent s2 = new EnumStudent();
        s2.setClassGrade(ClassGrade.a1);  // ClassGrade의 타입이 여전히 String이므로, 클래스 변수를 사용하지 않아도 에러가 발생하지 않는다.
        s2.setClassGrade("first");
        EnumStudent s3 = new EnumStudent();
        s3.setName("lee");
//        Enum타입 사용 시에는 static final 변수와 동일한 방밥으로 사용
        s3.setRole(Role.GENERAL_USER); // String으로 세팅 불가
        System.out.println(s3.getRole().getClass()); // class C16EtcClass.Role
//        enum값 내부에는 저장된 순서대로 0부터 index값이 내부적으로 할당되어 있음
        System.out.println(s3.getRole().ordinal()); // 0 - 가독성이 떨어지므로 13행처럼 enum타입 그대로 쓰길 권장






    }
}
class ClassGrade { // 소속반의 입력값을 지정하기 위한 클래스 생성
    static final String a1 = "first_grade";
    static final String a2 = "second_grade";
    static final String a3 = "third_grade";
}

enum Role {
//    각 열거형 상수(Enum)는 콤마(,)로 구분하고 상수목록 끝에 세미콜론(;)으로 마무리
    GENERAL_USER, ADMIN_USER, SUPER_USER;
}

class EnumStudent {
    private String name;
//    소속반
    private String classGrade;
//    String타입이 아닌 Role타입을 신규로 지정
    private Role role;

    public String getName() {
        return name;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}