package C17ExceptionFileParsing.AuthorException;

class Author {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Long static_id = 0L;

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

