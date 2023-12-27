package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class C1705JsonWiithJackSonHttp {
    public static void main(String[] args) {
//        자바에 내장된 http 라이브러리를 이용해서 웹에 있는 testdata parsing하기
//        http클라이언트 생성
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();
//        http 요청 객체 생성
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1")) // create(요청할 주소) - 단일 데이터
                .GET() // 데이터를 받기위한 GET요청
                .build();
//        http응답객체 생성
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // 값을 string으로 반환
            String post = response.body();
            JsonNode jsonNode = mapper.readTree(post);
//            Map없이 바로 매개변수로 입력
            Post post1 = new Post(jsonNode.get("userId").asInt(), jsonNode.get("id").asInt(), jsonNode.get("title").asText(), jsonNode.get("body").asText());
            System.out.println(post1);
//            readValue를 사용해서 객체로 곧바로 매핑 - 기본생성자 필요
            Post post2 = mapper.readValue(post, Post.class); // Post.class로 Post클래스 형태로 바로 변환
            System.out.println(post2);

//            JsonNode는 트리구조이므로, for(JsonNode j : jsonNode)형식 가능 (리스트형태도 같은 JsonNode형식으로 받기 가능)

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

class Post {
//    getter/생성자/toString메소드 만들기

    int userId;
    int id;
    String title;
    String body;

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
    Post() {

    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "id : " + id + " title : " + title;
    }
}
