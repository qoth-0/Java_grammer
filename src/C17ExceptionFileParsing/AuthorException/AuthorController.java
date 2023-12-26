package C17ExceptionFileParsing.AuthorException;

import java.util.*;

class AuthorController {
    public static void main(String[] args) {
//        메모리 DB에 넣고있는 데이터 추가/삭제 부분은 repository로 분리 - AuthorRepository 클래스 생성
//        controller(입력받고, 객체 생성, try/catch) -> service(비지니스 로직 - 회원가입, 로그인 - throw new) -> repository(list에 add)
       AuthorService authorService = new AuthorService();

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("사용할 서비스를 선택하세요. 1:회원가입 2:로그인");
            String service = sc.nextLine();
            switch (service) {
                case "1" :
                    System.out.println("이름을 입력해주세요.");
                    String name = sc.nextLine();

                    System.out.println("이메일을 입력해주세요.");
                    String email = sc.nextLine();

                    System.out.println("비밀번호을 입력해주세요.");
                    String password = sc.nextLine();
                    Author author = new Author(name, email, password);
                    try{
                        authorService.register(author); // trycatch
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "2" :
                    System.out.println("로그인 하실 이메일을 입력해주세요.");
                    String author_email = sc.nextLine();
                    System.out.println("password를 입력해주세요.");
                    String author_password = sc.nextLine();
                    Optional<Author> loginedAuthor = Optional.empty();
                    try {
                        loginedAuthor = authorService.login(author_email, author_password); // trycatch
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    if(loginedAuthor.isPresent()) {
                        System.out.println(loginedAuthor.get().getName() + "님 환영합니다.");
                    }
                    break;

                default:
                    System.out.println("번호를 확인해주세요.");
                    break;

            }
        }
    }
}