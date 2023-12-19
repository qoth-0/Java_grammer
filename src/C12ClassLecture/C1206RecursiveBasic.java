package C12ClassLecture;

import java.util.Arrays;

public class C1206RecursiveBasic {
    public static void main(String[] args) {

//        for문 1~10까지 누적 합계
        int total = 0;
        for(int i=1; i<=10; i++) {
            total += i;
        }
        System.out.println(total);
        System.out.println(add_acc(10));
        System.out.println(factorial(5));

//        피보나치 수열 : for문(배열없이)
        int result = 0;
        int a = 1;
        int b = 1;
        for(int i=3; i<=10; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        System.out.println(result);

        System.out.println(fibonacci(10));

//        피보나치 수열 : for문(배열활용)
//        메모이제이션(기억알고리즘 - DP)
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr)); // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

    }

//    자기 자신을 호출하는 메소드를 재귀함수라고 하고, 이러한 호출 방식을 재귀호출이라고 한다.
//    스택오버플로우 발생가능하기 때문에 실무에선 사용 잘 안함
//    코테는 많이 사용
    static int add_acc(int a) { // 누적 합
        if(a == 1) return 1;
        return a + add_acc(a-1);
    }

    static int factorial(int a) { // 누적 곱
        if(a <= 1) return 1;
        return a * factorial(a-1);
    }

//    피보나치 수열 : 재귀 (시간복잡도 높음 - 사용x)
    static int fibonacci(int n) {
        if(n<=2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
