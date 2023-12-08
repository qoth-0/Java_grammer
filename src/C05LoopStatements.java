import java.util.Arrays;
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

////        1~10 중에 홀수만 출력 - continue
//        for(int i=1;i<11;i++){
//            if(i%2==0){
//                continue;
//            }else {
//                System.out.println(i);
//            }
//        }

////        배열과 enhanced for문
//        int[] myArr = {1, 2, 3, 4, 5};
//        for (int i=0;i<5;i++){  // 일반 for문
//            System.out.println(myArr[i]);
//        }
//        for (int a : myArr){  // enhanced for문
//            System.out.println(a);
//        }

////        일반 for문으로 myArr 값에 10을 더하여 출력
//        for (int i=0;i<myArr.length;i++){
//            myArr[i] += 10;
//        }
//        System.out.println(Arrays.toString(myArr)); // 주소값이 아닌 값을 출력하기 위해
////        enhanced for문으로 출력
//        for (int a : myArr) {
//            a += 10;
//        }
//        System.out.println(Arrays.toString(myArr)); // 값의 변화 없음 - 참조용으로만 쓰기

////        자바 변수의 유효범위 : { }
//        int num = 10;
//        if(num > 1) {
//            int abc = 20;
//            num = 20;
//        }
//        System.out.println(num); // 20 : if문 밖에서 선언된 변수는 if문 안에서 접근 가능
//        System.out.println(abc); // if문 안에서 정의된 변수는 if문 밖에선 인지 불가

//        구구단 2~9단 전부 출력, 몇단인지 표시 - 다중반복문
        for(int i=2; i<10; i++) {
            System.out.println(i+"단입니다.");
            for(int j=1; j<10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }

//        이중 for문을 통해 배열접근
        int[][] arr = {{1, 2, 3, 4},{5, 6, 7, 8}};
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

//        라벨문
        loop1:
        for(int i =0; i<5;i++){
            loop2:
            for(int j=0; j<5; j++){
                System.out.println("hello world");
                if(j==2){
                    break; // 15번 출력
                    // break loop1; // 3번 출력
                }

            }
        }
    }
}
