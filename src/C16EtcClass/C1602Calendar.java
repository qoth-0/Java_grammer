package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
//        LocalTime
        LocalTime present_time = LocalTime.now();
        System.out.println(present_time); // 17:39:47.307539200
        System.out.println(present_time.getHour()); // 17
        System.out.println(present_time.getMinute()); // 39
//        LocalDate
        LocalDate present_date = LocalDate.now();
        System.out.println(present_date); // 2023-12-22
//        LocalDateTime
        LocalDateTime thisTime = LocalDateTime.now();
        System.out.println(thisTime); // 2023-12-22T17:42:20.306995500





    }
}
