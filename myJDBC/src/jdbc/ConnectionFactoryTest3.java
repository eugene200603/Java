package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import connectionUtil.ConnectionFactory;
public class ConnectionFactoryTest3 {

	public static void main(String[] args) {
		ConnectionFactory connF= new ConnectionFactory();
		String lastname=JOptionPane.showInputDialog("Lastname");
		String firstname=JOptionPane.showInputDialog("FirstName");
		
		
		
		//read查詢
		String sql="SELECT [EmployeeID],[LastName],[FirstName]"
				+ "FROM [dbo].[Employees] where Lastname= ? and FirstName= ?";
	
		//Davolio  Nancy
		System.out.println(sql);
		
		
		try (
			Connection conn=connF.getConnection()) {
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, lastname);   //前數字代表第幾個?
			pstmt.setString(2, firstname);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("%3s %10s %10s %n",rs.getString(1),rs.getString(2),rs.getString(3));
				
			}
			
			
			
			System.out.println("OK");
		} catch (SQLException e) {
			
			e.printStackTrace();
		} {
			
		}

	}

}
