package C15AnonymousLambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C1505StreamAPI {
    public static void main(String[] args) {
//        int[] arr = {20, 10, 4, 12};
////        전통적인 방식의 데이터 접근 방식
//        for(int i=0; i<arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식 - 원본을 변경시키지 않음
//        java에서 함수형 프로그래밍을 지원하기 위한 라이브러리 -> StreamApi

//        String[] myArr = {"world", "hello", "java"};
////        스트림의 생성 : <>(제네릭)타입으로 객체 생성됨
////        스트림의 반환값은 Stream<객체>형태
//        Stream<String> strStream = Arrays.stream(myArr);
//        IntStream intStream = Arrays.stream(arr); // 기본형의 경우 기본형스트림이 따로 존재
//
//        int[] intArr = intStream.filter(a -> a>20).toArray(); // toArray() : 배열로 변환 - 잘 안쓰고 바로 다른 함수로 계산함
//
////        참조변수의 스트림 변환의 경우 제네릭의 타입소거 문제 발생
////        제네릭의 타입소거란, 자바 버전의 호환성을 위해 제네릭타입을 런타임 시점에 제거하는 것을 의미
//        String[] stArr = strStream.filter(a -> a.length() <=4).toArray(a -> new String[a]); // int랑 달리 String의 경우 toArray()로 하면 에러발생, 어떤 타입으로 toArray할 건지 명시필요
////        메소드 참조방식으로 표현하는 것이 더 일반적 (클래스 :: 메소드)
//        String[] stArr2 = strStream.filter(a -> a.length() <=4).toArray(String[]::new);

//        스트림 중개연산 : filter, map, sorted, distinct
////        distinct : 중복제거 후 스트림 반환
//        int[] intArr = {10, 20, 10, 40, 40, 50};
//        int answer = Arrays.stream(intArr).distinct().sum(); // 중복제거 후 총합 반환
//        System.out.println(answer);
//
//        String[] strArr = {"자바", "파이썬", "자바", "C++"};
//        String[] newArr = Arrays.stream(strArr).distinct().toArray(String[]::new); // 중복제거 후 새로운 배열 생성
//
////        중복 제거 후 길이가 3개 이하의 것으로 제한하고, 남은 배열의 길이 총합 리턴
//        IntStream intStream = Arrays.stream(strArr).distinct().filter(a->a.length()<=3).mapToInt(a -> a.length()); // mapToInt() : IntStream타입으로 변환 -> 숫자연산 가능
//        System.out.println(intStream.sum()); // sum() : 총합 계산, IntStream타입만 사용 가능

//        sorted : 정렬된 스트림 반환
//        내림차순 정렬된 숫자 신규 배열 반환 - int 배열은 reverseOrder()불가능
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 5, 7));
//        collect(변환할 구체적 컬렉션 객체명시) : 해당 collect 객체로 변환
        List<Integer> newList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<String> stList = new ArrayList<>(Arrays.asList("hello", "java", "python", "C++"));
//        streamAPI를 사용해서 문자열의 길이가 4개 이상인, 그 길이를 기준으로 내림차순 정렬 후 신규 List 생성
        List<String> newStList = stList.stream().filter(a->a.length()>=4).sorted((o1, o2) -> o2.length() - o1.length()).collect(Collectors.toList());
        System.out.println(newStList); // python, hello, java

//        map : 값을 연산을 통해 변환
        int[] arr = {5, 1, 2, 3, 5, 4, 6, 7};
//        arr에 10씩 더한 새로운 배열 생성
        int[] arrPlus10 = Arrays.stream(arr).map(a -> a+10).toArray();
        System.out.println(Arrays.toString(arrPlus10));

//        arr에서 짝수만 골라서 해당 수의 제곱의 총합을 구하라
        int answer = Arrays.stream(arr).filter(a->a%2==0).map(a->a*a).sum();
        System.out.println(answer);

//        스트림 소모 : forEach, reduce
//        forEach
        Arrays.stream(arr).forEach(a-> System.out.println(a));
        Arrays.stream(arr).forEach(System.out::println); // 매개변수가 확정되어 있으므로 참조방식으로 사용 가능
//        reduce : 누적 연산
//        초기값을 지정하지 않으면 Optional 객체 return
//        Optional 객체 : 값이 있을수도 있고, 없을수도 있다는 것을 명시한 타입(java8 이후 추가) - null도 있을 수 있음
//        String st1 = null;
//        System.out.println(st1.length()); // NullPointerException
//        Optional<String> myOptional = Optional.ofNullable("hello");
//        if(myOptional.isPresent()) { // isPresent로 존재여부 확인해줘야 함
//            System.out.println(myOptional.get().length());
//        }

