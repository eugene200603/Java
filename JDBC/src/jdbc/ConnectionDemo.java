package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {
		try (
			Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Northwind;encrypt=false", "banana", "1234")){
			System.out.println("OK");
//			conn.close();
//			try {
//				Thread.sleep(10000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}