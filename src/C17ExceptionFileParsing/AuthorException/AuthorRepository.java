package C17ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class AuthorRepository { //  DB역할
    List<Author> authors;
    AuthorRepository() {
        authors = new ArrayList<>();
    } // 생성자로 모든 변수를 초기화하는게 관습적

    void register(Author author) {
        authors.add(author);

    }
    List<Author> getAuthors() {
        return authors;
    }
    Optional<Author> getAuthorByEmail(String email) { // 있을수도 없을수도 있으므로 Optional객체
        for(Author a : this.authors) {
            if(a.getEmail().equals(email)) {
                return Optional.of(a);
            }
        }
        return Optional.empty(); // 존재하지 않으면 empty return
    }


}
