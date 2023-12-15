package C12ClassLecture;

public class C1204Constructor {
    public static void main(String[] args) {
        Calender cal1 = new Calender("2023", "12", "15"); // 생성자 1 실행
//        Calender cal2 = new Calender("2023", "12"); // 생성자 2 실행
//        Calender cal3 = new Calender(); // 생성자 3 실행

    }

}

//    내부클래스 Calender
class Calender {

    //    인스턴스 변수 year, month, day 생성 - private
    private String year, month, day;

    //    생성자 1 : year, month, day를 초기화
    Calender(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;

    }

//    //    생성자 2 : year, month를 초기화
//    Calender(String year, String month) {
//        this.year = year;
//        this.month = month;
//
//
//    }
//
//    //    생성자 3 : 초기화 없음
//    Calender() {
//
//    }

//    생성자들의 내용이 중복되어 this함수로 사용자가 매개변수를 입력한 갯수에 맞게 알아서 세팅 - 생성자 1만 만들어 놓으면 됨
    Calender(String year, String month) {
    //        this() 키워드를 통해 클래스 내 매개변수에 맞는 생성자 호출 가능
        this(year, month, null);  // 생성자 2와 같은 효과(매개변수2개)

    }

    Calender(String year) {
//        this() 키워드를 통해 클래스 내 매개변수에 맞는 생성자 호출 가능
        this(year, null, null);

    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
}
