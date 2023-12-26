package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C1602Calendar {
    public static void main(String[] args) {
//        날짜 관련 클래스의 종류 : Calendar(java.util), Local~(java.time) -> LocalDateTime 써라
        Calendar time = Calendar.getInstance();
        System.out.println(time.getTime()); // Fri Dec 22 17:28:45 KST 2023

//        특정한 숫자값은 get함수의 input값으로 주어 원하는 날짜 정보를 출력할 수 있게 해준다.
        System.out.println(time.get(1)); // 2023 - 1은 연도를 의미
        System.out.println(time.get(2) + 1); // 12 - 2는 월을 의미, 0부터 시작
        System.out.println(time.get(Calendar.YEAR)); // 2023
        System.out.println(time.get(Calendar.MONTH)+1); // 12
        System.out.println(time.get(Calendar.DAY_OF_MONTH)); // 22
        System.out.println(time.get(Calendar.DAY_OF_WEEK)); // 6 - 금요일
        System.out.println(time.get(Calendar.HOUR_OF_DAY)); // 시
        System.out.println(time.get(Calendar.MINUTE)); // 분
        System.out.println(time.get(Calendar.SECOND)); // 초

//        java.time패키지 : Local~ 클래스
//        now() : 현재 날짜와 시간
//        LocalTime
        LocalTime present_time = LocalTime.now();
        System.out.println(present_time); // 17:39:47.307539200
        System.out.println(present_time.getHour()); // 17
        System.out.println(present_time.getMinute()); // 39
//        LocalDate
        LocalDate present_date = LocalDate.now();
        System.out.println(present_date); // 2023-12-22
//        LocalDateTime - 가장 많이 사용
        LocalDateTime thisTime = LocalDateTime.now();
        System.out.println(thisTime); // 2023-12-22T17:42:20.306995500

//      임의로 특정시간을 만들어 내고 싶을 때 : of 메소드 사용
        LocalDate localDate = LocalDate.of(1998, 02, 10);
//        일반 내장 메소드
        System.out.println(localDate.getYear()); // 1998
        System.out.println(localDate.getMonth()); // FEBRUARY
        System.out.println(localDate.getDayOfMonth()); // 10

        LocalTime localTime = LocalTime.of(12, 02, 17);

        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);

//        크로노필드 enum 타입 사용
        System.out.println(localDateTime.get(ChronoField.YEAR)); // 1998
        System.out.println(localDateTime.get(ChronoField.MONTH_OF_YEAR)); // 2 - 캘린더와달리 1부터 시작
        System.out.println(localDateTime.get(ChronoField.AMPM_OF_DAY)); // 1 (0:오전, 1:오후)
////        크로노필드는 내장 메소드와 달리 매개변수로 받아 사용할 수 있음 - 프로그램의 유연성 향상
//        void printCalendar(LocalDateTime ldt, ChronoField cf) {
//            if(cf == ChronoField.YEAR) {
//                System.out.println("연도는 ~ 입니다.");
//            }else if(cf == ChronoField.MONTH_OF_YEAR) {
//                System.out.println("월은 ~ 입니다.");
//            }
//        }
//        printCalendar(localDateTime, ChronoField.YEAR);

//        현재시간은 오전/오후 입니다.
//        DB의 datetime과 LocalDateTime은 sync - datetime.get(크로노필드)로 사용할 수 있음
        if(LocalDateTime.now().get(ChronoField.AMPM_OF_DAY) == 0) {
            System.out.println("현재시간은 오전입니다.");
        }else System.out.println("현재시간은 오후입니다.");






    }
}
