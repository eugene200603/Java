package jdbc;
import connectionUtil.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ExecuteUpdateDemo3 {

	public static void main(String[] args) {
		String sql=
				"insert into t2.dbo.student values"
				+"('s006','Bob','EE','F','0987654321','2020-2-29')";
		
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		try (
			Connection conn = connectionFactory.getConnection()){
			Statement stmt = conn.createStatement();
			int updateCount = stmt.executeUpdate(sql);
			System.out.println("新增了"+updateCount+"筆資料");
		
		
		
		} catch (SQLException e) {			
			e.printStackTrace();
		}

	}

}
