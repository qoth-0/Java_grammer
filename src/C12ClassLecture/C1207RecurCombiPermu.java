package C12ClassLecture;

import java.util.*;

public class C1207RecurCombiPermu {
//    순열과 조합
    static int max = 0;
    static int temp = 0;
    public static void main(String[] args) {

//        조합 combination
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> combinations = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//
////        for(int i=0; i<list.size()-1; i++) {
////            for(int j=i+1; j<list.size(); j++) {
////                List<Integer> temp = new ArrayList<>();
////                temp.add(list.get(i));
////                temp.add(list.get(j));
////                combinations.add(temp);
////            }
////        }
////        System.out.println(combinations); // [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
//
//////        재귀로 만들기 위해 for문 반복 구성하기
////        List<Integer> temp = new ArrayList<>();
////        for(int i=0; i<list.size(); i++) {
////            temp.add(list.get(i));
////            for(int j=i+1; j<list.size(); j++) {
////                temp.add(list.get(j));
////                combinations.add(new ArrayList<>(temp));
////                temp.remove(temp.size()-1);
////            }
////            temp.remove(temp.size()-1);
////        }
////        System.out.println(combinations);
//
//        C1207RecurCombiPermu main = new C1207RecurCombiPermu();
//
//        main.combinations(list, combinations, temp, 0, 3);
//        System.out.println(combinations);

//        순열 permutation
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> permutatios = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        C1207RecurCombiPermu main = new C1207RecurCombiPermu();
        main.permuMax2(list, 3, new boolean[list.size()], 0);
        System.out.println(max);

    }
//        재귀함수로 구현한 조합
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

//    재귀함수로 구현한 순열
//    중복제거
    void permutation (List<Integer> list, List<List<Integer>> permutations, List<Integer> temp,int n, boolean[] visited) {
        if(temp.size() == n) {
            permutations.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<list.size(); i++) {
            if(visited[i] == false) { // 같은 숫자 반복 안되도록
                visited[i] = true;
                temp.add(list.get(i));
                permutation(list, permutations, temp, n, visited);
                visited[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }

//    합계가 6 이상인 2개의 순열만 add
    void sumPerTwo (List<Integer> list, List<List<Integer>> permutations, List<Integer> temp, int n, boolean[] visited) {
        if(temp.size() == n) {
            int sum = 0;
            for(int i=0; i<temp.size(); i++) {
                sum += temp.get(i);
                if(sum >= 6) {
                    permutations.add(new ArrayList<>(temp));
                }
            }

        }

        for(int i=0; i<list.size(); i++) {
            if(visited[i] == false) {
                visited[i] = true;
                temp.add(list.get(i));
                sumPerTwo(list, permutations, temp, n, visited);
                visited[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }

//    합계가 6 이상인 모든 순열 add
void sumPerAll (List<Integer> list, List<List<Integer>> permutations, List<Integer> temp, boolean[] visited) {

    int sum = 0;
    for(int i=0; i<temp.size(); i++) {
        sum += temp.get(i);
    }
    if(sum >= 6) {
        permutations.add(new ArrayList<>(temp));
    }

    for(int i=0; i<list.size(); i++) {
        if(visited[i] == false) {
            visited[i] = true;
            temp.add(list.get(i));
            sumPerAll(list, permutations, temp, visited);
            visited[i] = false;
            temp.remove(temp.size()-1);
        }
    }
}

//    모든 순열에서 합계가 가장 큰 값 찾기
void permuMax (List<Integer> list, List<List<Integer>> permutations, List<Integer> temp, boolean[] visited) {

    int sum = 0;
    for(int i=0; i<temp.size(); i++) {
        sum += temp.get(i);
        if(sum > max) {
            max = sum;
        }
    }

    for(int i=0; i<list.size(); i++) {
        if(visited[i] == false) {
            visited[i] = true;
            temp.add(list.get(i));
            permuMax(list, permutations, temp, visited);
            visited[i] = false;
            temp.remove(temp.size()-1);
        }
    }
}

    //    3개 조합의 순열에서 합계가 가장 큰 값 찾기 (temp리스트 사용 금지)
    void permuMax2 (List<Integer> list, int n, boolean[] visited, int sum) {

        if(temp == n && sum > max) {
            max = sum;
        }
//         return?

        for(int i=0; i<list.size(); i++) {
            if(visited[i] == false) {
                visited[i] = true;
                temp ++;
                sum += list.get(i);
                permuMax2(list, n, visited, sum);
                visited[i] = false;
                sum -= list.get(i);
                temp --;
            }
        }
    }

////    강사님 풀이
//    void permutation(List<Integer> myList, List<List<Integer>> combi_list, boolean[] visited, int temp, int count) {
//        if(count == 3) {
//            if(temp > max) {
//                max = temp;
//            }
//            return;
//
//        }
//        for(int i=0; i<myList.size(); i++) {
//            if(visited[i] == false) {
//                visited[i] = true;
//                temp += myList.get(i);
//                permutation(myList, combi_list, visited, temp, count+1);
//                temp -= myList.get(i);
//                visited[i] = false;
//            }
//        }
//    }

////    프로그래머스 문제 : 피로도
//static int max = 0;
//    static int temp = 0;
//    public static void main(String[] args) {
//        int k = 80;
//        int[][] dungeons = {{80,20},{50,40},{30,10}};
//        boolean[] visited= new boolean[dungeons.length];
//        Main main = new Main();
//        main.d(k, dungeons, visited);
//        System.out.println(max);
//
//    }
//    void d (int k, int[][] dungeons, boolean[] visited) {
//
//        if(temp > max) {
//            max = temp;
//        }
//        if(max == dungeons.length) {
//            return;
//        }
//
//        for (int i = 0; i < dungeons.length; i++) {
//            if (visited[i] == false && k >= dungeons[i][0]) {
//                visited[i] = true;
//                temp++;
//                k -= dungeons[i][1];
//                d(k, dungeons, visited);
//                visited[i] = false;
//                temp--;
//                k += dungeons[i][1];
//            }
//        }
//    }

////    d유정이 코드 ~~정석~~
//class Solution {
//    static int answer = 0;
//    public int solution(int k, int[][] dungeons) {
//        boolean[] visited = new boolean[dungeons.length];
//        DFS(0, k, visited, dungeons);
//        return answer;
//    }
//    static void DFS(int L, int k, boolean[] visited, int[][] dungeons){
//        for(int i=0; i<dungeons.length; i++){
//            if(!visited[i] && k>=dungeons[i][0]) {
//                visited[i]=true;
//                DFS(L+1, k-dungeons[i][1], visited, dungeons);
//                visited[i]=false;
//            }
//        }
//        answer = Math.max(answer, L);
//    }
//}


}
