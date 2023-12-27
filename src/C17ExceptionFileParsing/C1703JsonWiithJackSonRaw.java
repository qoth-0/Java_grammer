package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper; // jackson 라이브러리의 핵심 클래스

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C1703JsonWiithJackSonRaw {
//    최종목표 : json파일 내용을 이용하여 student 객체 생성하기
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper(); // json형태는 기본적으로 문자열""로 구성, java에서 사용하기 위해 map형태로 변환해주는 것이 jackson의 ObjectMapper클래스
        try {
//            readTree를 통해서 json을 계층적 트리구조 형태(=map형태)로 변환
            JsonNode data1 = mapper.readTree(Paths.get("src/C17ExceptionFileParsing/test_data1.json").toFile()); // JsonNode형태로 반환
            Map<String, String> student = new HashMap<>();
            student.put("id", data1.get("id").asText()); // get으로 value를 가져올 수 있음 , asText() : 스트링형태로 변환
            student.put("name", data1.get("name").asText());
            student.put("classNumber", data1.get("classNumber").asText());
            student.put("city", data1.get("city").asText());
            System.out.println(student); // city=seoul, name=student1, id=1, classNumber=1
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
