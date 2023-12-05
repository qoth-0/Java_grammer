public class C03Operator {
    public static void main(String[] args) {
////        산술 연산자
//        int num1 = 10, num2 = 3;
////        *, /(나눗셈), %(나머지)
//        System.out.println("num1 * num2 = " + (num1*num2));
//        System.out.println("num1 / num2 = " + (num1/num2)); // int로 하면 몫만 나옴
//        System.out.println("num1 / num2 = " + (num1/(double)num2)); // double로 나눗셈 결과 확인 가능
//        System.out.println("num1 % num2 = " + (num1%num2));
//
////        대입 연산자
//        int n1 = 7, n2 = 7, n3 = 7;
//        n1 = n1 - 3; // 4
//        n2 -= 3; // 4
//        n3 =- 3; // -3
//
//        int n4 = 10, n5 = 10;
//        n4 /= 3; // 3
//        n5 %= 3; // 1
//
////        증감 연산자
//        int a = 5;
//        int b = a++; // 후위연산자 : 실행문이 끝나고 증감
//        System.out.println(a); // 6
//        System.out.println(b); // 5
//
//        a = 5;
//        b = ++a; // 전위연산자 : 실행문이 끝나기 전 증감
//        System.out.println(a); // 6
//        System.out.println(b); // 6
//
////        비교 연산자
//        char c1 = 'a';
//        char c2 = 'A';
//        System.out.println(c1 == c2); // false
//        System.out.println(c1 != c2); // true

//        논리연산자 : &&, ||, !
        int num1 = 10, num2 = 20;
        boolean result1, result2;
//        result1에 num1이 5보다 크다, num1이 20보다 작다를 and 연산자를 통해 boolean 담기
        result1 = num1 > 5 && num1 < 20;
//        result2에 num2가 10보다 작다, num2가 30보다 작다를 or 연산자를 통해 boolean 담기
        result2 = num2 < 10 || num2 < 30;
//        result1, result2 각각 출력
        System.out.println(result1); // true
        System.out.println(result2); // true
//        result2에 ! 달아서 출력
        System.out.println(!result2); // false

//        비트연산자
//        & : 각 자리의 수가 모두 1일 경우만 1
        System.out.println(2 & 1); // 10, 01 -> 0




    }
}
