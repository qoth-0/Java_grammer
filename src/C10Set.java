import java.util.*;

public class C10Set {
    public static void main(String[] args) {

////        중복 제거, 순서 없음
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet); // e, h, l, o

////        반학생들이 좋아하는 운동 종목 - list로 만들고 종목의 개수 set으로 추리기
//        List<String> list = new ArrayList<>();
//        list.add("basketball");
//        list.add("basketball");
//        list.add("basketball");
//        list.add("baseball");
//        list.add("baseball");
//        list.add("tennis");
//        list.add("tennis");
//        list.add("tennis");
////        list를 인자값으로 받아 초기값 세팅 가능
//        Set<String> set = new HashSet<>(list);
//        System.out.println(set); // basketball, baseball, tennis
//        System.out.println(set.size()); // 3

////        String 배열을 인자값으로 받아 초기값 세팅
//        String[] arr = {"java", "java", "python", "c"};
//        Set<String> set = new HashSet<>(Arrays.asList(arr));
//        System.out.println(set);
//        set.remove("java");
//        System.out.println(set);

////        int 배열을 인자값으로 받아 초기값 세팅
//        int[] arrInt = {1,2,3,2,4,5,2};
////        Set<Integer> setInt = new HashSet<>(Arrays.asList(arrInt)); // 형변환 이슈 발생
//        Set<Integer> setInt = new HashSet<>();
//        for(int a : arrInt) {  // 하나씩 풀어서 넣어주기
//            setInt.add(a);
//        }

//        Set<String> set1 = new HashSet<>(Arrays.asList("java","python","javascript"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("java", "html", "css"));
////        교집합 : retainAll
//        Set<String> temp1 = new HashSet<>(set1);
//        temp1.retainAll(set2);
//        System.out.println(temp1); // java
////        합집합 : addAll
//        Set<String> temp2 = new HashSet<>(set1);
//        temp2.addAll(set2);
//        System.out.println(temp2); // python, css, java, html, javascript
////        교집합 : removeAll
//        Set<String> temp3 = new HashSet<>(set1);
//        temp3.removeAll(set2);
//        System.out.println(temp3); // python, javascript

//        프로그래머스 : 전화번호 목록

//        순서가 없으므로 index 접근 불가 -> enhanced for문, iterator 사용

////        LinkedHashSet, TreeSet
//        Set<String> set = new TreeSet<>();
//        set.add("hello5");
//        set.add("hello4");
//        set.add("hello3");
//        set.add("hello2");
//        set.add("hello1");
//        System.out.println(set); // hello1, hello2, hello3, hello4, hello5

////        두개 뽑아서 더하기 : Set 사용
//        int[] numbers = {5,0,2,7};
//        Set<Integer> set = new TreeSet<>();
//
//        for(int i=0;i<numbers.length-1;i++) {
//            for(int j=i+1;j<numbers.length;j++) {
//                set.add(numbers[i] + numbers[j]);
//            }
//        }
//        System.out.println(set); // 2, 5, 7, 9, 12
////        배열로 변환
//        int[] answer = new int[set.size()];
//        int index = 0;
//        for(int a : set) {
//            answer[index] = a;
//            index++;
//        }
//        System.out.println(set);












    }
}
