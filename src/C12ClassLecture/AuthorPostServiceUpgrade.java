package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorPostServiceUpgrade {
//     Author객체는 post리스트를 가지고있고, Post객체는 Author 객체를 가지고있어서 하나의 함수 안에서 post와 author를 함께 조회할 수 있게 변환
    public static void main(String[] args) {
        List<AuthorUpgrade> authors = new ArrayList<>();
        List<PostUpgrade> posts = new ArrayList<>();
        while(true){
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            System.out.println("1번:회원가입, 2번:게시글작성, 3번:회원목록조회, 4번:회원상세조회, 5번:게시글상세조회 ");
            switch (number){
                case 1:
                    System.out.println("회원가입하실 이름을 입력해주세요");
                    String name = sc.nextLine();
                    System.out.println("회원가입하실 이메일을 입력해주세요");
                    String email = sc.nextLine();
                    AuthorUpgrade author1 = new AuthorUpgrade(name, email);
                    authors.add(author1);
                    break;
//                    존재하는 이메일로만 게시글 작성 가능하도록 업그레이드
                case 2:
                    System.out.println("작성자 email를 입력해주세요");
                    String author_email = sc.nextLine();
                    AuthorUpgrade temp_author = null;
                    for(AuthorUpgrade a: authors){
                        if(a.getEmail().equals(author_email)){
                            temp_author = a;
                            break;
                        }
                    }
                    if(temp_author == null) {
                        System.out.println("email을 다시 입력하세요");
                        continue;
                    }
                    System.out.println("게시글명을 입력해주세요");
                    String title = sc.nextLine();
                    System.out.println("게시글 내용을 입력해주세요");
                    String contents = sc.nextLine();
                    PostUpgrade post1 = new PostUpgrade(title, contents, temp_author);
                    posts.add(post1);
//                    AUthor객체의 post list에 post추가
                    temp_author.addPost(post1);

                    break;
    //                    회원목록조회
                case 3:
                    for(AuthorUpgrade a : authors){
                        System.out.println(a.getEmail());
                    }
                    break;
    //                    회원상세조회 : 이름, email, 작성글수
                case 4:
                    System.out.println("author email를 입력해주세요"); // 사용자는 본인의 id를 모름 - email로 조회가능하게 하기.
                    String author_email2 = sc.nextLine();
                    AuthorUpgrade temp_author2 = null;
                    for(AuthorUpgrade a : authors) {
                        if(a.getEmail().equals(author_email2)) {
                            temp_author2 = a;
                            break;
                        }
                    }

                    System.out.println(author_email2 + "의 이름은 " + temp_author2.getName() + ", 이메일은 " + temp_author2.getEmail() + ", 작성한 글 수는 " + temp_author2.getPosts().size() + "입니다.");

                    break;
    //                    게시글상세조회
                case 5:
                    System.out.println("post id를 입력해주세요");
                    Long post_id = Long.parseLong(sc.nextLine());
                    PostUpgrade temp_post = null;
                    for(int i=0; i<posts.size(); i++){
                        if(posts.get(i).getId() == post_id){
                            temp_post = posts.get(i);
                            break;
                        }
                    }
                    System.out.println(temp_post.getTitle() + " " + temp_post.getAuthor().getEmail());
                    break;
            }

        }
    }
}

//엔티티
class AuthorUpgrade{
    private Long id;
    private String name;
    private String email;
    private List<PostUpgrade> posts; // 포스트 lsit 변수
    static Long static_id = 0L;
    AuthorUpgrade(String name, String email){
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.posts = new ArrayList<>();
    }
    void addPost(PostUpgrade post) {
        this.posts.add(post);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<PostUpgrade> getPosts() {
        return posts;
    }
}
class PostUpgrade{
    private Long id;
    private String title;
    private String contents;
    private AuthorUpgrade author; // author 객체를 통으로
    static Long static_id = 0L;
    PostUpgrade(String title, String contents, AuthorUpgrade author){
        static_id += 1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.author = author;
//        this.author.addPost(this); - 47행 대신 이렇게 넣어도 됨
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

    public AuthorUpgrade getAuthor() {
        return author;
    }
}