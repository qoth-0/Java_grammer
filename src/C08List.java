import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08List {
    public static void main(String[] args) {

////        List 선언 방법
////        ArrayList<String> myList = new ArrayList<String>();
////        ArrayList<String> myList = new ArrayList<>(); // String 삭제해도 무방
////        가장 일반적인 방식
//        List<String> myList = new ArrayList<>(); // 왼쪽엔 인터페이스, 오른쪽엔 구현체

////        초기값 생성방법1 : 하나씩 add
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("c++");
//        System.out.println(myList);

//        초기값 생성방법2 : 한꺼번에 add (배열을 이용)
        String[] myArr = {"java", "python", "c++"};
        List<String> myList = new ArrayList<>(Arrays.asList(myArr));
        System.out.println(myList);
//        배열이 int인 경우 -> 형변환 이슈 발생
        int[] myIntArr = {1, 2, 3};
//        List<Integer> myIntList = new ArrayList<>(Arrays.asList(myIntArr)); // 에러발생
        List<Integer> myIntList = new ArrayList<>();
        for(int a : myIntArr) {
            myIntList.add(a); // 자동형변환 해줌
        }




    }
}
