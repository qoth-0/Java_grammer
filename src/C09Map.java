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

////        프로그래머스 : 완주하지 못한 선수 - list로 해결 시 효율성 테스트에서 실패(remove의 성능저하)
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//        Map<String, Integer> myMap = new HashMap<>();
//        String answer = "";
//
//        for(String a : participant) {
//            myMap.put(a, myMap.getOrDefault(a, 0) + 1);
//        }
//        for(String a : completion) {
//            myMap.put(a, myMap.get(a)-1);
//        }
//        for(String a : myMap.keySet()) {
//            if(myMap.get(a) != 0) {
//                answer = a;
//            }
//        }
//        System.out.println(answer);

////        이중 for문으로 해결 시 동명이인도 삭제됨 + 시간복잡도
//        for(int i=0; i<participant.length; i++) {
//            boolean isSame = false;
//            for(int j=0; j<completion.length; j++) {
//                if(participant[i].equals(completion[i]) {
//                    isSame = true;
//                }
//            }
//            if(!isSame) {
//                break;
//            }
//        }
////        list로 해결 시 시간복잡도의 문제가 생김
//        List<String> participant_list = new ArrayList<>(Arrays.asList(participant));
//        for(String a : completion) {
//            if(participant_list.contains(a)) {
//                participant_list.remove(a);
//            }
//        }
//        String answer = participant_list.get(0);

//        LinkedHashMap : 데이터 삽입 순서 유지
        Map<String, Integer> myMap1 = new LinkedHashMap<>();
        myMap1.put("hello5",1);
        myMap1.put("hello4",1);
        myMap1.put("hello3",1);
        myMap1.put("hello2",1);
        myMap1.put("hello1",1);
        System.out.println(myMap1); // hello5=1, hello4=1, hello3=1, hello2=1, hello1=1

//        TreeMap : key를 통해 데이터 정렬
        Map<String, Integer> myMap2 = new TreeMap<>();
        myMap2.put("hello5",1);
        myMap2.put("hello4",1);
        myMap2.put("hello3",1);
        myMap2.put("hello2",1);
        myMap2.put("hello1",1);
        System.out.println(myMap2); // hello1=1, hello2=1, hello3=1, hello4=1, hello5=1









    }
}
