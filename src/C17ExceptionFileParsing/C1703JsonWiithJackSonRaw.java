package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper; // jackson 라이브러리의 핵심 클래스

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C1703JsonWiithJackSonRaw {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper(); // json형태는 기본적으로 문자열""로 구성, java에서 사용하기 위해 map형태로 변환해주는 것이 jackson의 ObjectMapper클래스
        try {
//            readTree를 통해서 json을 계층적 트리구조 형태(=map형태)로 변환
            File myPath = Paths.get("src/C17ExceptionFileParsing/test_data1.json").toFile();
            JsonNode data1 = mapper.readTree(myPath); // JsonNode형태로 반환
            Map<String, String> student = new HashMap<>();
            student.put("id", data1.get("id").asText()); // get으로 value를 가져올 수 있음 , asText() : 스트링형태로 변환
            student.put("name", data1.get("name").asText());
            student.put("classNumber", data1.get("classNumber").asText());
            student.put("city", data1.get("city").asText());
            System.out.println(student); // city=seoul, name=student1, id=1, classNumber=1

//            Key, Value 모두 String일 경우 readValue로 바로 가져와서 Map구조로 변환가능
//            value의 타입이 예상되지 않을경우 Object타입으로도 받을 수 있음 <String, Object>
            Map<String, String> studentMap2 = mapper.readValue(myPath, Map.class); // Map.class로 Map구조로 변환
            System.out.println(studentMap2);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
