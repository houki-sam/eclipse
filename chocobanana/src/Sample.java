import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Sample {

    public static void main(String... args) throws Exception {

        String url = "jdbc:db2://localhost:50000/TESTDB";
        String user = "DB2INST1";
        String pass = "aaa";

        // Java 1.5ぐらいから自動でロードされる
        Class.forName("com.ibm.db2.jcc.DB2Driver");

        try (Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement()) {

        	stmt.execute("DROP TABLE auth_users");
        	stmt.execute("DROP TABLE auth_roles");

            // テーブル作成
            stmt.execute("CREATE TABLE auth_users(user_name varchar(100), user_pass varchar(100))");
            stmt.execute("CREATE TABLE auth_roles(user_name varchar(100), role_name varchar(100))");

            // 登録
            stmt.execute("INSERT INTO auth_users(user_name,user_pass) VALUES('tomcat','tomcat')");
            stmt.execute("INSERT INTO auth_roles(user_name,role_name) VALUES('tomcat','setting')");
            stmt.execute("INSERT INTO auth_roles(user_name,role_name) VALUES('tomcat','login')");


            // 検索
            ResultSet rs = stmt.executeQuery("SELECT * FROM auth_roles");

            while(rs.next()) {
                System.out.println(rs.getString("user_name"));
                System.out.println(rs.getString("role_name"));
            }

            // テーブル削除
            //stmt.execute("DROP TABLE test");

        }
    }
}
