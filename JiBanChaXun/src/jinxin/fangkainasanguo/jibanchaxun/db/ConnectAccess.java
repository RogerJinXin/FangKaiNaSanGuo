package jinxin.fangkainasanguo.jibanchaxun.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 
 * @author JinXin
 *
 */
public class ConnectAccess {
	/**
	 * 
	 * @throws Exception
	 */
	public void ConnectAccessFile() throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		/**
		 * 直接连接access文件。
		 */
		String dbur1 = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=d://a1.mdb";
		Connection conn = DriverManager.getConnection(dbur1, "username", "password");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Table1");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
		rs.close();
		stmt.close();
		conn.close();
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void ConnectAccessDataSource() throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		/**
		 * 采用ODBC连接方式 如何建立ODBC连接？
		 * 答：在windows下，【开始】->【控制面板】->【性能和维护】->【管理工具】->【数据源】，在数据源这里添加一个指向a1.
		 * mdb文件的数据源。 比如创建名字为dataS1
		 */
		String dbur1 = "jdbc:odbc:dataS1";// 此为ODBC连接方式
		Connection conn = DriverManager.getConnection(dbur1, "username", "password");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Table1");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
		rs.close();
		stmt.close();
		conn.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
