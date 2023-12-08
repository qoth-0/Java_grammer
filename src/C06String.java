import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {

//        String a = "hello";
//        String b = "hello";
//        boolean c = (a==b);
//        System.out.println(c); // true

//        참조자료형 : 기본 자료형을 제외한 모든 자료형
//        Wrapper클래스 : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스

////        int와 integer간 형변환
//        int a = 10;
//        Integer b = new Integer(20);
////        묵시적변환
//        int c = b; // Integer->Int
//        Integer c = a;
////        명시적변환
//        int d = b.intValue(); // Integer -> Int
//        Integer d = Integer.valueOf(a);

////        String과 int의 형변환
//        int a = 10;
//        String st = Integer.toString(a); // "10"
//        int b = Integer.parseInt(st); // 10
////        int c = st; // 묵시적변환 불가

////        참조자료형에 원시자료형을 담을 때는 wrapper클래스를 써야함 함 ex)컬렉션 프레임 워크(List,set..
//        List<Integer> list = new ArrayList<>();
//        list.add(10); // add사용
//        list.add(20);
//        list.add(30);
//        System.out.println(list);

////        String 비교
//        String my_str1 = new String("hello");
//        String my_str2 = new String("hello");
//        String my_str3 = "hello";
//        String my_str4 = "hello";
//        String my_str5 =  my_str1;
//
//        System.out.println(my_str1 == my_str2); //false - 주소값이기 때문
//        System.out.println(my_str1 == my_str3); //false
//        System.out.println(my_str3 == my_str4); //true
//        System.out.println(my_str1 == my_str5); //true
////        == 은 주소를 비교하면서 동일한 객체인지까지 판별하므로 되도록 사용하지말것
//
//        System.out.println(my_str1.equals(my_str2)); //true
//        System.out.println(my_str1.equals(my_str3)); //true
//        System.out.println(my_str3.equals(my_str4)); //true
//        System.out.println(my_str1.equals(my_str5)); //true

////        문자열의 길이 : length(); , 공백도 문자열길이로 계산됨
//        String mySt = "hello";
//        System.out.println(mySt.length()); // 5

////      indexOf() : 특정 문자열의 위치 반환, 같은 문자가 있으면 가장 먼저 나오는 단어 반환
//        String mySt2 = "hello java";
//        System.out.println(mySt2.indexOf("java")); // 6

////        contains() : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        String mySt = "hello";
//        System.out.println(mySt.contains("he")); // true
//
////        CharAt :특정위치의 문자를 리턴
//        String a = "hello";
//        char myChar = a.charAt(1);
//        System.out.println(myChar); // e

////        특정문자가 몇개있는지 확인 - charAt, length
//        String a = "abcdaaaaff";
//        int myChar = 0;
//        for(int i=0; i<a.length(); i++){
//            if(a.charAt(i) == 'a'){
//                myChar++;
//            }
//        }
//        System.out.println(myChar); // 5
//
////        substring(a,b) : a 이상 b 미만의 index를 자른다.
//        String st1 = "hello World";
//        System.out.println(st1.substring(0,5)); // hello
//        System.out.println(st1.substring(6,st1.length())); // World

////        프로그래머스 substring 문제 : 가운데 글자 가져오기
//        String answer = "";
//        if (s.length() % 2 == 0){
//            answer = s.substring(s.length()/2-1,s.length()/2+1);
//        }else{
//            answer = s.substring(s.length()/2,s.length()/2+1);
//        }
//        return answer;

////      trim(), strip() : 왼쪽과 오른쪽에 있는 공백을 제거
//        String str = "       Hello world     ";
//        String trim = str.trim(); // trim()은 유니코드의 공백을 인식하지 못함
//        String strip = str.strip();
//        System.out.println(str);
//        System.out.println(trim);
//        System.out.println(strip);

////        toUpperCase(), toLowerCase() : 문자열 대소문자 변환하여 리턴
//        String a = "Hello";
//        String a1 = a.toUpperCase();
//        String a2 = a.toLowerCase();
//        System.out.println(a1); // HELLO
//        System.out.println(a2); // hello

////        문자열 더하기
//        String a = "hello";
//        a += " world";
//        System.out.println(a);

////        char -> String 형변환
//        char c = 'a';
//        String s = Character.toString(c);

////      알파벳 빼고 문자를 str2에 담기
//        String str = "012abc한글한글김한글df234";
//        String str2 = "";
//
//        for(int i=0;i<str.length();i++){
//           char temp = str.charAt(i);
//            if(temp < 'a' || temp > 'z'){
//                str2 += temp;
//            }
//        }
//        System.out.println(str2);

////      프로그래머스 특정 문자 제거하기
//        String answer = "";
//        for(int i=0; i<my_string.length(); i++){
//            char temp = my_string.charAt(i);
//            if(temp != letter.charAt(0)){
//                answer += temp;
//            }
//        }
//        return answer;

////        replace(a,b) : a문자를 b문자로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world","java");
//        System.out.println(st2);
//
////        replaceAll(a,b) : replace와 동일한 기능, regex 사용 가능
//        String st3 = st1.replaceAll("world","python");
//        System.out.println(st3);
//
//        String str = "012abcAB한글한글김한글df234";
////        [a-z] 소문자 알파벳, [A-Z] 대문자 알파벳
//        String en = str.replaceAll("[a-z]","");
//        System.out.println(en);
////        [가-힣] 한글
//        String hg = str.replaceAll("[가-힣]","");
//        System.out.println(hg);
////        [0-9] 숫자
//        String num = str.replaceAll("[0-9]","");
//        System.out.println(num);
////        [A-Za-z](대소문자)
//        String EN = str.replaceAll("[A-Za-z]","");
//        System.out.println(EN);
////        [A-Za-z0-9](대소문자,숫자)
//        String ENNUM = str.replaceAll("[A-Za-z0-9]","");
//        System.out.println(ENNUM);

////        pattern 클래스
////        알파벳으로만 이루어져 있는지 체크
//        boolean matcher1 = Pattern.matches("[a-z]+","helloworld");
//        System.out.println(matcher1); // true
//
////      전화번호 검증
////       \d:숫자 {}:연속으로
//        boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$","010-1234-5678");
//        System.out.println(matcher2); // true
//
////        이메일 검증
//        boolean matcher3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", "hello@naver.com");
//        System.out.println(matcher3); // true

////        split() : String -> String[]
//        String a = "a:b:c:d";
//        String[] strArr = a.split(":");
//        System.out.println(Arrays.toString(strArr)); // a, b, c, d
//
//        String b = "  a  b c d";
//        String[] strArr2 = b.split(" "); // 공백 하나를 기준으로 분할
//        System.out.println(Arrays.toString(strArr2)); //  , , a, , b, c, d
//
//        String c = b.trim();
//        String[] strArr3 = c.split("\\s+"); // 하나 이상의 공백을 기준으로 분할
//        System.out.println(Arrays.toString(strArr3)); // a, b, c, d

////        isEmpty() : 문자열이 비어있는지 여부 확인
////        null과 구분
//        String st1 = null;
//        String st2 = "";
//        System.out.println(st1 == null); // true
//        System.out.println(st2 == null); // false
//        System.out.println(st2.isEmpty()); // true
////        nullPointer Exception 예외 발생
////        System.out.println(st1.isEmpty()); // null은 함수 사용 불가

        String[] arr = new String[5];
        arr[0] = "hello";
        arr[1] = "world";

//        join() : String[] -> String
        String[] sarr = {"Java", "C", "Python", "C++", "C#",
                "HTML", "CSS", "JavaScript", "Ocaml"};
        String result = String.join(" ", sarr);
        System.out.println(result);




















//////////////////////////////////
////        String answer = sb.toString();
//        String A = "hello";
//        String B = "ohell";
//        int answer = -1;
//        StringBuilder sb = new StringBuilder(A);
//        for (int i=0; i<A.length(); i++) {
//            if(sb.toString().equals(B)) {
//                answer = i;
//                break;
//            }
//            sb.insert(0, sb.charAt(sb.length()-1));
//            sb.delete(sb.length()-1, sb.length());
//
//        }
    }
}
