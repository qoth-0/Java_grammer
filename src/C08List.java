import java.util.*;
import java.util.stream.Collectors;

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

////        초기값 생성방법2 : 한꺼번에 add (배열을 이용) - 기본형은 불가
//        String[] myArr = {"java", "python", "c++"};
//        List<String> myList = new ArrayList<>(Arrays.asList(myArr)); // 배열형태를 리스트형태로 변환 : Arrays.asList()
//        System.out.println(myList);
//
////        배열이 int인 경우 -> 형변환 이슈 발생
//        int[] myIntArr = {1, 2, 3};
////        List<Integer> myIntList = new ArrayList<>(Arrays.asList(myIntArr)); // 에러발생
//        List<Integer> myIntList = new ArrayList<>();
//        for(int a : myIntArr) {
//            myIntList.add(a); // 자동형변환 해줌
//        }

////        add(int index, int element) : 중간에 값 삽입은 성능저하를 유발
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(1, 15);
//        System.out.println(myList); // 10, 15, 20
//
////        addAll(Collection객체) : 특정 리스트의 요소를 모두 add
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(30);
//        myList2.add(40);
//        myList2.add(50);
//        myList.addAll(myList2);
//        System.out.println(myList); // 10, 15, 20, 30, 40, 50
//
////        get(int index) : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0)); // 10
//
////        size() : 리스트의 개수 반환
//        for(int i=0; i<myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//
////        remove() : 요소 삭제
////        index삭제
//        myList.remove(0);
//        System.out.println(myList); // 15, 20, 30, 40, 50
////        값 삭제 : Integer.valueOf 사용
//        myList.remove(Integer.valueOf(15));
//        System.out.println(myList); // 20, 30, 40, 50
//
////        set(int index, E element) : index 자리에 값 변경
//        myList.set(myList.size()-1, 100);
//        System.out.println(myList); // 20, 30, 40, 100
//
////        contains(E element) : 특정값이 있는지 없는지 boolean return
//        System.out.println(myList.contains(100)); // true

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(10);
//        myList.add(30);
////        indexOf() : 몇번째 index에 위치하는지 return, 요소가 없으면 -1 return
//        System.out.println(myList.indexOf(10)); // 0 - 중복일 경우 가장 먼저 발견되는 index
//
////        isEmpty : 값이 비었는지, 안비었는지
//        System.out.println(myList.isEmpty()); // false
//
////        clear() : 전체 삭제
//        myList.clear();
//        System.out.println(myList.isEmpty()); // true

////        리스트 안에 배열
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{1,2,3});
//        myList.add(new int[2]);
//        myList.add(new int[3]);
//        myList.get(1)[0] = 10; // index가 1인 myList 리스트 속 배열의 0번째 값을 10으로 할당
//        myList.get(1)[1] = 20;
//        System.out.println(myList); // 리스트 안에 배열이 담길 경우 주소값이 반환
//        for(int[] a : myList) {
//            System.out.println(Arrays.toString(a));
//        }
//
////        리스트 안에 리스트
//        List<List<Integer>> myList1 = new ArrayList<>();
//        myList1.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
//        myList1.add(new ArrayList<>(Arrays.asList(10, 20, 30)));
//        myList1.add(new ArrayList<>(Arrays.asList(4, 5)));
//        myList1.get(1).add(10); // get으로 myList1의 index 1인 리스트 속 리스트에 add로 값 할당
//        myList1.get(1).add(20);
//        System.out.println(myList1); // 리스트 속 리스트는 바로 출력가능

////        값 할당 연습 {1,2,3}, {10,20,30}, {100,200,300}
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//        int value = 1;
//        for(int i=0; i<myList.size(); i++) {
//            for(int j=0; j<myList.get(i).length; j++) {
//                myList.get(i)[j] = (j+1)*value;
//            }
//            value *= 10;
//        }
//        for(int[] a : myList) {
//            System.out.println(Arrays.toString(a));
//        }

//        List<Integer> myList = new ArrayList<>(Arrays.asList(5, 3, 2, 4, 3));
////        리스트 정렬1 : Collections.sort() - 클래스 메소드
//        Collections.sort(myList);
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//
////        리스트 정렬2 : 객체.sort() - 객체 메소드
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);

////        String 배열을 list로 변환
////        1. Arrays.asList()
//        String[] st = {"a", "b", "c"};
//        List<String> stList1 = new ArrayList<>(Arrays.asList(st)); // 객체타입이 아닐때 문제생김(ex.int)
////        2. for문 담기
//        List<String> stList2 = new ArrayList<>();
//        for(String a : st) {
//            stList2.add(a);
//        }
////        3. streamApi - 참고만
//        List<String> stList3 = Arrays.stream(st).collect(Collectors.toList());
//
////        int배열을 list로 변환
//        int[] intArr = {10, 20, 30, 40};
////        1. Arrays.asList 사용불가
////        2. for문 담기 사용가능
////        3. streamApi 사용가능 - int는 객체타입이 아니므로 boxed() 사용
//        List<Integer> intList = Arrays.stream(intArr) = Arrays.stream(intArr).boxed().collect(Collectors.toList());

////        String리스트를 String 배열로 변환
////        1. for문으로 할당
//        List<String> st = new ArrayList<>(Arrays.asList("a","b","c"));
//        String[] stArr = new String[st.size()];
//        for(int i=0; i<stArr.length; i++) {
//            stArr[i] = st.get(i);
//        }
////        2. streamApi
//        String[] stArr2 = st.stream().toArray(a->new String[a]);
//
////        Int리스트를 int 배열로 변환
////        1. for문으로 할당
////        2. streamApi

////        두개 뽑아서 더하기 : 리스트 사용
//        int[] numbers = {5,0,2,7};
//         List<Integer> answer = new ArrayList<>();
//         for(int i=0; i<numbers.length-1; i++) {
//             for(int j=i+1; j<numbers.length; j++) {
//                 if(!answer.contains(numbers[i]+numbers[j])){
//                    answer.add(numbers[i]+numbers[j]);
//                 }
//             }
//         }
//         answer.sort(Comparator.naturalOrder());
//        int[] arrAnswer = new int[answer.size()];
//        for(int i=0; i<answer.size(); i++) {
//            arrAnswer[i] = answer.get(i);
//        }
//        System.out.println(Arrays.toString(arrAnswer)); // 2, 5, 7, 9, 12

////        프로그래머스 : n의 배수 고르기
//        int n = 3;
//        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//
//        List<Integer> answer = new ArrayList<>();
//        for(int a : numlist) {
//            if(a % n==0) {
//                answer.add(a);
//            }
//        }
//        int[] result = new int[answer.size()];
//        for(int i=0; i<answer.size(); i++) {
//            result[i] = answer.get(i);
//        }
//        System.out.println(Arrays.toString(result)); // 6, 9, 12



    }
}
