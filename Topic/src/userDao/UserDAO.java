package userDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.company;
import connUtil.ConnectionFactory;

public class UserDAO implements IUserDAO {// DAO

	// C
	@Override
	public boolean createCompany(company com) {
		String sql="insert into company ('統一編號','公司名稱','公司地址','核准日期') values(?,?,?,?)";
		ConnectionFactory connFactory = new ConnectionFactory();
		try (Connection conn = connFactory.getConnection()){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, com.getNum());
			pstmt.setString(2, com.getName());
			pstmt.setString(3, com.getAddress());
			pstmt.setString(4, com.getDate());
			
			int updateCount = pstmt.executeUpdate();
			if(updateCount<1) {
				return false;
			}else {
				return true;
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	// R
	@Override
	public company findUserByNumber(int num) {
		String sql = "select '統一編號','公司名稱','公司地址','核准日期' from company where num=?";
		ConnectionFactory connFactory = new ConnectionFactory();
		try (Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			company com = new company();
			com.setNum(rs.getInt(1));
			com.setName(rs.getString(2));
			com.setAddress(rs.getString(3));
			com.setDate(rs.getString(4));
			com.getNum();
			return com;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ArrayList<company> findAllCompany() {
		ArrayList<company> list = new ArrayList<>();
		String sql="select '統一編號','公司名稱','公司地址','核准日期' from company";
		ConnectionFactory connFactory = new ConnectionFactory();
		try(Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				company com = new company();
				com.setNum(rs.getInt(1));
				com.setName(rs.getString(2));
				com.setAddress(rs.getString(3));
				com.setDate(rs.getString(4));
				list.add(com);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// U
	@Override
	public boolean updateCompany(company com) {
		String sql="UPDATE company  SET '公司名稱' = ?"//1
				+ ",'公司地址' = ?"//2
				+ ",'核准日期' =?" //3
				+ " WHERE id= ?";//4
		ConnectionFactory connFactory = new ConnectionFactory();
		try(Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, com.getName());
			pstmt.setString(2, com.getAddress());
			pstmt.setString(3, com.getDate());
			pstmt.setInt(4, com.getNum());
			int updateCount = pstmt.executeUpdate();
			if(updateCount>=1) {
				return true;
			}else {
				return false;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;

	}

	// D
	@Override
	public boolean deleteUserByNumber(int num) {
		String sql="DELETE FROM company"
				+ "      WHERE id=?";
		ConnectionFactory connf = new ConnectionFactory();
		try(Connection conn = connf.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			int updatecount = pstmt.executeUpdate();
			if(updatecount>=1) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
}
