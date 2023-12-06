import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {

////        출력 : System.out
////        print는 출력 후 줄바꿈 없음
//        System.out.print(1);
////        println은  출력 후 줄바꿈
//        System.out.println(2);
//        System.out.print(3);

//        입력 : System.in(키보드 입력) + Scanner(입력을 위한 클래스)
//        기본 변수타입이 아닌 클래스를 가져다 쓸 경우 new 클래스명을 사용
        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열을 입력하세요 : ");
//
////        nextLine은 입력받은 데이터를 한 줄 읽어서 String으로 리턴
//        String input_string = sc.nextLine();
//        System.out.println("사용자가 입력한 문자열 : " + input_string);
//
////        nextInt는 입력받은 데이터를 int로 리턴
//        int input_int = sc.nextInt();
//        System.out.println("사용자가 입력한 숫자는 : " + input_int);

//        System.out.println("더하기를 할 숫자 2개를 입력해주세요.");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("입력하신 두 수를 더한 값은 "+ (a+b) +"입니다.");
//        int sum = a + b;
//        System.out.println("입력하신 두 수를 더한 값은 "+ sum +"입니다.");

//        nextDouble은 입력받은 데이터를 double로 리턴
        double input_double = sc.nextDouble();
        System.out.println("입력된 소수 : " + input_double);
//        nextBoolean은 입력받은 데이터를 boolean으로 리턴
//        true/false(대소문자 상관없음)
        boolean input_boolean = sc.nextBoolean();
        System.out.println("입력된 boolean : " + input_boolean);

//        입출력 시스템 메모리 해제 - Scanner 사용 후
        sc.close();

    }
}
