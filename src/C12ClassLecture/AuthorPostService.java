package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AuthorPostService { // 실행
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>(); // author 테이블
        List<Post> posts = new ArrayList<>(); // post 테이블

        Long use = 0L;

        while(true) {
            Scanner sc = new Scanner(System.in);
//            회원가입, 게시글작성, 회원목록조회(회원email출력), 회원상세조회(id로 조회 - 회원명, 회원email, 작성글수), 게시글상세조회(제목,작성자email)
            System.out.println("사용할 서비스를 선택하세요. 1:회원가입 2:게시글작성 3:회원목록조회 4:회원상세조회 5:게시글상세조회");
            String service = sc.nextLine();
            switch (service) {
                case "1" :
                    System.out.println("이름을 입력해주세요.");
                    String name = sc.nextLine();

                    System.out.println("이메일을 입력해주세요.");
                    String email = sc.nextLine();

                    System.out.println("비밀번호을 입력해주세요.");
                    String password = sc.nextLine();
//                    객체 생성
                    Author author = new Author(name, email, password);
                    System.out.println("가입 사용자의 id는 " + author.getId() + "이름은 " + author.getName() + "이메일은 " + author.getEmail()+ "비밀번호는 " + author.getPassword());
                    authors.add(author);
                    use = author.getId();
                    break;
                case "2" :
                    System.out.println("제목을 입력해주세요.");
                    String title = sc.nextLine();
                    System.out.println("내용을 입력해주세요.");
                    String contents = sc.nextLine();
                    System.out.println("작성자 id를 입력해주세요.");
                    Long author_id = use;
                    Post post = new Post(title, contents, author_id);
                    System.out.println("작성자 id : " + use + "\n제목 : " + post.getTitle() + "\n내용 : " + post.getContents());
                    posts.add(post);
                    break;
                case "3" :
                    System.out.println("현재가입된 회원의 목록입니다.");
                    for(int i=0;i<authors.size();i++) {
                        System.out.println(authors.get(i).getEmail());
                    }
                    break;
                case "4" :
                    System.out.println("조회하실 회원의 id를 입력해주세요.");
                    int aid = sc.nextInt();
                    System.out.println("해당 회원의 이름은 " + authors.get(aid-1).getName()+ ",\nemail은 " + authors.get(aid-1).getEmail()+ "입니다.");
                    int count = 0;
                    for(int i=0; i<posts.size(); i++) {
                        if(aid == posts.get(i).getAuthor_id()) {
                            count++;
                        }
                    }
                    System.out.println("해당 회원이 작성한 글의 수는 " + count + "입니다.");
                    break;
                case "5" :
                    System.out.println("조회할 게시글 번호를 입력해주세요");
                    int pid = sc.nextInt();
                    System.out.println("해당 게시글의 제목은 " + posts.get(pid-1).getTitle() + "\n작성자 email은 " + authors.get((posts.get(pid-1).getAuthor_id().intValue())-1).getEmail() + "입니다.");
                    break;
                default:
                    System.out.println("번호를 확인해주세요.");
                    break;

            }
        }
    }
}

// 객체생성 - 엔티티
class Author {

    // 인스턴스 변수 생성
    private Long id;
    private String name;
    private String email;
    private String password;
//    static은 객체에 독립적, 클래스 전체에서 접근가능
//    위 객체 변수들은 각 객체가 생성되면 그 객체의 메모리에 따로 저장됨
    static Long static_id = 0L; // 기존 Long id 개선 - 자동 입력되게, Long은 참조형이라 기본값이 null - 0으로 초기화 필요

    // 생성자 : 모든 인스턴스 변수 초기화
   Author(String name, String email, String password) {
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // getter 생성
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

class Post {
    private Long id;
    private String title;
    private String contents;
    private Long author_id;
    static Long static_id = 0L;

    Post(String title, String contents, Long author_id) {
        static_id += 1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.author_id = author_id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Long getAuthor_id() {
        return author_id;
    }
}
