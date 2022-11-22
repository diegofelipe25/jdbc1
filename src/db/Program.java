package db;

import java.sql.Connection;

public class Program {

	public static void main(String[] args) {
		System.out.println("Start");
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}
}