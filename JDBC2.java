package Zadania;

/*Napisz program w którym:
Będziesz wpisywał nowe informacje do bazy danych wpisywane przez użytkownika
Wyświetlał informacje z bazy danych.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/skoczkowie";
			String user = "root";
			String pass = "kwiat23";

			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement stm = con
					.prepareStatement("insert into zawodnicy (id_skoczka,imie,nazwisko) values (?,?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("Podaj id_skoczka:");
			int id = sc.nextInt();
			stm.setInt(1, id);
			System.out.println("Podaj imie skoczka:");
			String imie = sc.next();
			stm.setString(2, imie);
			System.out.println("Podaj nazwisko skoczka:");
			String nazwisko = sc.next();
			stm.setString(3, nazwisko);

			stm.executeUpdate();
			ResultSet rs = stm.executeQuery("select * from zawodnicy");

			ResultSetMetaData md = rs.getMetaData();
			for (int i = 1; i <= md.getColumnCount(); i++) {
				System.out.printf("%20s" + "| \t", md.getColumnName(i));
			}
			System.out.println();
			for (int i = 1; i <= md.getColumnCount(); i++) {
				System.out.print("=====================");
			}
			System.out.println();
			while (rs.next()) {
				for (int i = 1; i <= md.getColumnCount(); i++) {
					// .out.printf("%20s" + "| \t",rs.getObject(i).toString());
					System.out.printf("%20s" + "| \t", rs.getString(i));
				}
				System.out.println();
			}
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Nie znaleziono klasy");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Błędny url,nazwa użytkownik lub hasło");
		} catch (Exception e) {

		}
	}
}
