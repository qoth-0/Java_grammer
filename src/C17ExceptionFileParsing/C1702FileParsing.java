package C17ExceptionFileParsing;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C1702FileParsing {
    public static void main(String[] args) {
//        text파일 parsing
        Path filePath = Paths.get("src/C17ExceptionFileParsing/text_file.txt");
//        버퍼기능이 구현돼있고, nio 패키지에서는 non-blocking방식 사용

//        파일 쓰기 : write
        // getBytes기본이 StandardCharsets.UTF_8 - 생략가능,
        // StandardOpenOption - APPEND(추가), WRITE(덮어쓰기)
        // CREATE_NEW 이후에 APPEND 가능
        // 파일처리는 unchecked exception이므로 예외처리 강제
        try {
            if(Files.exists(filePath)) {
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
            }else {
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.CREATE_NEW);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        파일 읽기 : readString(파일 내 텍스트 그대로), readAllLines(\n을 기준으로 자름-리스트 형태)
        try {
            String st = Files.readString(filePath); // String을 반환 - 손흥민\n손흥민\n손흥민\n
            System.out.println(st);
//            readAllLines이용 - for문 출력
            List<String> line = Files.readAllLines(filePath); // List로 반환 - 손흥민, 손흥민, 손흥민
            for(String a : line) {
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
