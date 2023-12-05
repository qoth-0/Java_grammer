import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {

////        byte로 썼을 때 -128~127까지의 표현이 가능하고, 그 ㅇ이상을 세팅할 때 오버/언더 플로우 발생
//        byte a =  127;
//        byte b =  -128;
//        a++;
//        b--;
//        System.out.println(a);
//        System.out.println(b);
//
////        실수 : float, double(기본)
//        float f1 = 1.123456789f;
//        double b1 = 1.123456789;
//        System.out.println(f1);
//        System.out.println(b1);
//
////        부동소수점 오차 테스트
//        double double_num = 0.1;
////        미세오차는 조정되어 정상적으로 출력
//        System.out.println(double_num);
//
////        반복적인 연산시 오차가 확대되어 오차확인가능
//        double total1 = 0;
//        for(int i=0;i<1000;i++){
//            total1 += 0.1;
//        }
//        System.out.println(total1);
//
////        오차해결
//        double total2 = 0;
//        for(int i=0;i<1000;i++){
//            total2 += 0.1*10;
//        }
//        System.out.println(total2/10);
//
////        고정소수점
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
////        저장할 때는 문자열 -> 연산할 때 정수로 변환 -> 결과는 실수로 리턴
//        BigDecimal big1 = new BigDecimal("1.03");
//        BigDecimal big2 = new BigDecimal("0.42");
//        System.out.println(big1.subtract(big2));

////        문자 : char
//        char c = '가';
//        System.out.println(c);
//
////        boolean : true(1) or false(0)
//        boolean b = true;
//        System.out.println(b);
////        if문의 조건식이 true면 실행됨
//        if(b){
//            System.out.println("조건식이 참입니다.");
//        }
//        int b1 = 20;
//        int b2 = 10;
//        if(b1 > b2){
//            System.out.println("조건식이 참입니다.");
//        }

////            묵시적 타입변환
//        char c = 'a';
//        int num = c;
//        System.out.println(num);
//
//        int n1 = 10;
//        double d = n1;
//        System.out.println(d);
//
////        에러 발생(묵시적 타입변환 시 큰타입으로의 변환은 불가능)
//        double d1 = 10.2;
//        int n2 = d1;
////        명시적 타입변환은 가능 -> 소수점값 손실발생 가능성이 있다.
//        int n2 = (int) d1;
//        System.out.println(n2);
//
////        명시적 타입변환
//        char c2 = 'b';
//        int char_num = (int)c2;

////        int a가 1 int b가 4일때 둘을 나눈값을 int에 담아 출력 : 0
//        int a = 1;
//        int b = 4;
//        int c = a/b;
//        System.out.println(c);
////        double에 담아 출력 -> 소수점 유실 발생 : 0.0
//        double d = a/b;
//        System.out.println(d);
////        a와 b중 하나만 double로 바꿔도 둘다 double로 계산됨 -> 유실 X : 0.25
//        double d2 = a/(double)b;
//        System.out.println(d2);

//        변수와 상수
//        선언과 동시에 초기화
        int a1 = 10;
//        변수값 변경
        a1 = 20;
//        선언만 한 뒤에 나중에 초기화
        int a2; // 선언만 했을 때는 값이 0으로 초기화
        a2 = 20;
//        상수는 값의 재할당이 불가능(대문자로 명명)
        final int AGES = 20;
//        AGES = 30;  //에러 발생(값 변경불가)


    }
}
