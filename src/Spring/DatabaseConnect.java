package Spring;


import java.sql.*;

//  서버 DB와 연결하기
public class DatabaseConnect {
    public static void main(String[] args) {
//        db의 url : localhost:3306
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false"; // 3306-mariaDB
        String userName = "root";
        String pw = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, userName, pw); // url로 찾아가서 userName과 pw로 접속
            System.out.println("DB 커넥션 성공");
//            Statement : 쿼리를 담아 db로 보낼 수 있는 객체
            Statement st = conn.createStatement();
            String myQuery = "select * from author";
            ResultSet rs = st.executeQuery(myQuery); // executeQuery : 쿼리 실행 / ResultSet은 받은 결과의 데이터 형태
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id : " + id + " name : " + name);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
