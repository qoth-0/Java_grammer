import java.util.Scanner;

public class C05LoopPractice {
    public static void main(String[] args) {

////        1~20까지 짝수의 합 계산하기
//        int num = 0;
//        for (int i=1;i<21;i++) {
//            if(i%2==0) {
//                num += i;
//            }
//        }
//        System.out.println(num);

////        숫자 뒤집기
//        int base = 1234;
//        int result = 0;
//        while(base>0){
//            int temp = base % 10;
//            result = result * 10 + temp;
//            base /= 10;
//        }
//        System.out.println(result);

////        최대공약수 구하기
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int max = a > b ? b : a;
//        int maxNum = 0;
//        for(int i=2;i<=max;i++) {
//            if(a % i == 0 && b % i == 0) {
//                maxNum = i;
//            }
//        }
//        System.out.println(maxNum);


//        라벨문
//        1~20의 숫자 중 약수를 5개 이상 가진 숫자 중 가장 작은 숫자를 구하시오
        int ans = 0;
        l1:
        for(int i=1; i<21;i++){
            int count = 0;
            for(int j=1; j<=i; j++)
            {
                if(i % j==0){
                    count ++;
                }
                if(count == 5){
                    ans = i;
                    break l1;
                }
            }
        }
        System.out.println(ans);
    }
}




