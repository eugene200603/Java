package module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class BatchDemo {

	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String user="banana";
		String pwd="1234";
		
		try(Connection conn=DriverManager.getConnection(url,user,pwd)){
			String sql="insert into mycustomer(name) values(?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//版本1
			String name="";
			while((name=JOptionPane.showInputDialog("name"))!=null) {
				pstmt.setString(1,name);
				pstmt.addBatch();
			}
			pstmt.executeBatch();
			System.out.println("OK");
			
			//版本2
//			pstmt.setString(1,"ae");
//			pstmt.addBatch();
//			pstmt.setString(1,"af");
//			pstmt.addBatch();
//			pstmt.setString(1,"ag");
//			pstmt.addBatch();
//			pstmt.setString(1,"ah");
//			pstmt.addBatch();
//			pstmt.setString(1,"ai");
//			pstmt.addBatch();
//			
//	        pstmt.executeBatch();
//	        System.out.println("OK");
			
			
			
			
			
			
			
			//靜態
//			String sql = "insert into MyCustomer(name) values('Bob5')";
//			stmt.addBatch("Update MyCustomer set name = 'Bob6' where id=2");
//			stmt.addBatch("Update MyCustomer set name = 'Bob7' where id=3");
//			stmt.addBatch("insert into MyCustomer(name) values('Bob8')");			
//			stmt.addBatch("insert into MyCustomer(name) values('Bob9')");
//			stmt.addBatch("delete  MyCustomer where id=4");
//		
//			int[] executeBatch = stmt.executeBatch();
//			for(int i=0;i<executeBatch.length;i++) {
//				int j=executeBatch[i];
//				System.out.println(j);
//			}
			
			
			
			
		}
		
		
		catch(SQLException e){
			 e.getMessage();
			 e.getErrorCode();
			 e.printStackTrace();
			 }
		
		
		
	}

}
