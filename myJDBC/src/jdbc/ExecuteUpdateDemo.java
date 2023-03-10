package jdbc;

import connectionUtil.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ExecuteUpdateDemo {

	public static void main(String[] args) {
		
		
		String sql="SELECT *" +"FROM[Northwind].[dbo].[Employees]";
		
		
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		try (
			Connection conn = connectionFactory.getConnection()){
			Statement stmt = conn.createStatement();
			boolean execute = stmt.execute(sql);
			System.out.println("是否有Result:"+execute);
		     
			if(execute) {
				ResultSet rs=stmt.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getString(3));
				
			}
			}else {
				int updateCount = stmt.getUpdateCount();
				System.out.println("新增了"+updateCount+"筆");
			
		     }
		
		
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		}	
	}
		
	
	
	
	
	

