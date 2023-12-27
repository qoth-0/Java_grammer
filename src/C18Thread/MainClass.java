package C18Thread;

public class MainClass {
    public static void main(String[] args) {
//        스레드의 생성방식 2가지
////        1. 상속관계로 스레드 생성
//        Thread etc1 = new ExtendsThreadClass();
//        etc1.start();
//        Thread etc2 = new ExtendsThreadClass();
//        etc2.start();
//        new ExtendsThreadClass().start(); // 이런식으로도 표현
////        스레드 실행 시 순차적으로 실행되지 않음
////      ExtendsThreadClass : Thread-2
////      ExtendsThreadClass : Thread-0
////      ExtendsThreadClass : Thread-1

////        2. 스레드 생성자로 Runnable객체를 주입 - 익명객체
////        Thread 클래스에 Runnable객체가 전달되어 사용자가 직접 정의한 run 메소드가 실행됨
//         new Thread(new RunnableImplementsClass()).start();
////         new Thread(new Runnable() {
////             @Override
////             public void run() {
////                 System.out.println("익명객체 스레드");
////             }
//////         }) -> 람다식으로 바꾸고 .start() 가능
////         new Thread(() -> System.out.println("익명객체 스레드")).start();

//         스레드의 동시성 이슈 테스트
////        1. 단일 스레드 일반 호출
//        for(int i=0; i<1000; i++) {
//            LibraryClass.borrowBook();
//        }
//        System.out.println("최종 남은 수랑 : " + LibraryClass.bookCount);

//        for(int i=0; i<1000; i++) {
//            new Thread(() -> LibraryClass.borrowBook()).start();
//        }
//        System.out.println("최종 남은 수랑 : " + LibraryClass.bookCount); // 음수가 나옴 - 동시에 borrowBook에 들어가기 때문

//        join 메소드를 통해 다른 스레드의 완료전까지 새로운 스레드가 실행되지 않도록 막음 - 멀티스레드 원천 차단
        for(int i=0; i<1000; i++) {
            Thread th = new Thread(() -> LibraryClass.borrowBook());
            th.start();
//            try {
//                th.join(); // 효용성 없음
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

//          syncronized 사용 - LibraryClass 참고
        }
        System.out.println("최종 남은 수랑 : " + LibraryClass.bookCount);



    }
}
