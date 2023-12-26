package C15AnonymousLambda;

import java.util.*;

public class C1504ComparableComparator {
    public static void main(String[] args) {
//        자바에서는 크기 비교를 위한 인터페이스가 대표적으로 2개 제공 : Comparable, Comparator

////        Comparable 인터페이스에는 compareTo메소드가 선언, 그리고 java의 많은 클래스에서 구현하고 있음
////        일반적으로 클래스 내에서 직접 구현(implements)해서 사용하는 방식을 취함
////        매개변수 한개
//
////        두 문자열의 각 문자르 앞에서부터 순차적으로 비교
////        문자열의 자릿수에 차이가 발생할 때, 그 문자의 유니코드 값의 차이를 반환 - 반환값이 음수면 왼쪽이 더 작은 문자, 0이면 같은 문자, 양수면 왼쪽이 더 큰 문자
//        // String에서 comparable을 implements(구현)했기 때문에 바로 사용 가능
//        String stringA = "hello";
//        String stringB = "horld";
//        System.out.println(stringA.compareTo(stringB)); // -10
//
//        List<String> list = new ArrayList<>();
//        list.add(stringA);
//        list.add(stringB);
//        Collections.sort(list); // Collectios 클래스의 static메소드 sort - 오름차순 : Comparable의 compareTo메소드를 통해 정렬
//        Collections.sort(list,Comparator.reverseOrder()); //  내림차순 - Comparator의 reverseOrder메소드 사용
//        list.sort(Comparator.naturalOrder());
//        list.sort(Comparator.reverseOrder());
//
//        // Integer에서 comparable을 implements(구현)했기 때문에 바로 사용 가능
//        Integer intA = 1;
//        Integer intB = 2;
//        System.out.println(intA.compareTo(intB));
//
////        Comparator 인터페이스에는 compare메소드가 선언되어있음
////        일반적으로 익명객체를 만들어서 활용
////        매개변수 두개
//
////        Student객체 정렬
//        List<Student> studentList = new ArrayList<>();
//
//        studentList.add(new Student("kim", 25));
//        studentList.add(new Student("lee", 22));
//        studentList.add(new Student("park", 52));
//        studentList.add(new Student("bae", 41));
//        studentList.add(new Student("hong", 50));
//
//        for(Student a : studentList) {
//            System.out.println(a); //  toString 자동 호출
//        }
//
////        방법 1 : Comparator를 익명객체 방식으로 활용하여 정렬, 매개변수 2개
////        나이로 정렬
////        studentList.sort(new Comparator<Student>() {
////            @Override
////            public int compare(Student o1, Student o2) {
////                // 기본적으로 오름차순 정렬 : o1.getAge()가 더 작은 숫자
////                return o1.getAge() - o2.getAge(); // 음수 - 기본 오름차순
//////                return o2.getAge() - o1.getAge(); // 양수 - 내림차순 설정
////            }
////        });
//        studentList.sort((o1, o2) -> o1.getAge() - o2.getAge()); // 이렇게도 표현 - 오름차순 정렬
//        System.out.println(studentList); // 이름은 lee나이는 22, 이름은 kim나이는 25, 이름은 bae나이는 41, 이름은 hong나이는 50, 이름은 park나이는 52
//
////        이름으로 정렬
//        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName())); // String은 compareTo
//
////        글자길이 수로 정렬
//        String[] strArr = {"hello", "java", "C++", "world2"};
//        Arrays.sort(strArr, (o1, o2) -> o1.length() - o2.length());
//        System.out.println(Arrays.toString(strArr)); // C++, java, hello, world2
//
////        Priority Queue 내림차순
//        Queue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
//        Queue<String> queue2 = new PriorityQueue<>((o1, o2) -> o2.length() - o1.length()); // 글자길이로
//
////        3, 30, 34, 5, 9 : 문자
////        이 문자를 결합하여 가장 큰 숫자를 만들어라
//        List<String> list1 = new ArrayList<>(Arrays.asList("3","30","34","5","9"));
//        list1.sort((o1, o2) -> (o2+o1).compareTo(o1+o2));
//        String answer = String.join("", list1);
//        System.out.println(answer);
//
//
//
////        방법 2 : Comparable 인터페이스 implements 후 compareTo메소드 구현, 매개변수 1개 - Student에 Comparable을 implement 해야함
//        Collections.sort(studentList); // 해당 컬렉션타입(studentList) 안에 있는 compareTo를 찾아서 실행함
//        Collections.sort(studentList, new Comparator<Student>() { // Comparator-compare을 사용 -> 람다변환 가능
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        System.out.println(studentList); // 이름은 bae나이는 41, 이름은 hong나이는 50, 이름은 kim나이는 25, 이름은 lee나이는 22, 이름은 park나이는 52
//
//        // Comparator가 편한듯

//        쓰레드 구현방식 : 쓰레드 상속, Runnable 방식
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 만든 쓰레드 입니다.");
            }
        });
        t1.start();
//        new Thread(() -> System.out.println("새로 만든 쓰레드입니다.")).start(); // lambda식으로 표현가능 + .start()하면 바로 실행

        System.out.println("main의 쓰레드 입니다.");

        // main의 쓰레드 입니다.
        // 새로 만든 쓰레드 입니다.
        // -> 코드 순차 실행이 아님



    }
}

//
class Student implements Comparable<Student>{
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


//    조상 클래스인 Object클래스의 toString메소드를 오버라이딩하여 객체호출 시 자동으로 toString메소드 호출
    @Override
    public String toString() {
        return "이름은 " + this.name + "나이는 " + this.age;
    }

    @Override
    public int compareTo(Student o) { // o와 this를 비교하는 것
        return this.name.compareTo(o.name);
    }
}
