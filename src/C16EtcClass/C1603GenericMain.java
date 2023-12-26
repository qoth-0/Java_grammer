package C16EtcClass;

import java.util.Arrays;

public class C1603GenericMain {
    public static void main(String[] args) {

        String[] st = {"java", "python", "C++"};
        changeSt(st, 1, 2); //  String 배열 순서 변환 함수

        Integer[] i = {1,2,3,4,5};
        changeInt(i, 2, 3); // Integer 배열 순서 변환 함수

//        같은 메소드를 타입에 따라 나누지않고 하나로 공통화 - 제네릭 메소드
        changeAll(st, 1, 2);
        changeAll(i, 2, 3);

//        제네릭 클래스 : 객체 생성 시 클래스명 옆에 <타입> 써줘야 함
        GenericStudent<String> gs1 = new GenericStudent<>();
        gs1.setAge("3");
        System.out.println(gs1.getAge().getClass()); // class java.lang.String
        GenericStudent<Integer> gs2 = new GenericStudent<>();
        gs2.setAge(3);
        System.out.println(gs2.getAge().getClass()); // class java.lang.Integer

    }
    static void changeSt (String[] st, int a, int b) {
        String tempStr = st[a];
        st[a] = st[b];
        st[b] = tempStr;
        System.out.println(Arrays.toString(st));
    }
    static void changeInt (Integer[] i, int a, int b) {
        Integer tempInt = i[a];
        i[a] = i[b];
        i[b] = tempInt;
        System.out.println(Arrays.toString(i));
    }

    //        제네릭 메소드 생성 : 반환타입 왼쪽에 <T> 선언
    //    제네릭은 객체 타입이 들어와야 함 (int 불가)
    static <T> void changeAll (T[] arr, int a, int b) {
        T tempInt = arr[a];
        arr[a] = arr[b];
        arr[b] = tempInt;
        System.out.println(Arrays.toString(arr));
    }
}

//  제네릭 클래스 생성 : 클래스명 오른쪽에 <T> 선언
class GenericStudent<T> {
    String name;
    T age;

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}
