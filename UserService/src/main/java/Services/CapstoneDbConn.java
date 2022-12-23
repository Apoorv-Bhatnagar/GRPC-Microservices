package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CapstoneDbConn {
    private static String url = "jdbc:postgresql://localhost:5432/GoConsult";
    private static String user = "postgres";
    private static String password = "akanksha";

	private CapstoneDbConn() {

	}

	public static Connection connectToDB() throws SQLException {
		Connection connection = null;
		connection = DriverManager.getConnection(url, user, password);
		return connection;
	}

}
