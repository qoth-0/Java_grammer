package C12ClassLecture;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class C1205MethodOverloading {
    public static void main(String[] args) {

        C1205MethodOverloading main = new C1205MethodOverloading(); // static 메서드가 아니므로 객체 생성 후 사용
//        메서드 오버로딩을 통해 같은 메서드명 재활용
        System.out.println(main.sum(10, 20));
        System.out.println(main.sum(10, 20, 30));
        System.out.println(main.sum(10.0, 20.0));
//        제네릭을 통해 타입재활용
        List<Integer> myList = new ArrayList<>(); // <> : 어떤 타입이든 들어올 수 있게 함
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}
