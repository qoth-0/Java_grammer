import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class C11StackQueueDeque {
    public static void main(String[] args) {

//        Stack<Integer> mySt = new Stack<>();
//        mySt.push(10);
//        mySt.push(20);
//        mySt.push(30);
////        push : 스택에서 요소를 제거 후 해당 요소 반환
//        System.out.println(mySt.pop()); // 30
////        peek : 스택에서 마지막 요소 반환 - 제거 x
//        System.out.println(mySt.peek()); // 20
//        System.out.println(mySt); // 10, 20

//        Stack<String> myHistory = new Stack<>();
//        myHistory.add("홈화면");
//        myHistory.add("회원가입");
//        myHistory.add("로그인");
//        myHistory.add("게시판");
//        myHistory.add("글쓰기");
////        String 5개 정도 추가 후 while문을 통해 모두 출력
//        while(!myHistory.isEmpty()) {
//            System.out.println(myHistory.pop());
//        }

////        웹페이지 방문한 사이트 출력 + 뒤로가기 기능 구현
////        스캐너로 신규 사이트 방문 or 뒤로가기 받기
////        신규사이트 방문일경우 - 해당 주소 push
////        뒤로가기일 경우 - 해당 주소 pop
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            System.out.println("어디로 이동하시겠습니까?");
//            String c = sc.nextLine();
//            if(c.equals("뒤로가기")) {
//                if(!myHistory.isEmpty()) {
//                    myHistory.pop();
//                    if (!myHistory.isEmpty()) {
//                        System.out.println(myHistory.peek() + "로 이동했습니다.");
//                    }
//                    else {
//                        System.out.println("돌아갈 페이지가 없습니다.");
//                        break;
//                    }
//                }
//            }
//            else{
//                myHistory.push(c);
//                System.out.println(myHistory.peek() + "로 이동했습니다.");
//            }
//
//        }

////        map으로 구현
//        Scanner sc = new Scanner(System.in);
//        Map<Integer, String> map = new TreeMap<>();
//        int index = 0;
//        map.put(0,"홈화면");
//        while(true) {
//            System.out.println("어디로갈래");
//            String c = sc.nextLine();
//            if(c.equals("뒤로가기")){
//                if(!map.isEmpty()){
//                    index--;
//                    System.out.println(map.get(index)+"로 이동했습니다.");
//                }else {
//                    if(map.get(index) == null)
//                    System.out.println("돌아갈 곳이 없습니다.");
//                    break;
//                }
//
//
//            }
//            else if (c.equals("앞으로가기")) {
//                index++;
//                System.out.println(map.get(index)+"로 이동했습니다.");
//
//            }
//            else {
//                index++;
//                map.put(index,c);
//                System.out.println(map.get(index)+"로 이동했습니다.");
//
//            }
//        }

////        큐 선언
//        Queue<Integer> q = new LinkedList<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
////         poll() : 요소를 제거 후 해당 요소 반환
//        System.out.println(q.poll()); // 10
//        System.out.println(q); // 20, 30

////        프린트 대기열 예제
////        문서1 추가, 문서 2 추가, 문서 3 추가
//        Queue<String> q = new LinkedList<>();
//        q.add("문서1");
//        q.add("문서2");
//        q.add("문서3");
//        while(!q.isEmpty()) {
//            System.out.println("현재 인쇄 중인 문서 : " +q.poll());
//        }

////        길이의 제한이 있는 큐 : ArrayBlockingQueue
//        Queue<String> q = new ArrayBlockingQueue<>(3);
////        add와 offer의 차이 : add는 길이가 다 찼을 때 에러를 발생. offer는 공간이 충분할때만 add(에러발생 x)
////        q.add("hello1");
////        q.add("hello2");
////        q.add("hello3");
////        q.add("hello4"); // Queue full 에러 발생
//        q.offer("hello1");
//        q.offer("hello2");
//        q.offer("hello3");
//        q.offer("hello4");
//        System.out.println(q); // hello1, hello2, hello3

////        우선순위큐
//        Queue<Integer> q = new PriorityQueue<>();
//        q.add(30);
//        q.add(20);
//        q.add(10);
//        q.add(40);
//        q.add(50);
//        System.out.println(q); // 10, 30, 20, 40, 50 : 힙구조
//        while(!q.isEmpty()) {
//            System.out.println(q.poll()); // 10 -> 20 -> 30 -> 40 -> 50
//        }

////        프로그래머스 : 더 맵게
//        int[] scoville = {1, 2};
//        int K = 7;
//        int answer = 0;
//        int a, b, c;
//        Queue<Integer> q = new PriorityQueue<>();
//        for(int s : scoville) {
//            q.add(s);
//        }
//        while(q.peek() < K) {
//            a = q.poll();
//            if(!q.isEmpty()) {
//                b = q.poll();
//                c = a + (b*2);
//                answer++;
//                q.add(c);
//            }else {
//                answer = -1;
//                break;
//            }
//        }
//        System.out.println(answer);

////        list로 구현 - 시간초과 발생
//        int[] scoville = {1, 2};
//        int k = 7;
//        int a, b, c;
//        int answer = 0;
//        List<Integer> list = new ArrayList<>();
//        for(int s : scoville) {
//            list.add(s);
//        }
//        Collections.sort(list);
//        while(list.get(0) < k) {
//            a = list.get(0);
//            list.remove(0);
//            if(!list.isEmpty()) {
//                b=list.get(0);
//                list.remove(0);
//                c = a + (b*2);
//                answer++;
//                list.add(c);
//                Collections.sort(list);
//            }else {
//                answer = -1;
//                break;
//            }
//
//        }
//        System.out.println(answer);

//        ArrayDeque : 양방향에서 데이터를 삽입/제거 가능 성능이 스택,큐보다 빠름
        Deque<Integer> deque = new ArrayDeque<>();
//        addFirst() : 맨앞에 삽입
        deque.addFirst(10);;
        deque.addFirst(20); // 20 10
//        peekLast() : 맨뒤 요소 반환, 삭제 x
        System.out.println(deque.peekLast()); // 10
        deque.addLast(30);
        System.out.println(deque); // 20 10 30
//        pollFirst(), pollLast() : 요소 반환 및 삭제
        System.out.println(deque.pollFirst()); // 20
        System.out.println(deque.pollLast()); // 30
        System.out.println(deque); // 10








    }
}
