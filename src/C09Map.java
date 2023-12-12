import java.util.*;

public class C09Map {
    public static void main(String[] args) {

////        String, String으로 Map만들기
//        Map<String, String> myMap = new HashMap<>();
//
////        put(key, value) : 데이터 삽입
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        System.out.println(myMap); // 순서없음
//
////        get(key) : key값에 따른 value 반환
//        System.out.println(myMap.get("basketball"));
//
////        size(), isEmpty()는 List와 동일하게 사용 가능
//
////        putIfAbsent(key, value) : key가 존재하지 않을 때 삽입
//        myMap.put("baseball", "탁구"); // 기존 baseball 덮어쓰기
//        myMap.putIfAbsent("baseball", "배구"); // baseball이 존재하므로 배구 삽입 x
//        System.out.println(myMap); // soccer=축구, basketball=농구, baseball=탁구
//
////        getOrDefault(key) : key가 없으면 기본값 반환
//        System.out.println(myMap.get("tennis")); // null
//        System.out.println(myMap.getOrDefault("tennis", "스포츠")); // 스포츠
//
////        containsKey(key) : key가 존재하는지 안하는지 boolean 반환
//        System.out.println(myMap.containsKey("tennis")); // false
//
////        remove(key) : 삭제 - 순서가 없기 때문에 삭제 시 성능저하 없음
//        myMap.remove("baseball");
//        System.out.println(myMap); // soccer=축구, basketball=농구
//
////        keySet() : key 조회
//        System.out.println(myMap.keySet());
////        values() : value 조회
//        System.out.println(myMap.values());
//
////        enhanced for : key값 하나씩 출력
//        for(String a : myMap.keySet()) {
//            System.out.println(myMap.get(a));
//        }


////        iterator를 통해 key값 하나씩 출력
//        Iterator<String> myIter = myMap.keySet().iterator();
////        next() : 데이터를 소모시키면서 return
////        System.out.println(myIter.next());
////        System.out.println(myIter); // 주소값 반환
//
////        전체 출력
////        hasNext() : iterator안에 값이 있는지 없는지 boolean return
//        while(myIter.hasNext()) {
//            System.out.println(myIter.next());
//        }

////        리스트 -> map : 좋아하는 운동종목과 사람수
//        List<String> myList = new ArrayList<>();
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//
//        Map<String, Integer> myMap = new HashMap<>();
//        for(String a : myList) {
//            if(myMap.containsKey(a)){
//                myMap.put(a, myMap.get(a)+1);
//            }
//            else {
//                myMap.put(a, 1);
//            }
//            // 더 간단하게
//            myMap.put(a, myMap.getOrDefault(a, 0) + 1);
//        }

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        List<String> list1 = new ArrayList<>(Arrays.asList(participant));
        List<String> list2 = new ArrayList<>(Arrays.asList(completion));
        Map<String, Integer> myMap = new HashMap<>();

        for(String a : list1) {
            myMap.put(a, myMap.getOrDefault(a, 0) + 1);
        }
        for(String a : list2) {
            myMap.put(a, myMap.get(a)-1);
        }
        for(String a : myMap.keySet()) {
            System.out.println(a);
        }





    }
}
