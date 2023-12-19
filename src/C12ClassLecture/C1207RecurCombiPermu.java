package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C1207RecurCombiPermu {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

//        for(int i=0; i<list.size()-1; i++) {
//            for(int j=i+1; j<list.size(); j++) {
//                List<Integer> temp = new ArrayList<>();
//                temp.add(list.get(i));
//                temp.add(list.get(j));
//                combinations.add(temp);
//            }
//        }
//        System.out.println(combinations); // [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]

////        재귀로 만들기 위해 for문 반복 구성하기
//        List<Integer> temp = new ArrayList<>();
//        for(int i=0; i<list.size(); i++) {
//            temp.add(list.get(i));
//            for(int j=i+1; j<list.size(); j++) {
//                temp.add(list.get(j));
//                combinations.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(combinations);

        C1207RecurCombiPermu main = new C1207RecurCombiPermu();

        main.combinations(list, combinations, temp, 0, 3);
        System.out.println(combinations);
    }
//        재귀함수로 구현
    void combinations(List<Integer> list, List<List<Integer>> combinations, List<Integer> temp, int start, int n) {

        if(temp.size() == n) {
            combinations.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start; i<list.size(); i++) {
            temp.add(list.get(i));
            combinations(list, combinations, temp, i+1, n);
            temp.remove(temp.size()-1);
        }
    }

}
