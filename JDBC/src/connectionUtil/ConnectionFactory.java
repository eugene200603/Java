package connectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
        private  String url="jdbc:sqlserver://localhost:1433;databaseName=Northwind;encrypt=false";
        private  String user="banana";
        private  String pwd="1234";
        
        public  Connection getConnection() throws SQLException  {        	
        	return DriverManager.getConnection(url,user,pwd);
        }
        
}
