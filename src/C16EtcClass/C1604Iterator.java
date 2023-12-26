package C16EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C1604Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

//        enhanced for문 : 원본이 변경X -> remove 불가
        for(String a : list) {
            System.out.println(a);
            // remove메소드 없음
        }
//        iterator 사용 : 참조하고있는 원본데이터 remove 가능
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
//            System.out.println(it.next());
            if(it.next().equals("banana")) {
                it.remove(); // next()로 꺼낸 해당 값을 remove
            }
        }
        System.out.println(list); // apple, cherry


    }
}
