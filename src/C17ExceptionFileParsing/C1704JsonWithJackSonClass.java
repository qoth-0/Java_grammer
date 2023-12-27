package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C1704JsonWithJackSonClass {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        File myPath = Paths.get("src/C17ExceptionFileParsing/test_data2.json").toFile();
        try {
            JsonNode data2 = mapper.readTree(myPath);
            List<Student> studentList = new ArrayList<>();
            for(JsonNode a : data2.get("students")) { // List형태인 students의 내부 데이터를 뽑기 위해
                Student student = mapper.readValue(a.toString(), Student.class);
                studentList.add(student);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class Student {
    int id;
    String name;
    int classNumber;
    String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }
}
