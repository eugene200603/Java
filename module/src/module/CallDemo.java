package module;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CallDemo {

	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String user="banana";
		String pwd="1234";
		
		try(Connection conn=DriverManager.getConnection(url,user,pwd)){
			CallableStatement prepareCall=conn.prepareCall("{call get_customerid_and_order_date(?,?,?)}");
		prepareCall.setInt(1,10422);
		prepareCall.registerOutParameter(2,java.sql.Types.NCHAR);
		prepareCall.registerOutParameter(3,java.sql.Types.DATE);
		prepareCall.execute();
		System.out.println(prepareCall.getString(2));
		System.out.println(prepareCall.getString(3));
		
		}
      catch(SQLException e){e.printStackTrace();}
      
	}

}
