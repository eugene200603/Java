package module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetaDataDemo2 {

	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String user="banana";
		String pwd="1234";
		
		try(Connection conn=DriverManager.getConnection(url,user,pwd)){
			String sql="select[EmployeeID] as eID"
					+ "      ,[LastName]"
					+ "      ,[FirstName]"
					+ ",[Title] from Employees";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			System.out.println(metaData.getColumnCount());
			rs.next();
				
			for(int i=1;i<=metaData.getColumnCount();i++) {
				System.out.println(metaData.getColumnName(i)+":"+rs.getString(i));
				System.out.println(metaData.getColumnLabel(i)+":"+rs.getString(i));
				System.out.println(metaData.getColumnTypeName(i));
				System.out.println(metaData.getColumnDisplaySize(i));
				System.out.println(metaData.isNullable(i));
			}
		
			
	}
		 catch(SQLException e){
			 e.getMessage();
			 e.getErrorCode();
			 e.printStackTrace();
			 }
		
	}

}
