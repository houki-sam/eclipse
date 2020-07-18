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

            // テーブル作成
            stmt.execute("CREATE TABLE test(id int, name varchar(100))");

            // 登録
            stmt.execute("INSERT INTO test(id, name) VALUES (1, 'Javaからテスト登録')");

            // 検索
            ResultSet rs = stmt.executeQuery("SELECT * FROM test");

            while(rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
            }

            // テーブル削除
            stmt.execute("DROP TABLE test");

        }
    }
}
