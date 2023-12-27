package C18Thread;

public class ExtendsThreadClass extends Thread{
//    Thread클래스에 이미 구현되어 있는 run() 메소드는 아무 작업도 하지않은 빈 메소드
//    작업하고 싶은 내용을 run() 메소드를 오버라이딩하여 정의할 수 있다.
//    상속관계다보니, 다른 클래스 다중 상속 불가 -> Runnable 대체

    @Override
    public void run() { // 스레드가 시작되면 run메소드가 실행됨
        System.out.println("ExtendsThreadClass : " + Thread.currentThread().getName());
    }
}
