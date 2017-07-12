package Zadania;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBC1 {

	public static void main(String[] args) {
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/skoczkowie";
		String user = "root";
		String pass = "kwiat23";

		Connection con = DriverManager.getConnection(url, user, pass);
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from zawodnicy");
		
		
		
		ResultSetMetaData md = rs.getMetaData();
		for (int i = 1; i <= md.getColumnCount(); i++) {
			System.out.printf("%20s" + "| \t", md.getColumnName(i));
		}
		System.out.println();
		for (int i = 1; i <= md.getColumnCount(); i++) {
			System.out.print("========================");
		}
		System.out.println();
		while (rs.next()) {
			for (int i = 1; i <= md.getColumnCount(); i++) {
				System.out.printf("%20s" + "| \t", rs.getString(i));
			}
			System.out.println();
		}
		
		con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
