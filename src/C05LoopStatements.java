import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        //        2~10 출력 - while문
//        int a = 2;
//        while(a < 11) {
//            System.out.println(a++);
//        }

////        구구단 - while문
//        System.out.println("구구단 단수를 입력하세요.");
//        int input = sc.nextInt();
//        int a = 1;
//        while (a < 10) {
//            System.out.println(input + " X " + a + " = " + (input * a));
//            a++;
//        }

////        도어락 키 반복입력, 입력횟수 5번 초과시 메시지 출력 - while문
//        String pw = "1234";
//        int a = 0;
//        while (true){
//            System.out.println("비밀번호를 입력해주세요.");
//            String input1 = sc.nextLine();
//            if (pw.equals(input1)) {  // 문자열비교 : equals()
//                System.out.println("문이 열렸습니다.");
//                break;
//            }else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//            if(a==5){
//                System.out.println("입력횟수를 초과하였습니다.");
//                break;
//            }
//        }

////        2~10 출력 - do while문
//        int a = 2;
//        do {
//            System.out.println(a++);
//        } while (a<11);

////        2~10 출력 - for문
//        for(int i=2;i<11;i++){
//            System.out.println(i);
//        }

//        1~10 중에 홀수만 출력 - continue
        for(int i=1;i<11;i++){
            if(i%2==0){
                continue;
            }else {
                System.out.println(i);
            }
        }









    }
}
