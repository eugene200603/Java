package jdbc;
import connectionUtil.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ExecuteUpdateDemo4 {

	public static void main(String[] args) {
		String sql=
				"insert into t2.dbo.student values"
				+"(?,?,?,?,?,?)";
		
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		try (
			Connection conn = connectionFactory.getConnection()){
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "s081");
			stmt.setString(2, "aaa");
			stmt.setString(3, "EE");
			stmt.setString(4, "m");
			stmt.setString(5,"0987654351");
			stmt.setString(6,"1987-6-5");
			
			int updateCount = stmt.executeUpdate();
			System.out.println("新增了"+updateCount+"筆資料");
		
		
		
		} catch (SQLException e) {			
			e.printStackTrace();
		}

	}

}
