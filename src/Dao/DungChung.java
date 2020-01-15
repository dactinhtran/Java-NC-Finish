package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DungChung {
	public Connection cn;
	public void KetNoi() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dburl = "jdbc:sqlserver://DESKTOP-OS3NA36\\SQLEXPRESS:1433;databaseName=TestThiJavaNC;user=sa; password=123";
			cn = DriverManager.getConnection(dburl);
		} catch (Exception tt) {
			System.out.println(tt.getMessage());
			tt.printStackTrace();
		}
	}
}
