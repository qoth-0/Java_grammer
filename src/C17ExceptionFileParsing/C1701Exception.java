package C17ExceptionFileParsing;

import java.util.InputMismatchException;
import java.util.Scanner;


public class C1701Exception {
    public static void main(String[] args) {
////        ArithmeticException : 0으로 나눌때
//        System.out.println("나눗셈 프로그램입니다. 숫자 10에 나눌 분모값을 입력해주세요.");
//        int num = 10;
//        Scanner sc = new Scanner(System.in);
//
////        System.out.println("10에 " + input +"을 나누면 " + num/input + "입니다."); // java.lang.ArithmeticException: / by zero
////        System.out.println("감사합니다."); // 위에서 에러발생하여 코드 실행 불가
////        예외가 발생할 것으로 예상되는 코드에 try/catch로 감싸준다.
//        try {
//            int input = sc.nextInt();
//            System.out.println("10에 " + input +"을 나누면 " + num/input + "입니다.");
////            catch에는 try구문안에서 발생가능한 예외사항을 적어야 정상적으로 catch된다.
//        }catch (InputMismatchException e){
//            System.out.println("정상적이지 않은 입력값을 넣었습니다.");
//            e.printStackTrace();
//        }catch (ArithmeticException e) {
//            System.out.println("0으로 나누면 안됩니다.");
//            System.out.println(e.getMessage()); // / by zero - e안의 예외 관련된 정보들을 출력가능
//            e.printStackTrace(); // java.lang.ArithmeticException: / by zero
//        }catch (Exception e) { // 최상위 예외 - 모든 예외를 포함
//            System.out.println("알 수 없는 예외가 발생했습니다.");
//            e.printStackTrace();
//        }finally {
////            반드시 실행되어야 하는 구문 삽입
//            System.out.println("감사합니다.");
//        }

//        예외 발생 : throw와 throws예제
        String password = "1234";
        try {
            login(password);
        } catch (IllegalArgumentException e) {
//            e.getMessage는 login메소드에서 throw new한 곳에서 넘어온 메시지.
            System.out.println(e.getMessage());
        }

    }

//        unchecked exception에서 throws를 하지 않더라도 예외는 호출한 곳으로 전파
//        이때 throws를 하는 이유는 명시적을 예외가 발생할 수 있음을 알리는 것일 뿐

//        checked exception은 예외처라기 강제되고, 해당 메소드에서 예외처리를 하든지 throws를 통해  호출한 곳에 위임
//        이 때 호출한 쪽에서는 에외처리가 강제됨
        static void login(String password) throws IllegalArgumentException{
        if(password.length()<10) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
//        자바에서는 controller로 던져서 try/catch하도록
    }
}
