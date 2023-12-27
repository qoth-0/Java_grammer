package C18Thread;

public class LibraryClass {
    static int bookCount = 100;
//    public static void borrowBook() {
//    syncronized키워드를 통해 해당 메소드(자원)에 한해서 lock을 걸도록 설정
    public synchronized static void borrowBook() {
        if(bookCount > 0) {
//            책을 빌리는 시간을 10밀리초로 가정
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            bookCount--;
            System.out.println("대출 완료");
            System.out.println("남은 책 수량 : " + bookCount);

        }else {
            System.out.println("대출 불가");
        }
    }
}
