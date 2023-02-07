package module;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DBtoFile {

	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String user="banana";
		String pwd="1234";
		
		try(Connection conn=DriverManager.getConnection(url,user,pwd)){
			String sql="select fileName,Myfile from [fileTable] where filename='aaa.jpg'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("rs.getString(1)");
				FileOutputStream fos=new FileOutputStream("C://java//123.jpg");
				InputStream binaryStream=rs.getBinaryStream(2);
				int data=0;
				while((data=binaryStream.read())!=-1){
					fos.write(data);
				}
			
			fos.flush();//沖出=>記憶體裡面的資料沖出到檔案中
			fos.close();
			binaryStream.close();
			System.out.println("OK");
			}	
		}
		 catch(SQLException e){e.printStackTrace();}
		catch(IOException e){e.printStackTrace();}
	}

}