////        누적 곱
//        int result = Arrays.stream(arr).reduce(1, (a,b) -> a*b); // 초기값 1 설정으로 optional의 null 존재가능성을 없앰
//        System.out.println(result);
////        누적 합
//        int sum = Arrays.stream(arr).reduce(0, (a,b) -> a+b);
//        Arrays.stream(arr).reduce((a,b) -> a+b).getAsInt(); // 초기값없이 getAsInt()로도 가능
//        System.out.println(sum);
////        문자열 합치기
//        String[] str = {"hello", "java", "world"};
//        Optional<String> newString = Arrays.stream(str).reduce((a,b) -> a + ", " + b);
//        if(newString.isPresent()) { // isPresent() : null 체크
//            System.out.println(newString.get()); // hello, java, world
//        }

//        최소/최대/평균/총합/개수 : min/max/average/sum/count
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(myList.stream().mapToInt(a -> a).min().getAsInt()); // 1
        System.out.println(myList.stream().mapToInt(a -> a).max().getAsInt()); // 5
        System.out.println(myList.stream().mapToInt(a -> a).average().getAsDouble()); // 3.0
        System.out.println(myList.stream().mapToInt(a -> a).sum()); // 15
        System.out.println(myList.stream().count()); // 5

//        findFirst
        List<Student> myStudents = new ArrayList<>();
        myStudents.add(new Student("kim", 25));
        myStudents.add(new Student("lee", 37));
        myStudents.add(new Student("park", 35));
        myStudents.add(new Student("choi", 22));
        myStudents.add(new Student("kang", 27));
        Student s1 = myStudents.stream().filter(a->a.getAge()>=30).findFirst().get();
        System.out.println(s1); // 이름은 lee나이는 37 (조건에 부합하면 삽입순서로)

//        가장 어린 사람 찾기
        System.out.println(myStudents.stream().sorted(((o1, o2) -> o1.getAge() - o2.getAge())).findFirst().get());
//        30대가 몇명인가
        System.out.println(myStudents.stream().filter(a->a.getAge()>=30).count());
//        모든 객체의 평균나이
        System.out.println(myStudents.stream().mapToInt(a->a.getAge()).average().getAsDouble());
//        30세 이하 선착순 누구인지 출력?
        System.out.println(myStudents.stream().filter(a->a.getAge()<=30).findFirst().get());

//        기존의 java의 null
//        String st = null;
//        System.out.println(st.compareTo("abc")); // null은 참조불가

//        java8 이후에 나온 Optional 객체를 통해 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
//        Optional객체에 빈값을 명시적으로 넣는 방법 : Optional.empty();
        Optional<String> opt1 = Optional.empty();
//        System.out.println(opt1.get().compareTo("abc")); // NoSuchElementException - 빈값은 에러를 발생시킴

//        빈 값인지 아닌지 check하는 메소드 : isPresent()
        if(opt1.isPresent()) {
            System.out.println(opt1.get().compareTo("abc"));
        }else {
            System.out.println("값이 없습니다.");
        }

//        Optional 객체 생성
        Optional<String> opt2 = Optional.ofNullable("hello"); //ofNullable() : null이 있을 수도 있음을 의미 - null을 넣어도 에러 안남

//        orElse관련 메소드 사용하여 null(빈값) 처리
//        orElse(), orElseGet(), orElseThrow()
//        orElse(기본값) : 값이 있으면 해당 값 return, 없으면 default 지정값 return
        System.out.println(opt2.orElse("").compareTo("abc"));
//        orElseGet(함수) : 값이 있으면 해당값 return, 없으면 람다함수 또는 메소드 참조 실행
        System.out.println(opt1.orElseGet(() -> new String()).compareTo("abc"));
        System.out.println(opt1.orElseGet(String::new).compareTo("abc"));
//        orElseThrow() : 값이 있으면 해당값 return, 없으면 지정된 예외 강제 발생 - 자주 사용
        int result = opt1.orElseThrow(() -> new NoSuchElementException("객체에 값이 없습니다.")).compareTo("abc");
        System.out.println(result);

//        OptionalInt, OptionalDouble
        OptionalInt oi = new ArrayList<>(Arrays.asList(1,2,3,4)).stream().mapToInt(a -> a).max();
        // 방법 1 : isPresent()로 check
        if(oi.isPresent()) {
        }else{
        }
        // 방법 2 : orElse~ 의 방법 활용
        System.out.println(oi.orElseThrow(() -> new NoSuchElementException("no value")));


//        Optional.of() - null 못들어감
//        Optional.ofNullable() - null 들어갈 수 있음


    }
}
