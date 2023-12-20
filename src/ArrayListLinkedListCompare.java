import C14Interface.InterfaceMain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListCompare {
    public static void main(String[] args) {
//        Linkedlist, Arraylist 비교
//        삽입 성능 확인
        long startTime = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<100000; i++) {
            list.add(0, 10);
        }
        long endTime = System.currentTimeMillis();
//        ArrayList는 400, LinkedList는 7 - 차이 많음
        System.out.println(endTime-startTime);

//        조회 성능 확인
        long startTime2 = System.currentTimeMillis();
        for(int i=0; i<100000; i++) {
            list.get(i);
        }
        long endTime2 = System.currentTimeMillis();
//        Linkedlist는 3160, ArrayList는 2
        System.out.println(endTime2-startTime2);
    }
}
