package C17ExceptionFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class AuthorService { // 비즈니스 로직 처리
    AuthorRepository authorRepository;
    AuthorService() {
        authorRepository = new AuthorRepository();
    }
    void register(Author author) throws IllegalArgumentException{
//        만약에 password가 5자리 이하이면 예외 발생(IllegalArgument)
//        기존에 같은 email이 있는지도 체크
        if(author.getPassword().length() < 5) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
        Optional<Author> author1 = authorRepository.getAuthorByEmail(author.getEmail());
        if(author1.isPresent()) {
            throw new IllegalArgumentException("이미 존재하는 email입니다.");
        }
        authorRepository.register(author); // authorrepository에 register 만들어서 사용

    }
    Author login(String email, String password) throws IllegalArgumentException, NoSuchElementException {
        Optional<Author> author = authorRepository.getAuthorByEmail(email);
//        email이 존재하지 않으면 예외발생(NoSuchElement)
//        password가 틀리면 예외발생(IllegalArgument)
        if(!author.isPresent()) {
            throw new NoSuchElementException("존재하지 않는 email입니다.");
        }
        if(!author.get().getPassword().equals(password)) {
            throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
        }
        return author.get(); // author를 get()으로 꺼냄 - controller에서 optional로 받을 필요 없음 : 존재할테니까
    }
}
