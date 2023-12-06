import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

////        도어락 키 if문 구현
////        int로 받으면 01234와 1234가 같은 값이 되므로 기능의 빈틈이 생김 -> string으로 구현
//        String pw = "1234";
//        String input1 = sc.nextLine();
//        if (pw.equals(input)) {  // 문자열비교 : equals()
//            System.out.println("문이 열렸습니다.");
//        }else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
//
////        묵시적 타입변환(char -> int) 이용한 알파벳 비교
//        // 문자열이 아닌 문자하나를 비교하기때문에 nextLine으로 받은 String을 char로 변환해야함 : charAt()
//        char input = sc.nextLine().charAt(0);
//        if (input >= 'a' && input <= 'z') {
//            System.out.println("소문자 입니다.");
//        }else if (input >= 'A' && input <= 'Z') {
//            System.out.println("대문자 입니다.");
//        }else {
//            System.out.println("알파벳이 아닙니다.");
//        }

////        버스카드 태그 - 도난여부확인
//        int myMoney = sc.nextInt();
//        boolean isStolen = false;
//        if (myMoney >= 1500 && isStolen == false) {
//            System.out.println("탑승 가능합니다.");
//        }else {
//            System.out.println("탑승 불가입니다.");
//        }

////        도어락 키 삼항연산자 구현
//        String pw = "1234";
//        String input1 = sc.nextLine();
//        String result = input1.equals(pw) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다.";
//        System.out.println(result);

////        대중교통 추천
//        int myMoney = sc.nextInt();
//        if(myMoney >= 10000) {
//            System.out.println("택시를 타세요");
//        }else if(myMoney >= 3000) {
//            System.out.println("버스를 타세요");
//        }else if(myMoney >= 2000) {
//            System.out.println("킥보드를 타세요");
//        }else {
//            System.out.println("걸어가세요");
//        }

//        // 고객센터 switch문
//        int select = sc.nextInt();
//        switch (select) {
//            case 1:
//                System.out.println("대출서비스입니다.");
//                break;
//            case 2:
//                System.out.println("예금업무입니다.");
//                break;
//            case 3:
//                System.out.println("적금업무입니다.");
//                break;
//            case 0:
//                System.out.println("상담연결사입니다.");
//                break;
//            default:
//                System.out.println("잘못누르셨습니다.");
//                break;
//        }






    }
}
