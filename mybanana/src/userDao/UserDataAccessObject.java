package userDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import bean.User;
import connUtil.ConnectionFactory;

public class UserDataAccessObject implements IUserDAO {   //DAO
//C
	@Override
	public boolean createUser(User user) {
		String sql="insert into [user] (account,pwd) values(?,?)";
		ConnectionFactory connFactory = new ConnectionFactory();
		try (Connection conn= connFactory.getConnection()){
		 PreparedStatement pstmt = conn.prepareStatement(sql);
		 pstmt.setString(1,user.getAccount());
		 pstmt.setString(2,user.getPwd());
		 int updateCount = pstmt.executeUpdate();
		if(updateCount<1) {
			return false;			
		}else {
			return true;
		}
		
	}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
	}
		return false;			
	}
		
//R
	@Override
public User findUserById(int id) {
	String sql="select id,account,pwd from [user] where id=?";
	ConnectionFactory connFactory=new ConnectionFactory();
	try (Connection conn = connFactory.getConnection()) {
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1,id);
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		User user=new User();
		user.setId(rs.getInt(1));
		user.setAccount(rs.getString(2));
		user.setPwd(rs.getString(3));
		return user;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}
		
	@Override
	public ArrayList<User> findAllUser(){
		return null;
	}
//U
	@Override
	public boolean updateUser(User user) {
		return false;
	}
	
//D
	@Override
	public boolean deleteUserById(int id) {
		return false;
	}
}
