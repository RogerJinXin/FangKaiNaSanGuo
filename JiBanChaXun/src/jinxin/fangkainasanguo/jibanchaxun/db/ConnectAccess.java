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
		 * ֱ������access�ļ���
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
		 * ����ODBC���ӷ�ʽ ��ν���ODBC���ӣ�
		 * ����windows�£�����ʼ��->��������塿->�����ܺ�ά����->�������ߡ�->������Դ����������Դ�������һ��ָ��a1.
		 * mdb�ļ�������Դ�� ���紴������ΪdataS1
		 */
		String dbur1 = "jdbc:odbc:dataS1";// ��ΪODBC���ӷ�ʽ
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
